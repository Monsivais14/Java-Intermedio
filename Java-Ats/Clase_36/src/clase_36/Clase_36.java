
package clase_36;

import javax.swing.JOptionPane;

public class Clase_36 {
    
    public static void main(String[] args) {
        
        int n,suma_pos=0,c_pos=0,suma_neg=0,c_neg=0,c_cero=0;
        float m_pos,m_neg;
        
        for (int i=1; i <=10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrea un numero"));
            
            if(n == 0){
                c_cero++;
            }else if(n>0){
                suma_pos+=n;
                c_pos++;
            }else{
                suma_neg+=n;
                c_neg++;
            }
        }
        
        if(c_pos==0){
            System.out.println("No se puede sacar la media de positivos");
        }else{
            m_pos = (float) suma_pos/c_pos;
            System.out.println("Media positiva: "+m_pos);
        }
        
        if(c_neg==0){
            System.out.println("No se puede sacar la media de negativos");
        }else{
            m_neg = (float) suma_neg/c_neg;
            System.out.println("Media negativa: "+m_neg);
        }
        
        System.out.println("Cantidad de ceros: "+c_cero);
        
    }
    
}
