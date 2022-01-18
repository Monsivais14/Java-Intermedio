
package clase_32;

import javax.swing.JOptionPane;

public class Clase_32_2 {
    
    public static void main(String []args){
        
        int numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        String numeros = "numeros ingresados: ";
        
        while(numero!=0){
            
            numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            numeros += numero+" ";
        }
        
        JOptionPane.showMessageDialog(null, numeros);
        
    }
    
}
