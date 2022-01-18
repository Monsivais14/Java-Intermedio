
package clase_40;

import javax.swing.JOptionPane;

public class Clase_40_2 {
    
    public static void main(String[] args) {
        
        boolean suspenso=false;
        
        for (int i = 1; i <= 5; i++) {
            
            int nota = Integer.parseInt(JOptionPane.showInputDialog("digita la nota"));
            
            if(nota<=4){
                suspenso=true;
            }
            
        }
        
        if(suspenso){
            System.out.println("Si hay alguien suspenso");
        }else{
            System.out.println("Nadie salio suspenso");
        }
    }
    
}
