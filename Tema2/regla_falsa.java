/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema2;

/**
 *
 * @author Axel Madin
 */
public class regla_falsa {

    /**
     * @param args the command line arguments
     */
    //Funcion x^2-10
    static double funcion(double x) {
        return x * x - 10;
    }

    static double reglaFalsa(double a, double b, double tolerancia) {
        double x;
        int iteracion = 1;

        do {
            
            x = (a * funcion(b) - b * funcion(a)) / (funcion(b) - funcion(a));
            System.out.println("Iteración " + iteracion + ": x = " + x);
            if (funcion(a) * funcion(x) < 0) {
                b = x;
            } else {
                a = x;
            }
            iteracion++;

        } while (Math.abs(funcion(x)) > tolerancia);

        return x;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 4;
        double tolerancia = 0.05 * Math.abs(b - a); 
        double raiz = reglaFalsa(a, b, tolerancia);
        System.out.println("\nLa raíz aproximada es: " + raiz);
    }
    
}
