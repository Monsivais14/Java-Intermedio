
package clase_36;

import java.util.Scanner;

public class Clase_36_2 {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int sueldo,mayores=0,neto=0;
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Ingresa un sueldo ("+i+"): ");
            sueldo = in.nextInt();
            
            if(sueldo>=1000){
                mayores++;
            }
            neto+=sueldo;
        }
        
        System.out.println("Hay "+mayores+" mayores a 1000 y son "+neto+" en total");
        
    }
    
}
