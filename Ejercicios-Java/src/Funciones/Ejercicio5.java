/*
Intercambiar el valor de dos variables utilizando
el paso de parametros por valor
 */
package Funciones;

public class Ejercicio5 {
    public static void main(String []args){

        int num1=100,num2=50;
        System.out.println("El valor de num1 es: "+num1);
        System.out.println("El valor de num2 es: "+num2);

        Ejercicio5 eje5 = new Ejercicio5();
        cambio(num1,num2,eje5,eje5);
        num1 = eje5.cam1;
        num2 = eje5.cam2;

        System.out.println("El valor de num1 es: "+num1);
        System.out.print("El valor de num2 es: "+num2);

    }
    private int cam1;
    private int cam2;
    private static void cambio(int num1,int num2,Ejercicio5 aux,Ejercicio5 aux1){
        aux.cam1 = num2;
        aux.cam2 = num1;
        num1 = num2;
        num2 = aux.cam1;
    }
}