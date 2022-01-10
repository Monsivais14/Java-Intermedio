
package clase_15;

import java.util.Scanner;

public class Clase_15_2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float salario = 1000;
        int carros_vendidos;
        float carros_valor,comision,porcentaje;
        float salario_mensual;
        
        System.out.println("Cuantos carros vendio?");
        carros_vendidos =  in.nextInt();
        
        System.out.println("Cual es el vlaor de los carros?");
        carros_valor = in.nextFloat();
        
        comision = carros_vendidos*150;
        porcentaje = carros_valor*0.05f;
        
        salario_mensual = salario+comision+porcentaje;
        
        System.out.println("El salario del vendedor es = "+salario_mensual);
    }
}
