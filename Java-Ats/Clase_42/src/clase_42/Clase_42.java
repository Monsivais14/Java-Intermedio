
package clase_42;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase_42 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de espacios: "));
        
        char[] letra = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo: ");
        
        for(int i=0;i<=letra.length-1;i++){
            System.out.println("Digite un caracter("+(i+1)+"): ");
            letra[i] = in.nextLine().charAt(0);
        }
        
        System.out.println("\nlos caracteres son: ");
        
        for (int i=0;i<=letra.length-1;i++) {
            System.out.println("["+letra[i]+"]");
        }
        
    }
    
}
