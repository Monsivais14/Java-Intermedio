package clases;

/**
 *
 * @author lite
 */
import java.util.Scanner;

public class Logica {

    int numero;
    int aux;
    int acomulado;

    Scanner in = new Scanner(System.in);

    public void datos() {
        System.out.print("Dame el numero al cual calcular su factorial: ");
        numero = in.nextInt();
        aux = numero;

    }

    public void factorial() {
        
        aux--;
        System.out.print("\\"+acomulado+"//");
        if (aux >= 1) {

            if (acomulado == 0) {
                acomulado += (numero * aux);
                
            } else {
                acomulado += (acomulado * aux)-acomulado;
                
            }

            factorial();
        }

    }

    public void resultado() {
        System.out.print("El Resultado de !"+numero+" es: "+acomulado);
    }
}
