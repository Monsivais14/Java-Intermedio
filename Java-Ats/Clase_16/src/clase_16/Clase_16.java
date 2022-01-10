
package clase_16;

import java.util.Scanner;

public class Clase_16 {

    public static void main(String[] args) {
        /*
        se calcula la nota de calificacion con diferentes parciales y con diferentes valores
        */
        Scanner in = new Scanner(System.in);
        
        float participacion, examen1, examen2, examenfinal, notafinal;
        
        System.out.println("Nota de participacio: ");
        participacion = in.nextFloat();
        
        System.out.println("Nota del primer examen: ");
        examen1 = in.nextFloat();
        
        System.out.println("Nota de segundo examen: ");
        examen2 = in.nextFloat();
        
        System.out.println("Nota de examen final: ");
        examenfinal = in.nextFloat();
        
        participacion *= 0.10f; //vale solo 10%
        examen1 *= 0.25f;
        examen2 *= 0.25f;
        examenfinal *= 0.40f;
        
        notafinal = participacion + examen1 + examen2 + examenfinal;
        
        System.out.println("La nota final es: "+notafinal);
    }
    
}
