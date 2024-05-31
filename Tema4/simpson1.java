package Tema4;
public class simpson1 {
    public static void main(String[] args) {
        // función 2x^2 + 10 en a=1, b=3
        int a, b, fa, fb;
        double fq, fqq,res;
        a = 1;
        b = 3;
        fa = 2 *(a*a) + 10;
        fb = 2 * (b*b) + 10;
        fq = (a + b) / 2.0; // Usar double para evitar truncamiento
        fqq = 2 * (fq*fq) + 10;
        res = (int) ((b - a) / 6.0 * (fa + 4 * fqq + fb)); // Convertir a int al final
        System.out.println("El área bajo la curva es: " + res);
        System.out.println("hola mundo commit");
    }
}