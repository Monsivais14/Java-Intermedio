package clase_19;

import javax.swing.JOptionPane;

public class Clase_19 {

    public static void main(String[] args) {

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre 1 y 5"));

        switch (dato) {

            case 1:
                JOptionPane.showMessageDialog(null, "Es el numero 1");
                break; //es para salir del switch
                /*
                si se omite el brake tambien se cumple el numero
                y salta a las demas condiciones hasta encontrar un brake 
                que lo detenga
                */
            case 2:
                JOptionPane.showMessageDialog(null, "Es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Ese numero no esta entre 1 y 5");
        }

    }

}
