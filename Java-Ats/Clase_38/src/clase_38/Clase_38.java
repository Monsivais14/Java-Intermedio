
package clase_38;

import javax.swing.JOptionPane;

public class Clase_38 {
    
    public static void main(String[] args) {
        
        int codigo, litros,litrosArticulo1=0,mayorde600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad vendida en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Digita el precio por litro"));
            
            importeFactura = (float) litros*precioLitro;
            facturacionTotal+=importeFactura;
            
            if(codigo==1){
                litrosArticulo1+=litros;
            }
            if(importeFactura>600){
                mayorde600++;
            }
        }
        
        System.out.println("Resulen de ventas\n"
                + "Facturacion total: "+facturacionTotal+"\n"
                + "Cantidad en litros vendidos del articulo 1: "+litrosArticulo1+"\n"
                + "Cantidad de facturas mayores a 600: "+mayorde600);
        
    }
    
}
