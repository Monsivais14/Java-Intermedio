
package clase_33;

import javax.swing.JOptionPane;

public class Clase_33 {
    
    public static void main(String[] args) {
        
        int numeros,elementos=0,suma=0;
        float media;
        
        numeros = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        while(numeros>=0){
            suma+=numeros;
            elementos++;
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        }
        
        if(elementos==0){
            JOptionPane.showMessageDialog(null, "No tiene media");
        }else{
            media = (float)suma / elementos;
            JOptionPane.showMessageDialog(null, "La media es: "+media);
        }
        
    }
    
}
