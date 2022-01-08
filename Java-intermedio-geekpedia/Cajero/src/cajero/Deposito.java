package cajero;

import java.util.Scanner;

public class Deposito extends Logica{

    @Override
    public void hacer(){
        System.out.println("//////////////////////////");
        System.out.println("Usted seleccino deposito,");
        System.out.println("¿Cual es la cantidad que desea depositar?");
        Scanner in = new Scanner(System.in);
        int aux=in.nextInt();
        setSaldo(aux);
        imprimirsaldo();
        System.out.println("//////////////////////////");
    }

}