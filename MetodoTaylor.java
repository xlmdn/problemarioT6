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
