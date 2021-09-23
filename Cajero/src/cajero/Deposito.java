package cajero;

import java.util.Scanner;

public class Deposito extends Logica{

    @Override
    public void operacion(){
        System.out.println("¿Cual es la cantidad que desea depositar?");
        Scanner in = new Scanner(System.in);
        int aux=in.nextInt();
        setsaldo(aux);
        imprimirsaldo();
    }
}