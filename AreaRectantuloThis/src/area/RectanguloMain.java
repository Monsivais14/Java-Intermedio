
package area;
import java.util.Scanner;
public class RectanguloMain {
    public static void main(String []args){
   
        Scanner in = new Scanner(System.in);
        
        System.out.print("Cual es el valor de la base: ");
        int base = in.nextInt();
        System.out.print("Dame el valor de la altura: ");
        int altura = in.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base,altura);    //instancia de clase
        mensajero.imprimit();
    }
}