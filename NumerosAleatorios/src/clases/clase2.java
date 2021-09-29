
package clases;
import java.util.Random;

public class clase2 {
    public static void main(String []args){
        int aleatorio=0;
        
        Random r = new Random();
        aleatorio = (int) (r.nextDouble()*100);
        System.out.print(aleatorio);
    }
}
