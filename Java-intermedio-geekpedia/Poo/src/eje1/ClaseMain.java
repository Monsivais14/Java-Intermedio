
package eje1;


public class ClaseMain {
    
    public static void main(String[] args) {
       
        Libro libro1 = new Libro(97860707,"Cronicas de una muerte anunciada","Gabriel Garcia Marquez",96); //objeto libro con parametros dados, solamente representa un libro
        Libro libro2 = new Libro(789583432,"Las olas","Virginia Woolf",243);                               //entre mas se quieran usar implica usar mas objetos y mas parametros
                                                                                                           // por pasar para que sean completente distintos los unos de los otros
        libro1.setNumPaginas(26); //setter
        libro2.setNumPaginas(25);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){  //estructura consicional de que libro tiene mas numero de paginas
            System.out.println(libro1.getTitulo()+" tiene mas paginas que "+libro2.getTitulo());  //geter 
        }else if(libro2.getNumPaginas()>libro1.getNumPaginas()){
            System.out.println(libro2.getTitulo()+" tiene mas paginas que "+libro1.getTitulo());
        }else{
            System.out.println("Los libros "+libro1.getTitulo()+" y "+libro2.getTitulo()+" tienen el mismo numero de paginas");
        }
    }
}