package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Administrador extends javax.swing.JFrame {

    String user, nombre_usuario;
    public static int sesion_usuario;

    public Administrador() {
        initComponents();

        this.user = Login.user;  //nombre de usuario
        sesion_usuario = 1; // tipo bandera

        setSize(650, 430);
        setResizable(false);
        setTitle("Administrador - sesion de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //evita que el prorama se ejecute en segundo plano si fue cerrado

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(), jlabel_wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jlabel_wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        try {
            Connection cn = Conexion.conectar(); //conexion a bd_ds - base de datos local
            // buscara el nombre de usuario donde user sea igual al usuario ingresado en login
            PreparedStatement pst = cn.prepareStatement("select nombre_usuario from usuarios where username = '" + user + "'");

            ResultSet rs = pst.executeQuery(); //permite obtener el resultado de la instruccion a la base de datos

            if (rs.next()) {
                //recuperaremos el nombre de usuario y lo guardaremos en nombre_usuario de la clase 
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_nombreusuario.setText("Bienvenido " + nombre_usuario);

            } else {

            }

        } catch (SQLException e) {
            System.err.println("Error conexion en interfaz administrador " + e);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombreusuario = new javax.swing.JLabel();
        jBuutton_registrarusuario = new javax.swing.JButton();
        jButton_gestionarus = new javax.swing.JButton();
        jButton_registrarusr3 = new javax.swing.JButton();
        jButton_tecnico = new javax.swing.JButton();
        jButton_registrarusr5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombreusuario.setFont(new java.awt.Font("Fira Sans", 1, 20)); // NOI18N
        jLabel_nombreusuario.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_nombreusuario.setText("Bienvenido");
        getContentPane().add(jLabel_nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        jBuutton_registrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        getContentPane().add(jBuutton_registrarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_gestionarus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        getContentPane().add(jButton_gestionarus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_registrarusr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        getContentPane().add(jButton_registrarusr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButton_tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        getContentPane().add(jButton_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButton_registrarusr5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opciones.png"))); // NOI18N
        getContentPane().add(jButton_registrarusr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Registrar usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Gestionar usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Panel vista capturista");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Panel vista tecnico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Acerca de ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -8, 1940, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_gestionarus;
    private javax.swing.JButton jButton_registrarusr3;
    private javax.swing.JButton jButton_registrarusr5;
    private javax.swing.JButton jButton_tecnico;
    private javax.swing.JButton jBuutton_registrarusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_nombreusuario;
    private javax.swing.JLabel jlabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
