
package clase_17;

import java.util.Scanner;

public class Clase_17 { //horas a equivalentes
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int horas_totales,semanas,dias,horas;
        
        System.out.println("Horas totales: ");
        horas_totales = in.nextInt();
        
        semanas = horas_totales/(24*7); //24*7 es el numero de horas a la semana
        dias = horas_totales%(24*7)/24; //24 es referencia a 24 horas por dia 
        //el resudio de las horas totales sirven para calcular los dias que
        //quedan sobrantes en uan semana completa
        horas = horas_totales%24;
        
        System.out.println("el equivalente es: ");
        System.out.println("Semanas : "+semanas);
        System.out.println("Dias : "+dias);
        System.out.println("Horas : "+horas);
    }
    
}
