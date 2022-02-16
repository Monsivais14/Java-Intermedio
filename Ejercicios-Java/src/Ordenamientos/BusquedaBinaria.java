package Ordenamientos;

public class BusquedaBinaria {
    public static void main(String[] args) {

        int num[] = new int[5];
        num[0] = 1;num[1] = 2;num[2] = 3;num[3] = 4;num[4] = 5;
        int inf=2,sup=5,mi = 0,dato=4;
        char ban = 'F';

        while (inf <= sup){
            mi = (inf+sup)/2;

            if(num[mi]==dato){
                ban = 'V';
                break;
            }
            if(num[mi]>dato){
                sup = mi;
                mi = (inf + sup)/2;
            }
            if(num[mi]>dato){
                inf = mi;
                mi = (inf+sup)/2;
            }
        }

        if(ban =='V'){
            System.out.println("El numero ha sido encontrado en la posicion: "+mi);
        }else{
            System.out.println("El numero no existe en el arreglo");
        }
    }
}