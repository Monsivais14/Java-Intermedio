package cajero;
import java.util.Scanner;
public class Retiro extends Logica{

    @Override
    public void hacer(){
        Scanner in = new Scanner(System.in);
        System.out.println("//////////////////////////");
        System.out.println("Usted selecciono retiro,");
        System.out.println("¿Cual es la cantidad que sedea a retirar? ");
        int aux= in.nextInt();
        if(aux<saldo){
            setSaldo(saldo-aux);
        }else if (aux>saldo){
            System.out.println("Saldo insuficiente");
        }
        imprimirsaldo();
        System.out.println("//////////////////////////");
    }
}