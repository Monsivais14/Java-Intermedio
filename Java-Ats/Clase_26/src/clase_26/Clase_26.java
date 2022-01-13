package clase_26;

import javax.swing.JOptionPane;

public class Clase_26 {

    public static void main(String[] args) {

        final int saldo_inicial = 1000;
        int opcion;
        float movimiento, saldo_actual;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automatico\n"
                + "1. Ingresar saldo a la cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                movimiento = Float.parseFloat(JOptionPane.showInputDialog("Digita la cantidad que deseas ingresar en cuenta; "));
                saldo_actual = saldo_inicial + movimiento;
                JOptionPane.showMessageDialog(null, "Saldo en cuenta: " + saldo_actual);
                break;
            case 2:
                movimiento = Float.parseFloat(JOptionPane.showInputDialog("Ingresa"));
                if (movimiento < saldo_inicial) {
                    saldo_actual = saldo_inicial - movimiento;
                    JOptionPane.showMessageDialog(null, "Saldo en cuenta: " + saldo_actual);
                } else {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente");
                }
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esa opcion no exite");
        }
    }

}
