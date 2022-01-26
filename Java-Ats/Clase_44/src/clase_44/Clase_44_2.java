
package clase_44;

import java.util.Scanner;

public class Clase_44_2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] n = new int[5];
        
        for (int i=0; i < n.length; i++) {
            System.out.println("Digita el numero ("+(i+1)+"):");
            n[i] = in.nextInt();
        }
        
        for(int i=n.length-1;i>=0;i--){
            System.out.println(n[i]);
        }
        
    }
    
}
