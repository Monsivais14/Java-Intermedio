
package clase_33;

import javax.swing.JOptionPane;

public class Clase_33_2 {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero: "));
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
}
