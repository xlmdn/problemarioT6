package Tema4;
public class simpson3 {
    public static void main(String[] args) {
        // función 2x + 10 en a=1, b=3
        double a,b,f1,f2,f3,f4,res,h,c,d;
        a=1;
        b=3;
        h=(b-a)/3;
        c=a+h;
        d=c+h;
        f1=2*a+10;
        f2=2*c+10;
        f3=2*d+10;
        f4=2*b+10;
        res=(3*h/8)*(f1+3*f2+3*f3+f4);
        System.out.println("El área bajo la curva es: "+res);
    }
}