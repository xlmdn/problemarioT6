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


## Método Taylor

- [Descripción](#descripción-Taylor)
- [Algoritmo](#algoritmo-Taylor)
- [Ejemplos](#ejemplos-Taylor)
- [Implementación](#implementación-Taylor)

## Método Runge-Kutta

- [Descripción](#descripción-Runge-Kutta)
- [Algoritmo](#algoritmo-Runge-Kutta)
- [Ejemplos](#ejemplos-Runge-Kutta)
- [Implementación](#implementación-Runge-Kutta)

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
El método de Taylor para resolver ecuaciones diferenciales es una técnica numérica que utiliza la serie de Taylor para aproximar la solución de una ecuación diferencial ordinaria (EDO). Este método es una generalización del método de Euler y es más preciso porque incluye términos adicionales de la serie de Taylor.



![image](https://github.com/xlmdn/problemario-T3/assets/147437527/cbc804db-93e2-4745-b277-2340825edc2a)

### Algoritmo Taylor

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/23e1509a-e141-4d32-bb06-90405a266cb0)


### Implementación Taylor

public class MetodoTaylor {

    // Definición de la función f(x, y) para la EDO dy/dx = y - x^2 + 1
    public static double f(double x, double y) {
        return y - x * x + 1;
    }

    // Segunda derivada de y respecto a x para la EDO dy/dx = y - x^2 + 1
    public static double f2(double x, double y) {
        // f'(x, y) = (y - x^2 + 1) - 2x
        return f(x, y) - 2 * x;
    }

    // Método de Taylor de segundo orden
    public static void taylor(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.println("Resolvemos la ecuación diferencial dy/dx = y - x^2 + 1 usando el método de Taylor de segundo orden.");
        System.out.printf("x0 = %.4f, y0 = %.4f%n", x, y);

        // Iteración del método de Taylor
        for (int i = 1; i <= n; i++) {
            y = y + h * f(x, y) + (h * h / 2) * f2(x, y);
            x = x + h;
            System.out.printf("x%d = %.4f, y%d = %.4f%n", i, x, i, y);
        }
    }

    public static void main(String[] args) {
        // Valores iniciales
        double x0 = 0.0;  // x inicial
        double y0 = 0.5;  // y inicial
        double h = 0.1;   // Tamaño del paso
        int n = 10;       // Número de pasos

        // Ejecutar el método de Taylor
        taylor(x0, y0, h, n);
    }
}


### Ejemplo Taylor

## Ejemplo 1

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/9f2e776b-a547-4a2a-bc90-e4530298553d)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/59709e00-884e-48eb-8c01-9d8eead15475)



## Método Runge-Kutta
### Descripción Runge-Kutta

El método de Runge-Kutta es una familia de métodos iterativos para resolver ecuaciones diferenciales ordinarias (EDOs). Entre estos, el más comúnmente utilizado es el método de Runge-Kutta de cuarto orden, conocido como RK4. Estos métodos son populares debido a su precisión y estabilidad.

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/911a718e-e3f1-47c1-9dff-43f91e9ba015)


### Algoritmo Runge-Kutta

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/f5ffdfa6-f741-4262-9c1b-7a2a30c85b01)


### Implementación Runge-Kutta

public class MetodoRungeKutta {

    // Definición de la función f(x, y) para la EDO dy/dx = 3x^2 + y
    public static double f(double x, double y) {
        return 3 * x * x + y;
    }

    // Método de Runge-Kutta de cuarto orden
    public static void rungeKutta(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;

        System.out.println("Resolvemos la ecuación diferencial dy/dx = 3x^2 + y usando el método de Runge-Kutta de cuarto orden.");
        System.out.printf("x0 = %.4f, y0 = %.4f%n", x, y);

        for (int i = 1; i <= n; i++) {
            double k1 = h * f(x, y);
            double k2 = h * f(x + h / 2.0, y + k1 / 2.0);
            double k3 = h * f(x + h / 2.0, y + k2 / 2.0);
            double k4 = h * f(x + h, y + k3);

            y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);
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

        // Ejecutar el método de Runge-Kutta
        rungeKutta(x0, y0, h, n);
    }
}


### Ejemplo Runge-Kutta

## Ejemplo 1

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/b6f5b0df-b0c4-452b-ad3f-136a657d53d3)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario-T3/assets/147437527/e3f35906-8ccd-4d09-89d1-ceaf4f719c0b)





Esperamos que este repositorio de Métodos Numéricos Tema 6 - Soluciones de Ecuaciones Diferenciales haya sido una herramienta valiosa en tu aprendizaje y comprensión de las técnicas numéricas para resolver ecuaciones diferenciales.

Hemos recorrido juntos una serie de métodos fundamentales, desde el sencillo pero poderoso Método de Euler, pasando por el preciso Método de Taylor, hasta el robusto y ampliamente utilizado Método de Runge-Kutta. Cada uno de estos métodos tiene sus aplicaciones y ventajas, y esperamos que las implementaciones y ejemplos proporcionados te hayan ayudado a entender mejor sus mecanismos y usos.

Queremos agradecerte por dedicar tiempo a explorar este repositorio. La solución de ecuaciones diferenciales es una habilidad crucial en muchas disciplinas, y dominar estos métodos puede abrirte puertas a nuevas oportunidades en la física, ingeniería, economía y más.

Recuerda que la práctica y la curiosidad son tus mejores aliados en el camino del aprendizaje. No dudes en experimentar con los algoritmos, probar nuevos casos y seguir profundizando en este fascinante campo.

¡Gracias por ser parte de esta comunidad de aprendizaje y esperamos verte en futuros proyectos y exploraciones!

¡Buena suerte y sigue adelante con tu viaje en el mundo de los métodos numéricos!