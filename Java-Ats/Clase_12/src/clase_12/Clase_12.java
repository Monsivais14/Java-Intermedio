
package clase_12;

public class Clase_12 {
    
    public static void main(String[] args) {
        int x = 5;
        int y;
        
        y = x++; //toma el valor de x que es 5 y depues aumenta a 6, 
        // pero y se queda cone l valor de 5, pero si se queda como ++x,
        //primero aumenta el valor de x a 6 y y guarda el valor de x que es 6
        // entonces y seria 6
        
        System.out.println(x+" | "+y);
    }
    
}
