
package clase_34;

import javax.swing.JOptionPane;

public class Clase_34_2 {
    
    public static void main(String[] args) {
        
        int suma=0;
        for (int i = 1; i <= 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero("+i+"): "));
            suma+=numero;
        }
        JOptionPane.showMessageDialog(null, suma);
        
    }
}
