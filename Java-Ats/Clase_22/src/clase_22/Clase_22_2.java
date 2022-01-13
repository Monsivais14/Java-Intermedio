
package clase_22;

import javax.swing.JOptionPane;

public class Clase_22_2 {//par o impar, se saca con el resudio de %2
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        
        if(numero%2==0){ //si es par no debe de tener resudio entre %2 
            
            JOptionPane.showMessageDialog(null, "El numero es par");
            
        }else{// de lo ocntrario no es par
            
            JOptionPane.showMessageDialog(null, "El numero es impar");
            
        }
        
    }
    
}
