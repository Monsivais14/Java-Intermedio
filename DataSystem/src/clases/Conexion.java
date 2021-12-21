
package clases;

import java.sql.*;

public class Conexion {
    
    //conexion local
    public static Connection conectar(){
        try{
            //base de datos local
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bs_ds","root",""); //conexion a base de datos
            return cn;
        }catch(SQLException e){
            System.out.println("error en conexion local "+e);
        }
        return (null);
    }
}
