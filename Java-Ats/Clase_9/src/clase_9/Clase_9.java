
package clase_9;

import javax.swing.JOptionPane;

public class Clase_9 { //JOptionPane

    
    public static void main(String[] args) {
        //variables
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digita una cadena"); //ingreso de String por cadena
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entero")); 
        //como el Input dialog retorna un String, con el Objeto Integer se puede 
        //parsear y convertir en Int de tipo primitivo
        letra = JOptionPane.showInputDialog("Digita un caracter").charAt(0); 
        //el charAt es para guardar solamente el primer caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digita un numero decimal"));
        //pasa igual que el objeto Integer
        
        JOptionPane.showMessageDialog(null , "Datos ingresados: \nla cadena es:"+cadena+"\nel entero es:"+entero+"\nla letra es:"+letra+"\nel decimal es:"+decimal);
        //showMessageDialog muestra una cadena de caracteres por interfaz grafica en forma de anuncio
    }
    
}
