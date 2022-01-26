package clase_45;

import java.util.Scanner;

public class Clase_45_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] n = new int[10];

        for (int i=0;i<n.length;i++) {
            System.out.print("Ingresa un valor ("+(i+1)+") entero: ");
            n[i] = in.nextInt();
        }
        
        System.out.println(n[0]);
        System.out.println(n[9]);
        System.out.println(n[1]);
        System.out.println(n[8]);
        System.out.println(n[2]);
    }

}
