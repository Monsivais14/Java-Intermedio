package Ordenamientos;

public class Insercion {
    public static void main(String[] args) {

        int num[] = new int[7];
        num[0]=4;num[1]=5;num[2]=2;num[3]=7;num[4]=4;num[5]=3;
        int i,pos,aux;

        for(i=0;i<6;i++){
            pos = i;
            aux = num[i];

            while ((pos>0)&& (num[pos-1])>aux){
                num[pos] = num[pos-1];
                pos--;
            }
            num[pos] = aux;
        }
        System.out.println("Orden ascendente: ");
        for(i=0;i<6;i++){
            System.out.println("["+num[i]+"]");
        }
    }
}