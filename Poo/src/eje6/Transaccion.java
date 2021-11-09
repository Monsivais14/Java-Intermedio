package eje6;

import java.util.Scanner;

public class Transaccion {

    public static void consultarSaldo(double saldoDisponuible) {
        System.out.println("Tu saldo disponible es de: " + saldoDisponuible);
        System.out.println("/////");
    }

    public static double realizaDeposito(double saldo) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuanto dinero deseas depositar a tu cuenta?: ");
        double deposito = in.nextDouble();
        System.out.println("Su deposito se ha ejecutado con exito.\n"
                + "/////");
        return saldo += deposito;
    }

    public static double retiroSaldo(double saldo) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuanto dinero desas retirar a tu cuenta?: ");
        double retiro = in.nextDouble();

        if (retiro > saldo) {
            System.out.println("El deposito no puede ser efectuado, saldo insuficiente");
            System.out.println("/////");
            return saldo;
        }
        System.out.println("Retiro ejecutado con exito");
        System.out.println("/////");
        return saldo - retiro;
    }
}
