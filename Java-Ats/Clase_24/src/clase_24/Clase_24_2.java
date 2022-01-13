package clase_24;

import javax.swing.JOptionPane;

public class Clase_24_2 {

    /*
    dia,mes,anno con numero de dias en meses y dar correcto o erroneo
     */
    private static int dia, mes, anno;

    public static void main(String[] args) {

        dia = Integer.parseInt(JOptionPane.showInputDialog("digita el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("digita el mes: "));
        anno = Integer.parseInt(JOptionPane.showInputDialog("digita el anno: "));

        if (dia >= 1 && dia <= 30) {

            if (mesysusdias()) { //metodo booleano que define si el mes es correcto deacuerdo a su numero de dias
                //if es mes para determinar si es correcto(editar)
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

    public static boolean mesysusdias() {

        if (mes == 1 || mes == 3 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
            //enero,marzo,mayo,julioagosto,ocubre,Diciembre
            return true;
        } else if (mes == 2 && dia <= 28) {//febrero(no bisiesto)
            return true;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30) {//abril,junio.septiembre,Noviembre
            return true;
        } else {
            return false;
        }
    }

}
