
package clase_27;
    
import java.util.Scanner;

public class Clase_27 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos numeros se imprimiran: ");
        int i = in.nextInt();
        
        while(i!=0){
            System.out.println(i);
            i--;
        }
        
    }
    
}
