
package clase_40;

import javax.swing.JOptionPane;

public class Clase_40 {
    
    public static void main(String[] args) {
        
        boolean negativo=false;
        
        for (int i = 1; i <=10; i++) {
            
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
            
            if(n<0){
                negativo=true;
            }
            
        }
        
        if(negativo){
            System.out.println("Si hubo numero negativo");
        }else{
            System.out.println("No hubo numero negativo");
        }
        
    }
    
}
