package cajero;

public class CajeroMain {
    public static void main(String[] args) {

        Consulta uno = new Consulta();
        Deposito dos = new Deposito();
        Retiro tres = new Retiro();
        Salir cuatro = new Salir();

        while (true){

            uno.seleccion();
            int seleccion=uno.getSeleccionado();

                if (seleccion == 1) {
                    uno.operacion();
                }else if (seleccion == 2) {
                    dos.operacion();
                }else if (seleccion == 3) {
                    tres.operacion();
                }else if (seleccion == 4) {
                    cuatro.operacion();
                } else {
                    System.out.println("Esa opcion no esta disponible...");
                }
            }
    }
}