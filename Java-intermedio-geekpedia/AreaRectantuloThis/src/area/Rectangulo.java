
package area;

public class Rectangulo {
    private int base,altura,area;
    
    public Rectangulo(int base, int altura){ //Constructor
        this.base=base;
        this.altura=altura;
        /*
        this hace referencia a las variables de la clase actual
        y dentro del constructor puedo darle el valor de las variables traidas 
        de la clase con el objeto mensajero y con this darle el valor de las
        mismas pero en esta clase
        */
    }
    public void calculoArea(){
        area=base*altura;
        //void no retorna ningun valor
    }
    public void imprimit(){
        calculoArea();
        System.out.print("La area es: "+area);
    }
}