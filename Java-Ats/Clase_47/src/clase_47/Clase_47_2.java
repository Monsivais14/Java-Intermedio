
package clase_47;

import java.util.Scanner;

public class Clase_47_2 {
    
    public static void main(String[] args) {
        
        int[] tabla = new int[10];
        Scanner in = new Scanner(System.in);
        
        for (int i=0;i<tabla.length-2;i++) {
            System.out.println("Digito de tabla");
            tabla[i] = in.nextInt();
        }
        
        int numero,posicion;
        System.out.println("ingresa un numero");
        numero = in.nextInt();
        System.out.println("Ingresa una posicion");
        posicion = in.nextInt();
        
        if(posicion>=8){//No habra que desplazar el arreglo
           tabla[posicion]=numero;
       }else{//Habra que desplazar el arreglo
           for(int i=(tabla.length-1); i>posicion; i--){
               tabla[i] = tabla[i-1];
           }
           tabla[posicion] = numero;
    }
        for (int i : tabla) {
            System.out.println(i);
        }
    
}
}
