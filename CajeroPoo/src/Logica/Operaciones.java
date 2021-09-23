
package Logica;
import java.util.Scanner;

public abstract class Operaciones {
    public double saldo = 500.00;
    public double mod;
    
    public int seleccion(){
        Scanner in = new Scanner(System.in);
        System.out.println("1 para Consulta");
        System.out.println("2 para Deposito");
        System.out.println("3 para Retiro");
        System.out.println("4 para SALIR");
        int num=in.nextInt();
        return num;
    }
    
    public abstract void operacion();
    
    public void imprimir(){
        System.out.print("Tu saldo actual es "+saldo);
    }
}
