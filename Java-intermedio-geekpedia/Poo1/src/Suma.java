
public class Suma {
    private int vUno, vDos, resultado;
    /*
    Se tiene que hacer un constructor donde se recolectaran
    los valores trasladados e inicializando las variables es 
    donde se guardara el valor depocitandolos
    y se tiene que guardar en otros valores para poder usarlos
    */
    public Suma(int valorUno,int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
        /*
        se tiene que guardar el valor en otra variable, 
        this hace referencia a la clase en la que actualmente esta
        en este caso "Suma"
        */
    }
    /*
    se utiliza para indicar que el método que estamos definiendo 
    realizará un procedimiento que NO retornará ningún atributo 
    de salida y, por tal motivo, ese método no incluirá la instrucción
    "return" dentro de su cuerpo.  Es por eso que al definir el método, 
    en su encabezado colocamos la palabra "void" que significa "vacío" 
    en lugar de colocar, por ej. "int", que sería el tipo de valor que 
    colocaría en lugar de "void" si el método retornara un valor entero.
    */
    public void operacion(){
        resultado=vUno+vDos;
    }
    public void imprimir(){
        operacion();
        System.out.println("El resultado es: "+resultado);
    }
}
