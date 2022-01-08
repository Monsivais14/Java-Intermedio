
package polimorfismo;


public class ClaseMain {
    public static void main(String []args){
    
        Operaciones_Padre instanciaresta = new Resta();
        /*
        En el polimorfismo para hacer
        un objeto para comunicarse con la clase
        hay que darle el comportamiento que hara 
        con la clase que queramos que se conecte
        */
        instanciaresta.pedirDatos();
        instanciaresta.operaciones();
        instanciaresta.imprimir();
        
        Operaciones_Padre instanciasuma = new Suma();
        instanciasuma.pedirDatos();
        instanciasuma.operaciones();
        instanciasuma.imprimir();
    }
}