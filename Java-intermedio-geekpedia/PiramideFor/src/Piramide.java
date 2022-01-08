
import java.util.Scanner;

public class Piramide {

    public static int altura;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la altura de la piramide:");
        altura = in.nextInt();

        

        /*
            se le resta a altura para ajustar el nivel de espacios
            
            ejemplo en el if numero 3 se le resta el valor de f por que
            i = 3 por lo tanto si usamos una altura de 5, la cantidad 
            de espacios que necesita esa linea sera 5-3 que es igual a 
            solo necesitar 2 espacios y asi con mas y mas de altura 
         */
        
        int contador_asteriscos = 3; //3 por que es la cantidad de asteriscos de numero j numero 2

        //j inicia desde 1 para que este junto a la altura y no inicie en 0
        for (int j = 1; j <= altura; j++) { //el ciclo de copiado inicia cuando entra la primera linea de i
            //y j es la que se encarga de imprimir toda la piramide

            if (j == 1) {
                //primera linea
                System.out.println(espacios(altura - j) + asteriscos(j));
            } else if (j == 2) {
                System.out.println(espacios(altura - j) + asteriscos(contador_asteriscos));
            } else {
                contador_asteriscos += 2; //aumenta de 2 en 2 en relacion a la altura 
                System.out.println(espacios(altura - j) + asteriscos(contador_asteriscos));
            }
        }
    }

    public static String espacios(int cantidad) {

        int cantidad_espacios = cantidad;
        String espacio_total = "";

        /*
        mientras altura sea menor o igual a 0 seguira dando espacios, 
        altura define cuantos espacios habra en el String a retornar 
        mientras el while annade cada espacio al String a retornar
         */
        while (cantidad_espacios > 0) {

            espacio_total += " ";

            cantidad_espacios--;
        }

        return espacio_total;
    }

    public static String asteriscos(int acomulado) {

        int cantidad_asterisocos = acomulado;
        String asteriscos_total = "";

        /*
        Define la cantidad de asteriscos basandose en el primer asterisco 
        que siempre sea igual a 1 entonces solo ira sumando 2 asteriscos
        cada ciclo que haga
         */
        while (cantidad_asterisocos > 0) {

            asteriscos_total += "*";
            cantidad_asterisocos--;

        }

        return asteriscos_total;
    }
}
