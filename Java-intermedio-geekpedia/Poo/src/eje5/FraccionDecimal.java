package eje5;

import java.util.Scanner;

public class FraccionDecimal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("Decimal: ");
        double num = in.nextDouble();

        if (num <= 1) {
            m.Decimal(num, 1000);
        }else if(num>=1.1){
            m.Decimal(num, 1000);
        }
        
    }

}
