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

        // Ejecutar el método de Euler
        euler(x0, y0, h, n);
    }
}
