package clases;

public class ClaseMain {

    public static void main(String[] args) {

        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[3][2];
        int resultado[][] = new int[2][2];

        //matriz1 llenado
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        //matriz 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }

        //multiplicacion
        for (int i = 0; i < 4; i++) {
            if (resultado[0][0] == 0) {
                int temporal = (matriz1[0][0] * matriz2[0][0])
                        + (matriz1[0][1] * matriz2[1][0])
                        + (matriz1[0][2] * matriz2[2][0]);
                resultado[0][0] = temporal;
            } else if (resultado[1][0] == 0) {
                int temporal = (matriz1[1][0] * matriz2[0][0])
                        + (matriz1[1][1] * matriz2[1][0])
                        + (matriz1[1][2] * matriz2[2][0]);
                resultado[1][0] = temporal;
            } else if (resultado[0][1] == 0) {
                int temporal = (matriz1[0][0] * matriz2[0][1])
                        + (matriz1[0][1] * matriz2[1][1])
                        + (matriz1[0][2] * matriz2[2][1]);
                resultado[0][1] = temporal;
            } else if (resultado[1][1] == 0) {
                int temporal = (matriz1[1][0] * matriz2[0][1])
                        + (matriz1[1][1] * matriz2[1][1])
                        + (matriz1[1][2] * matriz2[2][1]);
                resultado[1][1] = temporal;
            }
        }

        //imprimir
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("{ " + matriz1[i][j] + " }");
                }
                if (i == 1) {
                    System.out.print("    x   ");
                } else {
                    System.out.print("        ");
                }
            } else {
                System.out.print("                       ");
            }
            //segunda
            for (int j = 0; j < 2; j++) {
                System.out.print("{ " + matriz2[i][j] + " }");
            }
            if (i == 1) {
                System.out.print("   =    ");
            } else {
                System.out.print("        ");
            }
            
            if(i<2){
                for(int j=0;j<2;j++){
                    System.out.print("{ "+resultado[i][j]+" }");
                }
            }
            System.out.println("");
        }
    }
}
