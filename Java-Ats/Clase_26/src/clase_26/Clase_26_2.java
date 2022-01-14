
package clase_26;

import javax.swing.JOptionPane;

public class Clase_26_2 {
    
    public static void main(String[] args) {
        
        double kg = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de KG: "));
        
        double lib = kg/0.453592;
        
        JOptionPane.showMessageDialog(null, "La cantidad en libras es: "+lib);
        
    }
}
