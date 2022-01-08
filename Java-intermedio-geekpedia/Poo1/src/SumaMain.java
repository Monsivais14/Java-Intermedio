
import java.util.Scanner;

public class SumaMain {
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("dame el primer valor: ");
        int valorUno = in.nextInt();
        
        System.out.print("dame el segundo valor: ");
        int valorDos = in.nextInt();
        /*
        Se declaran las variables por teclado y 
        dentro del objeto de la clase Suma de puede
        pasar datos atravez de argumentos, y despues
        se tienen que recolectar en un constructor 
        en la clase Suma.
        */
        Suma valores = new Suma(valorUno,valorDos);
        /*
        Hay que usar el objeto de la otra clase como mensajero para
        poder usar metodos echos en la otra clase
        */
        valores.imprimir();
    }
}
