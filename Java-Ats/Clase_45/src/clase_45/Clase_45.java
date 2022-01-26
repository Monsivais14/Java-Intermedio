
package clase_45;

import java.util.Scanner;

public class Clase_45 {
    
    public static void main(String[] args) {
        
        float[] n = new float[5];
        Scanner in = new Scanner(System.in);
        float s_positivos=0,s_negativo=0,m_positivos,m_negativos;
        int c_positivos=0,c_negativos=0,c_ceros=0;
        
        System.out.println("Guardando los numeros en el arreglo...");
        for (int i=0; i<n.length;i++) {
            System.out.println("("+(i+1)+") Digite un numero: ");
            n[i] = in.nextFloat();
            
            if(n[i]==0){
                c_ceros++;
            }else if(n[i]>0){
                s_positivos+=n[i];
                c_positivos++;
            }else if(n[i]<0){
                s_negativo+=n[i];
                c_negativos++;
            }
        }
        
        if(c_positivos==0){
            System.out.println("No tiene media");
        }else{
            m_positivos = s_positivos / n.length;
            System.out.println("La media de numeros positivos es: "+m_positivos);
        }
        
        if(c_negativos==0){
            System.out.println("No tiene media");
        }else{
            m_negativos = s_negativo / n.length;
            System.out.println("La media de numeros positivos es: "+m_negativos);
        }
        
        System.out.println("La cantidad de ceros es: "+c_ceros);
        
    }
    
}
