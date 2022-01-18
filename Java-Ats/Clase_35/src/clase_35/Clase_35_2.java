
package clase_35;

import javax.swing.JOptionPane;

public class Clase_35_2 {
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        int resultado=1;
        
        for(int i=1;i<=numero;i++){
            resultado*=i;
            System.out.println(resultado);
        }
    }
    
}
