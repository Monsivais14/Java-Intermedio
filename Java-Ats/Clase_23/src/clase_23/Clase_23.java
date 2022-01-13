package clase_23;

import javax.swing.JOptionPane;

public class Clase_23 {

    /*
    pedir 3 numeros y ordenarlos
     */
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));
        String numeros_string = "";

        if (numero1 >= numero2) { //si numero 3 es mayor o igual a 2

            if (numero1 >= numero3) {

                numeros_string += numero1 + " ";

            }
            if (numero2 >= numero3) {

                numeros_string += numero2 + " " + numero3;

            } else {

                numeros_string += numero3 + " " + numero2;

            }

        } else if (numero2 >= numero3) {
            //ya se que numero1 no es mayor a numero2

            numeros_string += numero2 + " " + numero3 + " " + numero1;

        } else {
            //quiere decir que entra directamente el 3 por que es el mas grande

            numeros_string += numero3 + " " + numero2 + " " + numero1;

        }

        JOptionPane.showMessageDialog(null, numeros_string);

    }

}
