
package clase_5;


public class Clase_5 {
  
    
    /*
    tipos de datos primitivos:
    estructura = tipo + nombre = + numero a almacenar
    
    numeros enteros
    -byte, solo ocupa 8 bits pero tiene un rango de numeros muy pequenno
    -short utiliza 16 bits de memoria
    -int utiliza 32 bits de memoria
    
    los numeros decimales 
    -float es de 32 bits y necesita 
    -
    */
    public static void main(String[] args) {
        //numeros enteros
        byte entero_byte = 12; //tipo byte de nombre entero con el valor numero 12 almacenado
        short entero_short = 13;
        int entero_int = 112314122;
        long entero_long = 21312;
        
        System.out.println("Numeros enteros: "+entero_byte+ ", "+entero_short+", "+entero_int+", "+ entero_long);
        
        //numeros reales
        float decimal_float = 342.12f;
        double decimal_double= 1241.12312;
        
        System.out.println("Numero decimal: "+decimal_float+", "+decimal_double);
        
        //almacena un caracter
        char Caracter = 'a';//solo almacena un caracter
        
        System.out.println("Caracter: "+Caracter);
        
        //tipo booleano
        boolean decision = true; //solo almacena falso y verdadero
        
        System.out.println("Booleano: "+decision);
    }
    
}
