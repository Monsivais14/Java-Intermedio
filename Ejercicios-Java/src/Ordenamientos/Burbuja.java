
package Ordenamientos;

public class Burbuja {
    public static void main(String[] args) {

        int[] vector = new int[6];
        vector[0]=1;vector[1]=5;vector[2]=4;vector[3]=2;vector[4]=3;
        int aux=0,i,j;

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(vector[j] < vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        System.out.println("Orden ascendente: ");
        for(i=0;i<5;i++){
            System.out.println("["+vector[i]+"]");
        }
    }
}