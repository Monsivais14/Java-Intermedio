package clase_22;

import javax.swing.JOptionPane;

public class Clase_22 {//salario de un obrero

    public static void main(String[] args) {

        int horas;
        float sueldo;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas a trabajado?"));

        if (horas <= 40) { //si es mejor o igual a 40 horas trabajadas

            sueldo = horas * 16; //se paga a 16 la hora

        } else { //si son mas de 40 hras

            sueldo = (40 * 16) + (horas - 40) * 20;

        }

        JOptionPane.showMessageDialog(null, "El salario total es: " + sueldo);

    }

}
