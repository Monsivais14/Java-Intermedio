package clase_25;

import javax.swing.JOptionPane;

public class Clase_25 {

    public static void main(String[] args) {

        char seleccion;
        int n1, n2, resultado = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero: "));

        seleccion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);

        switch (seleccion) {
            case 's':
            case 'S':
                resultado = n1 + n2;
                break;
            case 'r':
            case 'R':
                resultado = n1 - n2;
                break;
            case 'p':
            case 'P':
                resultado = n1 + n2;
                break;
            case 'm':
            case 'M':
                resultado = n1 * n2;
                break;
            case 'd':
            case 'D':
                resultado = n1 / n2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esa operacion no existe");
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

}
