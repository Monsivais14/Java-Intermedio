package clase_17;

import java.util.Scanner;

public class Clase_17_2 {

    public static void main(String[] args) { //ecuaciones cuadraticas

        Scanner in = new Scanner(System.in);

        int a, b, c;
        int x1, x2;

        System.out.print("Valor de a: ");
        a = in.nextInt();
        
        System.out.print("Valor de b: ");
        b = in.nextInt();
        
        System.out.print("Valor de c: ");
        c = in.nextInt();
        
        x1 =(int) ((-b) + (Math.sqrt((Math.pow(b,2))-(4*a*c)))) / (2*a);
        x2 =(int) ((-b) - (Math.sqrt((Math.pow(b,2))-(4*a*c)))) / (2*a);
        
        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);
    }
}
