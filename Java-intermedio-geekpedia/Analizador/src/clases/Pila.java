package clases;

public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;
    }

    public void Insertar(char valor) {
        Nodo Nuevo_nodo = new Nodo();
        Nuevo_nodo.informacion = valor;

        if (UltimoValorIngresado == null) {
            Nuevo_nodo.siguiente = null;
            UltimoValorIngresado = Nuevo_nodo;
        } else {
            Nuevo_nodo.siguiente = UltimoValorIngresado;
            UltimoValorIngresado = Nuevo_nodo;
        }

    }

    public char extraer() {
        if (UltimoValorIngresado != null) {

            char informacion = UltimoValorIngresado.informacion;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;

            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }
    
    public boolean PilaVacia(){
        return UltimoValorIngresado==null;
    }
    
    
}


