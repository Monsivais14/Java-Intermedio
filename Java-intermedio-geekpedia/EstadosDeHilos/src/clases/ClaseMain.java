package clases;

public class ClaseMain {

    public static void main(String[] args) {

        HiloProceso hilo1 = new HiloProceso();  //este es el primer estado de hilo, donde simplemente esta creado pero no ejecutado
        HiloProceso hilo2 = new HiloProceso();

        hilo1.start(); // este es el estado runneable, donde se manda a ejecutar con el metodo start

        try {
            hilo1.sleep(1000);  //es el tiempo que estara bloqueado, "dormir" el hilo, se usa en milisegundos
        } catch (InterruptedException e) {
            System.out.print("Error en hilo 1 : " + e);   //
        }

        ///////////// hilo 2
        hilo2.start();
        hilo2.stop();  //parar el proceso del hilo, "matar el proceso"
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error hilo 2: " + e);
        }

    }

}
