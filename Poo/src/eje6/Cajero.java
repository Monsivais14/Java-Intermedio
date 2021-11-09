
package eje6;

import java.util.Scanner;

public class Cajero {
    
    private double saldo;
    private String usuario;
    private String contrasena;
    
    public Cajero(double saldo){
        this.saldo=saldo;
    }
    
    private void login(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nombre de usuario: ");
        usuario = in.nextLine();
        System.out.println("Contrasena: ");
        contrasena = in.nextLine();
    }
    public void bienvenida(){
        login();
        
        int seleccion;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Bienvenido "+usuario);
            System.out.println("1.Consultar saldo");
            System.out.println("2.Realizar deposito");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Salir");
            seleccion = in.nextInt();
            
            if(seleccion == 1){
                Transaccion.consultarSaldo(saldo);
            }else if(seleccion ==2){
                saldo = Transaccion.realizaDeposito(saldo);
            }else if(seleccion == 3){
                saldo = Transaccion.retiroSaldo(saldo);
            }else if(seleccion == 4){
                System.exit(0);
            }
        }
    }
    
}
