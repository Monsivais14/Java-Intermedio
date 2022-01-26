package clase_46;

public class Clase_46_2 {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; //[12]
        int[] b = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}; //[12]
        int[] c = new int[24]; //[24]

        System.out.println("Combinamos arreglos");
        int j=0;//contador de c
        int k=0;//contador de a
        int l=0;//contador de b
        boolean aob=true;
        for (int i=0;i<8;i++) { //se hace 8 veces por que son 3*8
            
            if(aob){//3 son por que se guardan 3 veces cada vez que se hace 
                c[j]=a[k];
                j++;k++;
                c[j]=a[k];
                j++;k++;
                c[j]=a[k];
                j++;k++;
                aob=false;
            }else{//cuando aob no es true entra el else y guarda lo de b y la hace
                //true para ir turnando en ciclo las 3 y 3 veces hasta cumplir el ciclo
                // de las 8 veces del for i
                c[j]=b[l];
                j++;l++;
                c[j]=b[l];
                j++;l++;
                c[j]=b[l];
                j++;l++;
                aob=true;
            }
            
        }

        for (int i : c) {//imprecion de C
            System.out.println("[" + i + "]");
        }
    }
}
