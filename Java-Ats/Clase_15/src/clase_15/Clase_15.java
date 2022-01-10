
package clase_15;

import java.util.Scanner;

public class Clase_15 { //problema de guillermo
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float Guillermo,Luis,Juan,Total;
        
        System.out.println("Cuanto dinero tiene Guillermo?");
        Guillermo = in.nextFloat();
        
        Luis = Guillermo/2; //tiene la muitad de G
        
        Juan = (Guillermo+Luis)/2;//la mitad de ambos
        
        Total = Guillermo + Luis + Juan;
        
        System.out.println("La cantidad total entre los 3 es: "+Total);
    }
    
}
