package clase_14;

import java.util.Scanner;


public class Clase_14_2 {
    
    public static void main(String[] args) {
        
        //calcular el salario semanal de un empleado apartir de sus horas 
        //semanales trabajadas y de su salario por hora
        
        Scanner in = new Scanner(System.in);
        
        float horas, salario_hora;
        
        System.out.println("Cuantas horas se trabajan a las semana?");
        horas =  in.nextFloat();
        
        System.out.println("Cuanto es el salario por hora?");
        salario_hora = in.nextFloat();
        
        System.out.println("Salario semanal: "+horas*salario_hora);
    }
    
}
