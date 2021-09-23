package cajero;

import java.util.Scanner;

public abstract class Logica {

    int seleccionado;
    int saldo=100;

    public void seleccion(){
        System.out.println("Selecciona una accion");
        System.out.println("1.Consulta");
        System.out.println("2.Deposito");
        System.out.println("3.Retiro");
        System.out.println("4.salir");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        setseleeccion(num);
    }

    public abstract void operacion();

    public void imprimirsaldo(){
        System.out.println("Su saldo actual es: "+getSaldo());
    }
    public void reinicio(){
        seleccion();
    }
    public void setsaldo(int saldo){
        this.saldo+=saldo;
    }
    public int getSaldo(){
        return saldo;
    }


    public void setseleeccion(int seleccionado){
        this.seleccionado=seleccionado;
    }
    public int getSeleccionado() {
        return seleccionado;
    }


}
