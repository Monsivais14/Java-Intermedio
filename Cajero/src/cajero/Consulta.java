package cajero;

public class Consulta extends Logica{
    @Override
    public void hacer(){
        System.out.println("//////////////////////////");
        System.out.println("Consulta de saldo actual:");
        imprimirsaldo();
        System.out.println("//////////////////////////");
    }
}
