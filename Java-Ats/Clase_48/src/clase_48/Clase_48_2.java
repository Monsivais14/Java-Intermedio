package clase_48;

import java.util.Scanner;

public class Clase_48_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] tabla = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un numero: ");
            tabla[i] = in.nextInt();
        }

        System.out.print("Cuantas posiciones desea desplazar?: ");
        int posiciones = in.nextInt();
        
        if(posiciones>=11||posiciones<=0){
            System.out.println("Ese numero de posiciones no se puede recorrer");
        }

        int k = 9;//valor 9 para restarlo y usarlo de apuntador en el proximo for
        int[] ultimos = new int[10];
        
        for (int j = posiciones-1; j>=0; j--) { //obtiene los ultimos numeros
            ultimos[j] = tabla[k];
            k--;
        }

        for (int i = 9; i >= 0; i--) {

            if ((i - posiciones) >= 0) {
                //el if es para que el iterador de posiciones no llege a negativas
                //el momento de estar recorriendo y dar error
                tabla[i] = tabla[i - posiciones];
            }

        }
        
        
        for (int i=0;i<=posiciones-1;i++) {//guarda los ultimos valores en 
            //los primeros campos de tabla
            tabla[i]=ultimos[i];
        }
        
        for (int i : tabla) {//sout con for edge
            System.out.println(i);
        }

    }

}
