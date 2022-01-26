
package clase_46;

import java.util.Scanner;

public class Clase_46 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a[],b[],c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[a.length+b.length];
        
        System.out.println("Arreglo A:");
        for (int i=0;i<10;i++) {
            System.out.print("("+(i+1)+")Digite un numero:");
            a[i] = in.nextInt();
        }
        
        System.out.println("Arreglo B:");
        for (int i=0;i<10; i++) {
            System.out.print("("+(i+1)+")Digite un numero:");
            b[i] = in.nextInt();
        }
        
        System.out.println("Combinamos arreglos");
        int j=0;
        for (int i=0;i<10;i++) {
            c[j] = a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        
        System.out.println("Arreglo C:");
        for (int i : c) {
            System.out.println("["+i+"]");
        }
    }
}
