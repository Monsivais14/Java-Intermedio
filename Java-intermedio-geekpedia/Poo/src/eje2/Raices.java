
package eje2;


public class Raices {
    
    private double a,b,c;
    
    public Raices(double a,double b,double c){ //constructor
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    private void ObtenerRaices(){
        
        double x1,x2;
        
        System.out.println("Solucion x1");
        x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        System.out.println(x1);
        System.out.println("Solucion x2");
        x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        System.out.println(x2);
    }
    
    private void obtenerRaiz(){
        double x=(-b)/(2*a);
        System.out.println("Unica solucion");
        System.out.println(x);
    }
    
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void calcular(){
        
        if(tieneRaices()){
            ObtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones"); 
        }
    }
    
}