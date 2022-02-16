/*
* Crear un arreglo y comprobar si existe algun valor
* que quivalga a la suma del resto de vector
*/
package Arreglos;

public class Ejercicio6 {
    public static void main(String []args){

        int valor = 0;
        int suma = 0;
        int vector[] = new int [5];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 10;
        vector[3] = 4;
        vector[4] = 3;

        for(int i=0; i<5;i++){
            suma += vector[i];
            if(vector[i] > valor){
                valor = vector[i];
            }
        }
        if(valor == suma-valor){
            System.out.print(valor + " es la suma de los demas");
        }else{
            System.out.print("No existe ningun numero que sea la suma de los demas");
        }
    }
}
