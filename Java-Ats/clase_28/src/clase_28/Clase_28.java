
package clase_28;

import java.util.Scanner;

public class Clase_28 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cantidad: ");
        int n=in.nextInt();
        int i=1;
        
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        
    }
    
}
