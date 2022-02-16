/*
Crear un rpogtrama que convierta
segundos a horas, minutos y segundos
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int tseg,h=0,m=0,s=0;

        System.out.print("Digite el total de segundos: ");
        tseg = in.nextInt();

        Ejercicio7 eje7 = new Ejercicio7();
        tiempo(tseg,eje7,eje7,eje7);
        h = eje7.h;
        m = eje7.m;
        s = eje7.s;
        System.out.println("Tiempo equivalente: ");
        System.out.println("Horas: "+h);
        System.out.println("Minutos: "+m);
        System.out.println("Segundos: "+s);
    }
    private int h;
    private int m;
    private int s;
    private static void tiempo(int tseg,Ejercicio7 h,Ejercicio7 m,Ejercicio7 s){
        h.h = tseg/3600;
        tseg%=3600;

        m.m = tseg/60;
        s.s = tseg%60;
    }
}
