/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje5;

/**
 *
 * @author klite
 */
public class Metodos {

    public void Decimal(double numerador, int denominador) {

        if(numerador<=1){
            denominador = 1000;
            numerador *= denominador;
        }else{
            numerador *= 100;
        }
        
        System.out.println((int) numerador + "/" + denominador);
        Simplificar(numerador, denominador);
    }

    private void Simplificar(double numerador, int denominador) {

        if (numerador % 2 == 0 && denominador % 2 == 0) {
            imprimir(numerador, denominador, 2);
            Simplificar(numerador/2, denominador/2);
        } else if (numerador % 3 == 0 && denominador % 3 == 0) {
            imprimir(numerador, denominador, 3);
            Simplificar(numerador/3, denominador/3);
        } else if (numerador % 5 == 0 && denominador % 5 == 0) {
            imprimir(numerador, denominador, 5);
            Simplificar(numerador/5, denominador/5);
        }
    }

    private void imprimir(double numerador, int denominador, int numero) {
        numerador /= numero;
        denominador /= numero;
        System.out.println((int) numerador + "/" + denominador);

    }
}
