
package clases;

public class ClaseMain {
    public static void main(String []args){
        
        
        int matriz1 [][] = new int [3][3];
        int matriz2 [][] = new int [3][3];
        int resultado [][] = new int [3][3];
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                matriz1[i][j] = (int) (Math.random()*10);
            }
        }
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2.length;j++){
                matriz2[i][j] = (int) (Math.random()*10);
            }
        }
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz2.length;j++){
                resultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        //impresion de matrices
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                System.out.print("[ "+matriz1[i][j]+" ]");
            }
            if(i==1){
                System.out.print("  +   ");
            }else{
                System.out.print("      ");
            }
            
            for(int j=0;j<matriz2.length;j++){
                System.out.print("[ "+matriz2[i][j]+" ]");
            }
            
            if(i==1){
                System.out.print("  =   ");
            }else{
                System.out.print("      ");
            }
            
            for(int j=0;j<matriz2.length;j++){
                System.out.print("[ "+resultado[i][j]+" ]");
            }
            
            System.out.println("");
        }
    }
}
