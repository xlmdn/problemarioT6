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
