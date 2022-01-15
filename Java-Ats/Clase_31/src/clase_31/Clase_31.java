
package clase_31;

import javax.swing.JOptionPane;

public class Clase_31 {
    
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        while(numero!=0){
            
            if(numero%2==0){//si es par
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        }
        
    }
    
}
