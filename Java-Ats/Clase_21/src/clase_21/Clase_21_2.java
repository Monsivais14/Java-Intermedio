package clase_21;

import javax.swing.JOptionPane;

public class Clase_21_2 {
    
    public static void main(String[] args) {
        
        double costo;
     
        costo = Double.parseDouble(JOptionPane.showInputDialog("Cuanto hizo en compras?"));
        
        if(costo>300){
            
            double descuento = costo*0.20;
            costo -= descuento;
        }
        JOptionPane.showMessageDialog(null, "Total a pagar: "+costo);
    }
    
}
