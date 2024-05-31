package Tema5;

import java.util.Scanner;

public class cuadratico {
    
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
}