package Ordenamientos;

public class BusquedaSecuencia {
    public static void main(String[] args) {

        int[] vector =  new int[6];
        vector[0]=3;vector[1]=4;vector[2]=2;vector[3]=1;vector[4]=5;
        int i,dato;
        char ban = 'F';

        i=0;
        dato=2;
        while ((ban == 'F')&&(i<5)){
            if(vector[i]==dato){
                ban='V';
            }
            i++;
        }
        if(ban == 'F'){
            System.out.println("El dato no existe en el arreglo");
        }else if(ban =='V'){
            System.out.println("El numero existe dentro del arreglo en la posicion");
        }
    }
}