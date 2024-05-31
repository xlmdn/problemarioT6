package Tema4;
public class trapecio {
    public static void main(String[] args) {
        //funcion 2x+ 10 en a=1 b=3
        int a,b,fa,fb,res;
        a=1;
        b=3;
        fa =2*a+10;
        fb=2*b+10;
        res=(b-a)*((fa+fb)/2);
        System.out.println("El area del trapecio es: "+res);
    }
}