
package clase_31;
    
import javax.swing.JOptionPane;

public class Clase_31_2 {
    
    public static void main(String[] args) {
        
        int n,contador=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        while(n>0){
            contador++;
            n = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        }
        System.out.println("Numeros introducidos: "+contador);
    }
    
}
