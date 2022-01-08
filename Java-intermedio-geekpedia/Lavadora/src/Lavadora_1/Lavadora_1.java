
package Lavadora_1;
import Biblioteca.LLFunciones;         //hay que importar la liberia clase java antes echa con los metodos en forma de package.clase
import java.util.Scanner;

public class Lavadora_1 {
    public static void main(String []args){
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color?: ");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa de color");
        int tipoDeRopa = in.nextInt();
        
        System.out.print("Cuantos kilos de ropa?: ");
        int kilos = in.nextInt();
        
        LLFunciones instancia = new LLFunciones(kilos,tipoDeRopa);
        instancia.setTP(2);
        /*
        System.out.print(instancia.getTP());
        utilizaciond el get, retoenando un valor e imprimiendolo
        */
        instancia.cicloFinalizado();
    }
}