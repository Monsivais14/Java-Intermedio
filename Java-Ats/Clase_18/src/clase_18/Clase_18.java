
package clase_18;

import javax.swing.JOptionPane;

public class Clase_18 {
    
    public static void main(String[] args) { //if condicionales
        
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        
        if(numero == dato){ //si numero es igual a dato
            JOptionPane.showMessageDialog(null, "El numero es 5");//el numero es 5
        }else{ //en caso de numero no ser igual a dato 
            JOptionPane.showMessageDialog(null, "El numero no es 5");//el numero no es 5
        }
        
    }
    
}
