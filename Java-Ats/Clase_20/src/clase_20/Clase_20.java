
package clase_20;

import javax.swing.JOptionPane;

public class Clase_20 {
    
    public static void main(String[] args) { //Es multiplo de 10 o no
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entero"));
        
        if(numero%10==0){
            //si el numero se divide entre 10 y su residuo es 0, quiere decir que
            //es multiplo de 10
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es mutlplo de 10");
        }
        
    }
    
}
