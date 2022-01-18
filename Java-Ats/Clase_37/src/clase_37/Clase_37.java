
package clase_37;

import javax.swing.JOptionPane;

public class Clase_37 {
    
    public static void main(String[] args) {
        
        int edad,s_edad=0,c_mayor18=0,c_mayor175=0;
        float altura,s_altura=0,m_edad,m_altura;
        
        for (int i = 1; i <=5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno ("+i+") \nDigita la edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digita la estatura"));
            
            s_edad+=edad;
            s_altura+=altura;
            
            if(edad>18){
                c_mayor18++;
            }
            if(altura>1.75){
                c_mayor175++;
            }
        }
        
        m_edad = (float) s_edad/5;
        m_altura = (float) s_altura/5;
        
        System.out.println("La edad promedio es: "+m_edad+"\nLa estatura promeido es: "+m_altura);
        System.out.println("Hay "+c_mayor18+" mayores a 18 annos y "+c_mayor175+" miden mas de 1.75");
    }
    
}
