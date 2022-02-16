package Ordenamientos;

public class Seleccion {
    public static void main(String[] args) {

        int vec[] = new int[6];
        vec[0]=3;vec[1]=1;vec[2]=5;vec[3]=4;vec[4]=2;
        int i,j,aux,min;

        for(i=0;i<5;i++){
            min =i;
            for(j=i+1;j<5;j++){
                if(vec[j]<vec[min]){
                    min =j;
                }
            }
            aux = vec[i];
            vec[i] =  vec[min];
            vec[min] = aux;
        }
        System.out.println("Ordenamiento: ");
        for(i=0;i<5;i++){
            System.out.println("["+vec[i]+"]");
        }
    }
}