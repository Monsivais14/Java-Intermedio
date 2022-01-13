package clase_24;

import javax.swing.JOptionPane;

public class Clase_24 {

    public static void main(String[] args) {

        int dia, mes, anno;

        dia = Integer.parseInt(JOptionPane.showInputDialog("digita el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("digita el mes: "));
        anno = Integer.parseInt(JOptionPane.showInputDialog("digita el anno: "));

        if (dia >= 1 && dia <= 30) {

            if (mes >= 1 && mes <= 12) {

                if (anno != 0) {

                    JOptionPane.showMessageDialog(null, "La fecha es correcta");

                }

            } else {

                JOptionPane.showMessageDialog(null, "la fecha del mes es incorrecta");

            }

        } else {

            JOptionPane.showMessageDialog(null, "la fecha del dia es incorrecta");

        }
    }

}
