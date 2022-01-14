
package clase_30;

import javax.swing.JOptionPane;

public class Clase_30_2 {
    
    public static void main(String[] args) {
        int n;
        
        
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        
        if(n>0){
            JOptionPane.showMessageDialog(null, "Es positivo");
        }else if(n<0){
            JOptionPane.showMessageDialog(null, "Es negativo");
        }
        
        }while(n!=0);
    }
    
}
