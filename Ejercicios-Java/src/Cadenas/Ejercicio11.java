package Cadenas;

public class Ejercicio11 {
    public static void main(String []args){

        String cad1= "Alfredo",cad2="Alfredo";
        System.out.print(cad1.toUpperCase()+"\n");
        System.out.print(cad2.toUpperCase()+"\n");
        if(!cad1.equals(cad2)){
            System.out.print("Ambas cadenas son diferentes");
        }else{
            System.out.print("Ambas cadenas son iguales");
        }
    }
}
