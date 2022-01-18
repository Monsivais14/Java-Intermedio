
package clase_39;

import javax.swing.JOptionPane;

public class Clase_39_2 {
    
    public static void main(String[] args) {
        
        int n,sueldos[],sueldoMaximo=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero de trabajadores: "));
        sueldos = new int[n+2];
        
        do {            
            sueldos[n] = Integer.parseInt(JOptionPane.showInputDialog("Sueldo:"));
            
            if(sueldos[n]>=sueldos[n+1]){
                sueldoMaximo=sueldos[n];
            }
            n--;
        } while (n>0);
        
        System.out.println("El sueldo maximo es: "+sueldoMaximo);
    }
}
