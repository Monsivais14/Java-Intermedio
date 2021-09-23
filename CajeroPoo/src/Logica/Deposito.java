
package Logica;
import java.util.Scanner;
public class Deposito extends Operaciones{
    
    @Override
    public void operacion(){
        Scanner in = new Scanner(System.in);
        saldo=saldo+100;
        System.out.print("Añadiste "+saldo+" a tu cuenta.");
        
    }  
}
