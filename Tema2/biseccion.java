package Tema2;

public class biseccion {
    
    public static void main(String[] args) {
        System.out.println("Ecuacion x^3 - 2");
        double a = 0.0; 
        double b = 2.0; 
        double error = 0.0001; 

        double raiz = metodoBiseccion(a, b, error);

        System.out.println("La raíz aproximada es: " + raiz);
    }

    
    private static double metodoBiseccion(double a, double b, double error) {
        double c = 0.0;

        while ((b - a) >= error) {
            c = (a + b) / 2.0;

            if (funcion(c) == 0.0) {
                break;
            }

            if (funcion(c) * funcion(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        return c;
    }

    // Funcion x^3 - 2
    private static double funcion(double x) {
        return Math.pow(x, 3) - 2;
    }
    
}