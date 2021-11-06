
package eje1;

public class Libro { //clase libro padre
    
    //atributos o propiedades
    private int ISBN; //identificador 
    private String titulo; //private para no tener acceso directo a la variable, sino mejor utilizar el setter and getter 
    private String autor;
    private int numPaginas; //sin definir valor por que se heredaran a sus proximas clases hijas 
    
    //constructor
    public Libro(int ISBN,String Titulo,String autor, int numPaginas){ //constructor, ahi se inicializan valores de los atributos //se le pasan parametros
        this.ISBN = ISBN;
        this.titulo = Titulo; //atributo de la clase es  =  a parametro local en constructor
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
        
    //metodos
    public int getISBN(){  //metodos getter and setter, sirven para obtener el valor de un atributo aunque su encapsulamiento sea private por la utilizacion de un metodo
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //toString
    @Override  //soberescribir
    public String toString(){   //se utilza para obeter un String de la informacion de los atrubutos del objeto de forma simplificada
        return "El libro "+titulo+" con el ISBN "+ISBN+" creado por el autor "+autor+" tiene "+numPaginas+" paginas";
    }
    
    
}