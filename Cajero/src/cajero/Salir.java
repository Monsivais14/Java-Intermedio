package cajero;

public class Salir extends Logica{

    @Override
    public void hacer(){
        System.out.println("*******************************************");
        System.out.println("** Muchas gracias por usar nuestro sistema. **");
        System.out.println("*******************************************");
        System.exit(0);
    }
}