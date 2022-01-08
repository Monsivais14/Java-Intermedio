
package limitardecimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class LimitarDecimales {
    public static void main(String[] args) {
        
        double num = 2;
        double raiz = Math.sqrt(num);
        
        System.out.println("LA raiz cuadrada de "+num+" es: "+raiz);
        
        //decimal format
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("LA raiz cuadrada de "+num+" es: "+df.format(raiz));
        
        //String Format
        System.out.println("LA raiz cuadrada de "+num+" es: "+String.format("%.3f", raiz));
        
        //Math.round
        System.out.println("LA raiz cuadrada de "+num+" es: "+(double)Math.round(raiz*100d)/100);
        
        //Big decimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(3,RoundingMode.HALF_UP);
        System.out.println("LA raiz cuadrada de "+num+" es: "+bd.doubleValue());
    }
    
}
