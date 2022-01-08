
package ejemplos;

public class Trigonometricas {
    public static void main(String []args){
        
        double resultado;
        double angulo = 45;
        double anguloRadian=Math.toRadians(angulo);
        
        resultado = Math.sin(anguloRadian);
        System.out.println("El seno de "+angulo + " = "+ resultado);
        
         resultado = Math.cos(anguloRadian);
        System.out.println("El conseno de "+angulo + " = "+ resultado);
        
        resultado = Math.tan(anguloRadian);
        System.out.println("El Tangente de "+angulo + " = "+ resultado);
        
        double valorIngresado = 0.707;
        
        anguloRadian =  Math.acos(valorIngresado);
        angulo = Math.toDegrees(anguloRadian);
        System.out.println("Arco coseno de: "+valorIngresado+ " = "+angulo);
        
        anguloRadian =  Math.atan(valorIngresado);
        angulo = Math.toDegrees(anguloRadian);
        System.out.println("Arco tangente de: "+valorIngresado+ " = "+angulo);
    }
}
