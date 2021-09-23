package cajero;

public class Retiro extends Logica{


    @Override
    public void operacion(){
        System.out.println("retiro");
        imprimirsaldo();
    }
}
