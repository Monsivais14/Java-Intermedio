
package polimorfismo;


public class Resta extends Operaciones_Padre{
    //sobre escribir un metodo
    @Override
    public void operaciones(){
        resultado=valor1-valor2;
    }
    /*
    Override, dice que sobrescribira un metodo ya a sido 
    declarado en otra clase, pero en este se implementara
    su logica
    */
}