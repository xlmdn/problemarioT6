## Repositorio de Problemas y Programas de Métodos Numéricos


¡Bienvenido al repositorio de Métodos Numéricos Tema 3 - Métodos de Interpolación!

Este repositorio está diseñado para proporcionarte acceso a una variedad de algoritmos, programas y pruebas de ejecución que abordan el emocionante tema de la interpolación.

La interpolación es una técnica fundamental en el campo de los métodos numéricos que se utiliza para estimar valores intermedios dentro de un conjunto de datos conocidos. En esencia, busca construir una función que pase a través de los puntos de datos proporcionados, permitiendo así predecir o estimar valores para puntos que no están explícitamente dados.

Entre los métodos de interpolación más comunes que encontrarás en este repositorio se incluyen:

1. *Interpolación Lineal:* Este método conecta dos puntos conocidos con una línea recta y estima el valor intermedio a lo largo de esta línea.
  
2. *Interpolación Polinómica:* Aquí, se ajusta un polinomio a través de los puntos de datos, lo que permite una mayor flexibilidad en la estimación de valores intermedios.
  
3. *Interpolación de Lagrange:* Este método construye un polinomio único que pasa a través de todos los puntos de datos conocidos, proporcionando una forma elegante de interpolar valores.
  
4. *Interpolación de Newton:* Similar a la interpolación de Lagrange, este método también encuentra un polinomio que pasa a través de los puntos de datos conocidos, pero utilizando diferencias divididas para simplificar el proceso de construcción del polinomio.

En este repositorio, no solo encontrarás la teoría detrás de cada método de interpolación, sino también implementaciones prácticas en forma de programas y algoritmos. Además, se proporcionan pruebas de ejecución detalladas que te guiarán a través del proceso de aplicación de cada método, brindándote una comprensión profunda y práctica de su funcionamiento.

¡Explora el repositorio y sumérgete en el emocionante mundo de la interpolación!

## Contenido del Repositorio

## Método Lineal

- [Descripción](#descripción-lineal)
- [Algoritmo](#algoritmo-lienal)
- [Ejemplos](#ejemplos-lineal)
- [Implementación](#implementacionlineal)


## Método Cuadratico

- [Descripción](#descripción-gauss-seidel)
- [Algoritmo](#algoritmo-gauss-seidel)
- [Ejemplos](#ejemplos-gauss-seidel)
- [Implementación](#implementación-gauss-seidel)


---

## Método Lineal

### Descripción lineal

La interpolación lineal es útil cuando buscamos un valor entre puntos dados. Se puede considerar como "llenar los espacios" de una tabla de datos. La estrategia para la interpolación lineal es usar una línea recta para conectar los datos conocidos a ambos lados del punto desconocido

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/a9087117-3c63-458c-a633-6f811e2c81bb)


### Algoritmo lineal

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/becee10b-de29-4d5e-918e-0ab98d50b0b2)


## Implementacion lineal

    public static double interpolar(double x0, double y0, double x1, double y1, double x) {
        // Fórmula de interpolación lineal
        double y = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los puntos
        System.out.print("Ingrese x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("Ingrese y0: ");
        double y0 = scanner.nextDouble();
        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese x para interpolar y: ");
        double x = scanner.nextDouble();

        // Calcular y con interpolación lineal
        double y = interpolar(x0, y0, x1, y1, x);

        System.out.println("El valor interpolado de y es: " + y);

        scanner.close();
    }

## Ejemplos lineal

## Ejemplo 1

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/e8921924-b8ec-460b-98e0-b8dbf0510373)

## Ejemplo 2

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/42b2838f-9da8-4366-abcb-bbdd97c9e316)





## Método Cuadratico

### Descripción Cuadratico

La interpolación cuadrática consiste en hacer la interpolación con un polinomio de segundo grado en vez de un polinomio de grado 1. Por tanto, en este caso se utiliza una función cuadrática o parábola.

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/5aeec2ca-2bf3-4c74-a5ae-af2c0ab5ef4f)

En general, la interpolación de segundo orden es más precisa que la de primer orden, ya que es de mayor grado. Por contra, se necesita un punto más para poder llevar a cabo la interpolación.

El matemático Lagrange desarrolló una fórmula para hallar la función interpoladora de orden n-ésimo. Para el caso de orden 2, el polinomio interpolador de Lagrange es el siguiente:


![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/c2f7b6f0-1212-4f3d-b009-c92f52b2ef96)



### Algoritmo Cuadratico

![image](https://github.com/xlmdn/Problemario_T5/assets/147437527/9b295337-a942-44a9-bc2c-e2eb381fda9e)


## Implementación cuadratico


     public static double interpolacionCuadratica(double x0, double x1, double x2, double y0, double y1, double y2, double x) {
        double L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2));
        double L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2));
        double L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1));
        
        double y = (y0 * L0) + (y1 * L1) + (y2 * L2);
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese los valores conocidos
        System.out.println("Ingrese el valor de x0:");
        double x0 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de x1:");
        double x1 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de x2:");
        double x2 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de y0:");
        double y0 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de y1:");
        double y1 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de y2:");
        double y2 = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese el valor de x para interpolar
        System.out.println("Ingrese el valor de x para interpolar:");
        double x = scanner.nextDouble();
        
        // Calcula el valor interpolado
        double y = interpolacionCuadratica(x0, x1, x2, y0, y1, y2, x);
        
        // Imprime el resultado
        System.out.println("El valor interpolado para x = " + x + " es y = " + y);
        
        scanner.close();
    }

### Ejemplos Cuadratico

## Ejemplo 

![image](https://github.com/xlmdn/prueba/assets/147437527/12d8ad21-6a27-41b7-93dc-55e8ee3af5e3)





## Contribuciones y Retroalimentación:

Este repositorio es un recurso en constante evolución, y tu contribución es fundamental para mejorarlo. Si tienes sugerencias, correcciones o nuevos recursos que te gustaría compartir, no dudes en hacer una contribución al repositorio. Además, apreciamos cualquier retroalimentación que tengas sobre tu experiencia utilizando este material.

¡Esperamos que este repositorio sea una herramienta valiosa para tu estudio y práctica de Métodos Numéricos! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en ponerte en contacto.

¡Que disfrutes explorando el mundo de los Métodos Numéricos!

Atentamente, 

Axel Madin