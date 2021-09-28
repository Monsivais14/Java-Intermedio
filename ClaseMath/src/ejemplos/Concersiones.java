
package ejemplos;

public class Concersiones {
    public static void main(String args[]){
        
        double angulogrados=45;
        double anguloradianes=Math.toRadians(angulogrados);
        
        System.out.print("Deg a Rad: "+angulogrados);
        System.out.println(" = "+ anguloradianes + " rad");
        
        angulogrados=Math.toDegrees(anguloradianes);
        System.out.println("Rad a Deg "+anguloradianes+" = "+angulogrados);
    }
}
