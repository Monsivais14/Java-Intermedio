/*
Paso de parametros tipo matriz
 */
package Funciones;

public class Ejercicio12 {
    public static void main(String[] args) {

        Ejercicio12 eje12 = new Ejercicio12();
        double fil = 2, col = 3;
        double matriz[][] = new double[(int) fil][(int) col];
        matriz[0][0] = 1;matriz[1][0] = 2;
        matriz[1][1] = 3;matriz[1][2] = 4;
        matriz[0][2] = 5;matriz[1][2] = 6;

        eje12.verNatriz(matriz, fil, col);
        eje12.MatrizCuadrada(matriz,fil,col);
        eje12.verNatriz2(matriz,fil,col);

    }
    private void verNatriz(double[][] matriz, double fil, double col) {
        System.out.print("Matriz original: ");
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    private void MatrizCuadrada(double[][] matriz, double fil, double col) {
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                matriz[i][j]*=matriz[i][j];
            }
        }
    }
    private void verNatriz2(double[][] matriz, double fil, double col) {
        System.out.print("Matriz Cuadrada: ");
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
}