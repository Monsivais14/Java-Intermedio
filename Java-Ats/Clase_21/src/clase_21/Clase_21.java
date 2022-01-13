
package clase_21;

import javax.swing.JOptionPane;

public class Clase_21 {

    /*
    averiguar si una letra es mayuscula o no
    */
    public static void main(String[] args) {
        
        char letra;
        //.charAt por ser 0 solo guarda el primer caracter de una cadena
        letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            /*
            El objeto character retorna tipo booleano si la letra es Mayuscula
            haciendo referencia a Upper, de lo contrario entra el else
            */
            JOptionPane.showMessageDialog(null, "Es una mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
        
    }
    
}
