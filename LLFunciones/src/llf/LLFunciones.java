/*
* Clase de funciones logicas de una lavadora
*/
package llf;

public class LLFunciones {
    
    private int kilos=0,llenadoCompleto=0,tipoDeRopa=0,lavadoCompleto=0,secadoCompleto=0;
    /*
    Al estar encapsulando hay que declarar las variables como privadas por que solamente se utilizaran en esta clase.
    */
    public LLFunciones(int kilos,int tipoDeRopa){
        this.kilos=kilos;
        this.tipoDeRopa=tipoDeRopa;
    }
    private void llenado(){           //este metodo hace el llenado verificando si los kilos de ropa son aptos para el equipo
        if(kilos<= 12){
            llenadoCompleto = 1;
            System.out.print("llenando...");
            System.out.print("llenado completo.");
        }else{
            System.out.print("Has exedido la carga de ropa, 12 kilos");
        }
    }
    private void lavado(){            //este metodo, ya una vez llenado comprueba si esta llenado con if y tambien el tipo de rola que hay dentro
        llenado();
        if(llenadoCompleto==1){
            if(tipoDeRopa==1){
                System.out.print("Ropa Blanca, Lavado Suave");
                System.out.print("Lavando...");
                lavadoCompleto=1;
            }else if(tipoDeRopa==2){
                System.out.print("Ropa de color, Lavado Intenso");
                System.out.print("Lavando...");
                lavadoCompleto=1;
            }else{
                System.out.print("El tipo de ropa no esta disponible.");
                lavadoCompleto=1;
            }
        }else{
            
        }
    }
    private void secado(){            //se encarga de verificar si los otros metodos pasados fueron efectuados y asi secar la ropa lavada
        lavado();
        if(lavadoCompleto==1){
            System.out.print("Secando...");
            secadoCompleto=1;
        }
    }
    public void cicloFinalizado(){       //si la ropa fue secada termina por finalizar el ciclo y sino lo fue muestra el error
        secado();
        if(secadoCompleto==1){
            System.out.print("Ciclo Finalizado.");
        }else {
            System.out.print("Hubo un error al efectuar el ciclo");
        }
    }
}