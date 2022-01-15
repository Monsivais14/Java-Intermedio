
package clase_32;

import javax.swing.JOptionPane;

public class Clase_32 {
    
    public static void main(String[] args) {
        
        int numero,aleatorio, intentos=0;
        
        aleatorio =(int) (Math.random()*100);
        
        do{
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(aleatorio  > numero){
                System.out.println("Digita un numero mayor");
            }else{
                System.out.println("Digita un numero menor");
            }
            intentos++;
        }while(numero!=aleatorio);
        
        System.out.println("Numero de intentos: "+intentos);
        
    }
    
}
