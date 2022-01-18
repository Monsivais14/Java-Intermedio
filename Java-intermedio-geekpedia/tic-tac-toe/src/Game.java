
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author mpop
 */
public class Game extends javax.swing.JFrame {

    byte[][] vic = new byte[4][4];
    char[] x_o = new char[9];
    byte turno;
    static boolean CPU;//tipo bandera para la modalidad CPU

    String jugador[] = new String[3];

    public Game() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Tic-Tac-Java");

        turno = 0;
        //podria conectar a una base de datos para guardar los nombres y scores
        jugador[1] = "Jugador 1";
        jugador[2] = "Jugador 2";

        if (CPU) {
            jugador[2] = "CPU";
        }

        /*
        este for da los valores X y Y en el array de Char creado para 
        tomar el turno de 'x' o 'o'
         */
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i % 2 == 0) {
                x_o[i] = 'x';
            } else {
                x_o[i] = 'o';
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        PCPU = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        boton2.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 150));

        boton3.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 150));

        boton4.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 150));

        boton5.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 150));

        boton6.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, 150));

        boton7.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 150));

        boton8.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 150));

        boton9.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 150, 150));

        jMenu1.setText("Juego");

        newGame.setText("Nueva Partida");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        jMenu1.add(newGame);

        PCPU.setText("Nueva Partida vs CPU");
        PCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCPUActionPerformed(evt);
            }
        });
        jMenu1.add(PCPU);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem2.setText("Jugadores");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CPU_seleccion(int x, int y) {

        try {
            if (CPU) { //si CPU esta activo

                if (x_o[turno] == 'x') { //y que sea su turno del jugador 1 para saber que casilla 
                    //esta usando y saber cuales mas uso, casilla usando = xy

                    turno++;//aumenta un turno para utiliza 'o'

                    for (int z = 0; z <= 8; z++) {//9 veces por que hay 9 posibles casillas
                        //calcular 'x' y 'y' de CPU
                        int CPU_x = (int) (Math.random() * 3), CPU_y = (int) (Math.random() * 3);

                        //el x y y pasados por parametro no lo utilice por que su campo vic[][]
                        //automaticamente deja de equivaler a 0 y de igual manera no pasa el if
                        if (vic[CPU_x][CPU_y] == 0 && CPU_x != 3 && CPU_y != 3) {

                            if (CPU_x == 0) {
                                if (CPU_y == 0) {
                                    boton1.doClick();
                                } else if (CPU_y == 1) {
                                    boton2.doClick();
                                } else if (CPU_y == 2) {
                                    boton3.doClick();
                                }
                            }
                            if (CPU_x == 1) {
                                if (CPU_y == 0) {
                                    boton4.doClick();
                                } else if (CPU_y == 1) {
                                    boton5.doClick();
                                } else if (CPU_y == 2) {
                                    boton6.doClick();
                                }
                            }
                            if (CPU_x == 2) {
                                if (CPU_y == 0) {
                                    boton7.doClick();
                                } else if (CPU_y == 1) {
                                    boton8.doClick();
                                } else if (CPU_y == 2) {
                                    boton9.doClick();
                                }
                            }
                            break;
                        } else {
                            //sino hay casos (campos disponibles)
                            //no hara nada
                        }
                    }
                    turno++;
                }
            } else {//si turno no esta activo significa que esta jugando jugador vs jugador
                turno++;//y aumenta de 1 en 1
            }
        } catch (Exception e) {
            PCPU.doClick();
        }
    }

    boolean ganador = false;

    public void validar_victoria() {
        /*
        determina si al precionar un boton se hace una linea con 1 o 2 que son
        'x' o 'o' para mostrar el mensaje de vistoria y automaticamente hacer 
        un nuevo juego
         */

        //for(int i=0;i<=2;i++){
        //    for(int j=0;j<=2;j++){
        //        System.out.print("["+vic[i][j]+"]");
        //    }
        //    System.out.println("");
        //}
        //se utiliza for para analizar 'x' y 'o'
        // x = 1 y o = 2
        byte stop = 0;

        try {
            for (byte i = 1; i <= 2; i++) {

                for (byte c = 0; c <= 2; c++) {
                    for (byte j = 0; j <= 2; j++) {

                        if (vic[c][j] == i && vic[c][j + 1] == i && vic[c][j + 2] == i) { //para lineas horizontales
                            stop++;
                            break; //para el ciclo por que ya encontro al ganador
                        } else if (vic[c][j] == i && vic[c + 1][j] == i && vic[c + 2][j] == i) { //lineas verticales\
                            stop++;
                            break;
                        } else if (vic[c][j] == i && vic[c + 1][j + 1] == i && vic[c + 2][j + 2] == i) { //diagonal iz a der
                            stop++;
                            break;
                        } else if (vic[2][0] == i && vic[1][1] == i && vic[0][2] == i) { //diagonal iz a der
                            stop++;
                            break;
                        }
                    }
                    if (ganador == false) {
                        if (stop != 0) {
                            JOptionPane.showMessageDialog(null, jugador[i] + " ha ganado");

                            boton1.setEnabled(false);
                            boton2.setEnabled(false);
                            boton3.setEnabled(false);
                            boton4.setEnabled(false);
                            boton5.setEnabled(false);
                            boton6.setEnabled(false);
                            boton7.setEnabled(false);
                            boton8.setEnabled(false);
                            boton9.setEnabled(false);
                            ganador = true; //define un ganador y al activarse ya 
                            //no puede volver a entrar
                            break;
                        }
                    }

                }

            }
        }catch(HeadlessException e){
            ganador=false;
            stop=1;//activa el ganador por algun error inesperado
        }
    }

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        //boton [0][0]
        //annade el texto en el boton para identificar si es 'x' o 'o'
        boton1.setText(String.valueOf(x_o[turno]));

        //determina si es 'x' o 'o' para annadirlo a el 
        if (x_o[turno] == 'x') {
            vic[0][0] = 1;
        } else if (x_o[turno] == 'o') {
            vic[0][0] = 2;
        }
        CPU_seleccion(0, 0);//hace la seleccion del CPU siempre y cuando turno sea 'o' y este activo
        validar_victoria();//valida la victoria en sus diferentes formas y decide quien gana
        boton1.setEnabled(false); //el boton no puede ser presionado de nuevo
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        //boton [0][1]
        boton2.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[0][1] = 1;
        } else if (x_o[turno] == 'o') {
            vic[0][1] = 2;
        }
        CPU_seleccion(0, 1);
        validar_victoria();
        boton2.setEnabled(false);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        //boton [0][2]
        boton3.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[0][2] = 1;
        } else if (x_o[turno] == 'o') {
            vic[0][2] = 2;
        }
        CPU_seleccion(0, 2);
        validar_victoria();
        boton3.setEnabled(false);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        //boton [1][0]
        boton4.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[1][0] = 1;
        } else if (x_o[turno] == 'o') {
            vic[1][0] = 2;
        }
        CPU_seleccion(1, 0);
        validar_victoria();
        boton4.setEnabled(false);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        //boton [1][1]
        boton5.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[1][1] = 1;
        } else if (x_o[turno] == 'o') {
            vic[1][1] = 2;
        }
        CPU_seleccion(1, 1);
        validar_victoria();
        boton5.setEnabled(false);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        //boton [1][2]
        boton6.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[1][2] = 1;
        } else if (x_o[turno] == 'o') {
            vic[1][2] = 2;
        }
        CPU_seleccion(1, 2);
        validar_victoria();
        boton6.setEnabled(false);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        //boton [2][0]
        boton7.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[2][0] = 1;
        } else if (x_o[turno] == 'o') {
            vic[2][0] = 2;
        }
        CPU_seleccion(2, 0);
        validar_victoria();
        boton7.setEnabled(false);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        //boton [2][1]
        boton8.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[2][1] = 1;
        } else if (x_o[turno] == 'o') {
            vic[2][1] = 2;
        }
        CPU_seleccion(2, 1);
        validar_victoria();
        boton8.setEnabled(false);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        //boton [2][2]
        boton9.setText(String.valueOf(x_o[turno]));

        if (x_o[turno] == 'x') {
            vic[2][2] = 1;
        } else if (x_o[turno] == 'o') {
            vic[2][2] = 2;
        }
        CPU_seleccion(2, 2);
        validar_victoria();
        boton9.setEnabled(false);
    }//GEN-LAST:event_boton9ActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        //limpia los campos y crea una nueva partida
        Game gm = new Game();
        gm.setVisible(false);
        this.setVisible(false);
        CPU = false;
        Game gm2 = new Game();
        gm2.setVisible(true);
    }//GEN-LAST:event_newGameActionPerformed

    private void PCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCPUActionPerformed
        Game gm = new Game();
        gm.setVisible(false);
        this.setVisible(false);
        CPU = true;
        Game gm2 = new Game();
        gm2.setVisible(true);
    }//GEN-LAST:event_PCPUActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PCPU;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem newGame;
    // End of variables declaration//GEN-END:variables
}
