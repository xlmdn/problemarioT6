/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

import java.util.Scanner;

public class gauss_seidel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz y el vector de resultados: ");
        int n = scanner.nextInt();

        double[][] matrizA = new double[n][n];
        double[] vectorB = new double[n];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Ingrese el vector de resultados b:");
        for (int i = 0; i < n; i++) {
            vectorB[i] = scanner.nextDouble();
        }

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("Vector b:");
        imprimirVector(vectorB);

        double[] vectorX = new double[n];
        double[] vectorXNuevo = new double[n];
        int maxIteraciones = 1000;
        double tolerancia = 1e-6;

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += matrizA[i][j] * vectorXNuevo[j];
                    }
                }
                vectorXNuevo[i] = (vectorB[i] - suma) / matrizA[i][i];
            }
            if (norma(restar(vectorXNuevo, vectorX)) < tolerancia) {
                vectorX = vectorXNuevo.clone();
                break;
            }
            vectorX = vectorXNuevo.clone();
        }

        System.out.println("La solución al sistema de ecuaciones es:");
        imprimirVector(vectorX);
    }

    public static double norma(double[] v) {
        double suma = 0.0;
        for (double num : v) {
            suma += num * num;
        }
        return Math.sqrt(suma);
    }

    public static double[] restar(double[] v1, double[] v2) {
        int n = v1.length;
        double[] resultado = new double[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirVector(double[] vector) {
        for (double num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
