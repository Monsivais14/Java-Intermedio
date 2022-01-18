
package clase_38;

import javax.swing.JOptionPane;

public class Clase_38_2 {
    
    public static void main(String[] args) {
        
        int codigo, litros,litrosArticulo1=0,mayorde600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad vendida en litros: "));
            
            switch (codigo) {
                case 1:
                    precioLitro = 0.6f;
                    litrosArticulo1+=litros;
                    break;
                case 2:
                    precioLitro= 3f;
                    break;
                default:
                    precioLitro=1.25f;
                    break;
            }
            
            importeFactura = (float) litros*precioLitro;
            facturacionTotal+=importeFactura;
            
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
