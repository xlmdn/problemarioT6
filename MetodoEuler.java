import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Scanner;

public class MetodoEuler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descripción y entrada de datos
        System.out.println("Resolucion de Ecuaciones Diferenciales por Metodo Euler");
        System.out.print("Ingrese la función que acompaña la EDO (por ejemplo, 2*x*y): ");
        String funcion = scanner.nextLine();
        System.out.print("Ingrese el valor de X inicial: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese el valor de X final: ");
        double xf = scanner.nextDouble();
        System.out.print("Ingrese el valor de Y inicial: ");
        double y = scanner.nextDouble();
        System.out.print("Ingrese el paso: ");
        double h = scanner.nextDouble();

        int n = (int) ((xf - x) / h);
        System.out.println(" x    y");

        for (int i = 0; i <= n; i++) {
            double y1 = evaluarFuncion(funcion, x, y);
            double hy1 = h * y1;
            System.out.printf("%0.1f %0.4f%n", x, y);
            y += hy1;
            x += h;
        }

        scanner.close();
    }

    // Método para evaluar la función ingresada por el usuario
    public static double evaluarFuncion(String funcion, double x, double y) {
        Expression e = new ExpressionBuilder(funcion)
                .variables("x", "y")
                .build()
                .setVariable("x", x)
                .setVariable("y", y);
        return e.evaluate();
    }
}
