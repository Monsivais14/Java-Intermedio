
package clase_23;

import javax.swing.JOptionPane;

public class Clase_23_2 { //cuantas cifras tiene el numero
    
    public static void main(String[] args) {
        
        String numero = JOptionPane.showInputDialog("Ingresa un numero entre 0 y 99 999: ").trim();
        
        JOptionPane.showMessageDialog(null, numero.length());
        //length retorna el numero de caracteres qe contiene una cadena
    }
    
}
