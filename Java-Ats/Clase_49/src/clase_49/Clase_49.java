
package clase_49;

import java.util.Scanner;

public class Clase_49 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = true;//el arreglo esta creciente hasta que se diga lo contrario
        int n,sitio_num=0,j=0;
        
        System.out.println("Llenar el arreglo ");
        
        do {            
            //llenando el arreglo
            for (int i=0;i<5; i++) {
                System.out.println("("+(i+1)+") Digita un numero");
                arreglo[i] = in.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for (int i = 0; i < 4; i++) {
                if(arreglo[i]<arreglo[i+1]){
                    //si esta ordenado de forma creciente
                    //osea que el numero que esta en i es menor que el numero
                    //que le sigue adelante
                    creciente = true;
                    
                }if(arreglo[i]>arreglo[i+1]){ //decreciente
                    //lo contrario a el ordenamiento creciente
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("El arreglo no esta ordenado en forma creciente\n");
            }
            
        } while (creciente == false);//mientrase sea false seguira ejecutandose
        
        System.out.println("Digite un elemento a insertar");
        n = in.nextInt();
        
        //determina en que posicion va el numero;
        while(arreglo[j] < n && j<5){ 
            //el bucle se repetira hasta que el arreglo[j] sea menor a el numero ingresado
            //y ademas que j sea menor a 5
            sitio_num++;
            j++;
        }
        
        //tralado de una posicion de los elementos del arreglo que estan detras del numero
        for(int i=5;i>=sitio_num;i--){
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[sitio_num] = n; //numero que el usuario puso
        
        System.out.println("\nEl arreglo queda de la siguiente manera");
        
        for (int i = 0; i < 6; i++) {
            System.out.println(arreglo[i]+" - ");
        }
    }
    
}
