/*
simular un cajero automatico
dando la cantidad de billetes & monedas que se entregaran
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){

        int num, cien=10,cincuenta=0,veinte=0,diez=0,cinco=0,uno=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite un valor: ");
        num = in.nextInt();

        Ejercicio6 eje6 =  new Ejercicio6();
        tipoCambio(num,eje6,eje6,eje6,eje6,eje6,eje6);
        cien = eje6.c100;
        cincuenta = eje6.c50;
        veinte = eje6.c20;
        diez = eje6.c10;
        cinco = eje6.c5;
        uno = eje6.c1;

        System.out.println("Cantidad de billetes como cambio: ");
        System.out.println("Cien: "+ cien);
        System.out.println("Cincuenta: "+cincuenta);
        System.out.println("Veinte: "+veinte);
        System.out.println("Diez: "+diez);
        System.out.println("Cinco: "+cinco);
        System.out.println("Uno: "+uno);
    }
    private int c100;
    private int c50;
    private int c20;
    private int c10;
    private int c5;
    private int c1;

    private static void tipoCambio(int num, Ejercicio6 cien , Ejercicio6 cincuenta, Ejercicio6 veinte, Ejercicio6 diez, Ejercicio6 cinco, Ejercicio6 uno){
        cien.c100 = num/100;
        num%=100;

        cincuenta.c50 = num/50;
        num%=50;

        veinte.c20 = num/20;
        num%=20;

        diez.c10 = num/10;
        num%=10;

        cinco.c5 = num/5;
        uno.c1 = num % 5;
    }
}