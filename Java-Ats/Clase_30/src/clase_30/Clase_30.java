
package clase_30;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase_30 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
        double cuadrado;
        
        while(numero >= 0){
            cuadrado = Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "Resultado: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
        }
    }
    
}
