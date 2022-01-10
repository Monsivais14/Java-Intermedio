
package clase_20;

import javax.swing.JOptionPane;

public class Clase_20_2 {
    
    public static void main(String[] args) {
        
        int x1 , x2;
        
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero: "));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero: "));
        
        if(x1>x2){
            JOptionPane.showMessageDialog(null, "El primer numero es mayor");
        }else if(x1==x2){
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }else{
            JOptionPane.showMessageDialog(null, "El segundo numero es mayor");
        }
        
    }
}
