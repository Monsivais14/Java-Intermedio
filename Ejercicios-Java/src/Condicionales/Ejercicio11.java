package Condicionales;
//simular un cajero con saldo iniciar de 100 dlls

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String []args) {

        int saldoini = 1000;
        int opcion;
        float extra, saldo = 0, retiro;
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al Cajero");
        System.out.println("");
        System.out.println("1. Ingresar dinero: ");
        System.out.println("2. Retirar dinero: ");
        System.out.println("3. Salir");
        opcion = in.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Digite la cantidad de dinero a ingresar");
                extra = in.nextInt();
                saldo = saldoini + extra;
                System.out.println("Usted actualmente tiene " + saldo + " en su cuenta");
                break;

            case 2:
                System.out.println("Digite la cantidad a retirar");
                retiro = in.nextInt();
                if(retiro > saldoini){
                    System.out.println("No cuenta con suficienta salfo para completar el retiro");
                }else{
                    saldo = saldoini - retiro;
                    System.out.println("Dinero en cuenta: " + saldo);
                }

            case 3: System.exit(0);
        }
      }
    }

