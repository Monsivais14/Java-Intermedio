
package clase_25;

import javax.swing.JOptionPane;

public class Clase_25_2 {
    
    public static void main(String[] args) {
        
        int nota=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota"));
        
        if(nota<=5){
            JOptionPane.showMessageDialog(null, "Nota insuficiente");
        }else if(nota>=6&&nota<=7){
            JOptionPane.showMessageDialog(null, "Nota suficiente");
        }else if(nota==8){
            JOptionPane.showMessageDialog(null, "Nota aceptable");
        }else if(nota==9){
            JOptionPane.showMessageDialog(null, "Nota notable");
        }else if(nota<=10){
            JOptionPane.showMessageDialog(null, "Nota sobresaliente");
        }
        
    }
    
}
