
package clase_37;

import javax.swing.JOptionPane;

public class Clase_37_2 {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
        
        if(n>=0&&n<=10){
            for (int i=1; i <=10; i++) {
            System.out.println(n+"x"+i+" = "+(n*i));
            }
        }else{
            System.out.println("Debe ser 0-10");
        }
        
        
        
    }
}
