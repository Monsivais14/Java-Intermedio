package ventanas;

import javax.swing.WindowConstants;
import java.sql.*;
import clases.Conexion;

//itext imports
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Tecnico extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario; //bandera

    public Tecnico() {
        initComponents();

        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario; //si es administrador la variables es igual a 1 sino solamente 0

        setSize(550, 300);
        setResizable(false);
        setTitle("Tecnico - Sesion de " + user);
        setLocationRelativeTo(null);

        //condicional que marca el tipo de finalizacion dependiendo de el tipo de sesion de usuario enviado desde Administrador
        if (sesion_usuario == 1) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            //no tiene valor y por lo tanto tampoco es igual a 1 y eso identifica que es sesion de tecnico sin administrador
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        //obtiene el nombre del usuario tecnico desde la base de datos
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "' ");
            //recupera la informacion de nombre usuarios de la tabla usuarios donde la tabla de usuarios sea el nombre dle usuario

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_nombreUsuario.setText("Bienvenido " + nombre_usuario);
            }

        } catch (SQLException e) {
            System.err.print("Error al obtener nombre de tecnico");
        }
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombreUsuario = new javax.swing.JLabel();
        jButton_gestion_equipos = new javax.swing.JButton();
        jbutton_estatus = new javax.swing.JButton();
        jbutton_grafica_marcas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombreUsuario.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel_nombreUsuario.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_nombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_gestion_equipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apoyo-tecnico.png"))); // NOI18N
        jButton_gestion_equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gestion_equiposActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_gestion_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 100));

        jbutton_estatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        jbutton_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_estatusActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 120, 100));

        jbutton_grafica_marcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        jbutton_grafica_marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_grafica_marcasActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton_grafica_marcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 100));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Gestion de equipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Grafica de estatus");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Grafica de marcas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_gestion_equiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gestion_equiposActionPerformed
        //boton gestion de equipos
        GestionarEquipos ge = new GestionarEquipos();
        ge.setVisible(true);
    }//GEN-LAST:event_jButton_gestion_equiposActionPerformed

    private void jbutton_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_estatusActionPerformed
        //boton grafica de estados
        //hace visible al interfaz graficaestatus
        GraficarStatus ge = new GraficarStatus();
        ge.setVisible(true);
    }//GEN-LAST:event_jbutton_estatusActionPerformed

    private void jbutton_grafica_marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_grafica_marcasActionPerformed
        //boton grafica de marcas
        
    }//GEN-LAST:event_jbutton_grafica_marcasActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_gestion_equipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_nombreUsuario;
    private javax.swing.JButton jbutton_estatus;
    private javax.swing.JButton jbutton_grafica_marcas;
    // End of variables declaration//GEN-END:variables
}
