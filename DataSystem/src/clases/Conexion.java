
package clases;

import java.sql.*;

public class Conexion {
    
    //conexion local
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ds","Monsi","monsi270405"); //conexion a base de datos
            return cn;
        }catch(SQLException e){
            System.out.println("error en conexion local "+e);
        }
        return (null);
    }
    
    public static void main(String []args){
        System.out.println("hola");
        clearScreen();
    }
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
}
