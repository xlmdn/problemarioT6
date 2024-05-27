## Repositorio de Problemas y Programas de Métodos Numéricos
¡Bienvenido al repositorio de Métodos Numéricos Tema 6 - Soluciones de Ecuaciones Diferenciales!

Este repositorio está diseñado para proporcionarte acceso a una variedad de algoritmos, programas y pruebas de ejecución que abordan el fascinante tema de la solución de ecuaciones diferenciales.

La solución de ecuaciones diferenciales es una técnica crucial en el campo de los métodos numéricos, utilizada para modelar fenómenos en campos como la física, la ingeniería y la economía. Las ecuaciones diferenciales describen cómo cambia una cantidad en relación con otra, y resolverlas nos permite predecir el comportamiento del sistema bajo estudio.

Entre los métodos de solución de ecuaciones diferenciales más comunes que encontrarás en este repositorio se incluyen:

Método de Taylor: Este método utiliza una serie de Taylor para aproximar la solución de una ecuación diferencial. Al expandir la función solución en una serie infinita, se pueden obtener aproximaciones muy precisas al truncar la serie después de un número finito de términos.

Método de Euler: Uno de los métodos más simples para resolver ecuaciones diferenciales. Se basa en una aproximación lineal utilizando la pendiente de la función. Aunque es menos preciso que el método de Taylor, es fácil de implementar y puede proporcionar buenas aproximaciones para pequeños intervalos de tiempo.

En este repositorio, no solo encontrarás la teoría detrás de cada método de solución de ecuaciones diferenciales, sino también implementaciones prácticas en forma de programas y algoritmos. Además, se proporcionan pruebas de ejecución detalladas que te guiarán a través del proceso de aplicación de cada método, brindándote una comprensión profunda y práctica de su funcionamiento.

¡Explora el repositorio y sumérgete en el apasionante mundo de la solución de ecuaciones diferenciales!

## Contenido del Repositorio

## Método Euler

- [Descripción](#descripción-Euler)
- [Algoritmo](#algoritmo-Euler)
- [Ejemplos](#ejemplos-Euler)
- [Implementación](#implementacion-Euler)


## Método Cuadratico

- [Descripción](#descripción-gauss-seidel)
- [Algoritmo](#algoritmo-gauss-seidel)
- [Ejemplos](#ejemplos-gauss-seidel)
- [Implementación](#implementación-gauss-seidel)

## Método Euler
### Descripción Euler
El método de Euler es un método de primer orden, lo que significa que el error local es proporcional al cuadrado del tamaño del paso, y el error global es proporcional al tamaño del paso. El método de Euler regularmente sirve como base para construir métodos más complejos.

![image](https://github.com/xlmdn/Problemario5/assets/147437527/807dde53-8de0-4521-9207-66509abbbde1)

### Algoritmo Euler

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/82614b5a-27fc-4dcf-8f77-d747ae3542a2)

### Implementación Euler

        public class MetodoEuler {

    // Definición de la función f(x, y)
    public static double f(double x, double y) {
        return x + y;
    }

    // Método de Euler
    public static void euler(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.printf("x0 = %.4f, y0 = %.4f%n", x, y);

        // Iteración del método de Euler
        for (int i = 1; i <= n; i++) {
            y = y + h * f(x, y);
            x = x + h;
            System.out.printf("x%d = %.4f, y%d = %.4f%n", i, x, i, y);
        }
    }

    public static void main(String[] args) {
        // Valores iniciales
        double x0 = 0.0;  // x inicial
        double y0 = 1.0;  // y inicial
        double h = 0.1;   // Tamaño del paso
        int n = 10;       // Número de pasos

        // Imprimir la ecuación diferencial
        System.out.println("Resolvemos la ecuación diferencial dy/dx = x + y usando el método de Euler.");

        // Ejecutar el método de Euler
        euler(x0, y0, h, n);
    }
}


### Ejemplo Euler

## Ejemplo 1

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/003db495-df23-43f8-9579-e977f957f111)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/3e566179-49a9-40aa-8a36-1b63f75da4a0)


## Método Taylor
### Descripción Taylor
El método de Euler es un método de primer orden, lo que significa que el error local es proporcional al cuadrado del tamaño del paso, y el error global es proporcional al tamaño del paso. El método de Euler regularmente sirve como base para construir métodos más complejos.

![image](https://github.com/xlmdn/Problemario5/assets/147437527/807dde53-8de0-4521-9207-66509abbbde1)

### Algoritmo Taylor



### Implementación Taylor


### Ejemplo Taylor