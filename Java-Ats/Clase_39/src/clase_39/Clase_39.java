
package clase_39;

import javax.swing.JOptionPane;

public class Clase_39 {
    
    public static void main(String[] args) {
        float nota;
        int aprobados=0,condicionados=0,suspensos=0;
        
        for(int i=1; i<=6;i++){
            
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10"));
            }while(nota<0||nota>10);
            
            if(nota==4){
                condicionados++;
            }else if(nota>=5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        
        System.out.println("Cantidad de aprobados: "+aprobados+"\n"
                + "Cantidad de condicionados: "+condicionados+"\n"
                        + "Cantidad de suspensos: "+suspensos);
    }
    
}
