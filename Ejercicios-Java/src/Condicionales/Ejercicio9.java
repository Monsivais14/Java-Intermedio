package Condicionales;//Concertir un numero a romano

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){

        int num,u,d,c,m;
        Scanner in = new Scanner(System.in);

        System.out.println("Digna un numero");
        num = in.nextInt();

        u = num%10; num /=10;           //saca el mod para determinar el primer switch
        d = num%10; num /=10;
        c = num%10; num /=10;           //utiliza la siguiente operacion para determinar el siguiente switch
        m = num%10; num /=10;

        switch(m){
            case 1: System.out.print("M"); break;
            case 2: System.out.print("MM"); break;
            case 3: System.out.print("MMM"); break;
        }
        switch (c){
            case 1: System.out.print("C"); break;
            case 2: System.out.print("CC"); break;
            case 3: System.out.print("CCC"); break;
            case 4: System.out.print("CD"); break;
            case 5: System.out.print("D"); break;
            case 6: System.out.print("DC"); break;
            case 7: System.out.print("DCC"); break;
            case 8: System.out.print("DCCC"); break;
            case 9: System.out.print("CM"); break;
        }
        switch (d){
            case 1: System.out.print("X"); break;
            case 2: System.out.print("XX"); break;
            case 3: System.out.print("XXX"); break;
            case 4: System.out.print("XL"); break;
            case 5: System.out.print("L"); break;
            case 6: System.out.print("LX"); break;
            case 7: System.out.print("LXX"); break;
            case 8: System.out.print("LXXX"); break;
            case 9: System.out.print("XL"); break;
        }
        switch (u){
            case 1: System.out.print("I"); break;
            case 2: System.out.print("II"); break;
            case 3: System.out.print("III"); break;
            case 4: System.out.print("IV"); break;
            case 5: System.out.print("V"); break;
            case 6: System.out.print("VI"); break;
            case 7: System.out.print("VII"); break;
            case 8: System.out.print("VIII"); break;
            case 9: System.out.print("IX"); break;
        }
    }
}
