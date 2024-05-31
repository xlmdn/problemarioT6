package Tema5;

import java.util.Scanner;

public class lineal {

    public static double interpolacionLineal(double x0, double y0, double x1, double y1, double x) {
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

        // Calcular y con interpolación lineal utilizando el método interpolacionLineal
        double y = interpolacionLineal(x0, y0, x1, y1, x);

        System.out.println("El valor interpolado de y es: " + y);

        scanner.close();
    }
}