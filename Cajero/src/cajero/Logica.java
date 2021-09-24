package cajero;

import java.util.Scanner;

public class Logica {

    private int seleccionado;
    static int saldo=0;
    private void seleccion(){
        System.out.println("Selecciona una accion");
        System.out.println("1.Consulta");
        System.out.println("2.Deposito");  //muestra un menu en pantalla
        System.out.println("3.Retiro");
        System.out.println("4.salir");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        setseleeccion(num);     // guarda el valor de seleccion con un setter
    }

    public void operacion() { //while true, hace un bucle repetitivo infinito hasta que se seleccione 4 para salir del programa
        while (true) {
            seleccion();
            int seleccion = getSeleccionado();

            if (seleccion == 1) {
                Consulta consulta = new Consulta();
                consulta.hacer();
            } else if (seleccion == 2) {
                Deposito deposito = new Deposito();
                deposito.hacer();
            } else if (seleccion == 3) {
                Retiro retiro = new Retiro();
                retiro.hacer();
            } else if (seleccion == 4) {
                Salir salir = new Salir();
                salir.hacer();
            } else {
                System.out.println("Esa opcion no esta disponible...");
            }
        }
    }

    public void hacer(){  //metodo donde ahgo polimorfismo, define la accion que hara cada seleccion
        //Override
    }
    public void imprimirsaldo(){ //imprime salfo con getter
        System.out.println("Su saldo actual es: "+getSaldo());
    }
    public void setSaldo(int saldo){  //esteblace un valor a variable saldo
        Logica.saldo +=saldo;
    }
    public int getSaldo(){  //muestra el valor de variable saldo con getter
        return saldo;
    }
    public void setseleeccion(int seleccionado){  //setter
        this.seleccionado=seleccionado;
    }
    public int getSeleccionado() { //getter
        return seleccionado;
    }
}