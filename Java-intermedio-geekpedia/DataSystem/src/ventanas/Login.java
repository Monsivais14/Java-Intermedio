package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";

    public Login() {
        initComponents();

        setSize(400, 550);//tamano
        setResizable(false); //no es posible la modificacion de tamano de interfaz
        setTitle("Acceso a el sistema."); //titulo
        setLocationRelativeTo(null); //centro de la pantalla

        ImageIcon wallpaper = new ImageIcon("images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(400, 700, Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        ImageIcon wallpaper_logo = new ImageIcon("images/DS.png"); //imagen de logo en objeto ImageIcon
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT)); //escala de la imagen
        jLabel_Logo.setIcon(icono_logo); // se le anade a la imagen
        this.repaint(); //actualiza cambios

    }

    //permite modificar el logo de la interfaz
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        Jbutton_acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 270));

        Jbutton_acceder.setText("Ingresar");
        Jbutton_acceder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jbutton_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_accederActionPerformed(evt);
            }
        });
        getContentPane().add(Jbutton_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 463, 90, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 220, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre de usuario");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 200, -1));

        txt_user.setBackground(new java.awt.Color(153, 153, 255));
        txt_user.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setForeground(new java.awt.Color(254, 254, 254));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 220, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbutton_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_accederActionPerformed
        //ingresar Boton
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();

        if (!user.equals("") && !pass.equals("")) { // validacion si ambos o un campo esta en blanco 

            try {

                Connection cn = Conexion.conectar(); //conexion con base de datos 
                PreparedStatement pst = cn.prepareStatement(
                        "select tipo_nivel, status from usuarios where  username = '" + user
                        + "' and password = '" + pass + "'");// instruccion a base de datos
                //selecciona el tipo de nivel y estatus y compara con los que estan en 
                //la variable user y pass escrita por el usuario

                ResultSet rs = pst.executeQuery(); //recupera los datos encontrados

                if (rs.next()) { //si hay concidencias entra el if

                    String tipo_nivel = rs.getString("tipo_nivel");
                    String status = rs.getString("status");

                    if (tipo_nivel.equalsIgnoreCase("Administrador") && status.equalsIgnoreCase("Activo")) {
                        this.dispose(); //cierra la interfaz y abre la siguiente ordenada
                        new Administrador().setVisible(true); //da un verdadero a ser visible la interfaz administrador 
                    } else if (tipo_nivel.equalsIgnoreCase("Capturista") && status.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Capturista().setVisible(true);
                    } else if (tipo_nivel.equalsIgnoreCase("Tecnico") && status.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Tecnico().setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
                    txt_user.setText("");
                    txt_password.setText("");
                }

            } catch (SQLException e) {
                System.err.println("Error en el boton Ingresar " + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion, contacte al administrador 423");
            }
        } else {
            JOptionPane.showMessageDialog(null, "debes llenas todos los campos");
        }


    }//GEN-LAST:event_Jbutton_accederActionPerformed


    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        //Nombre del usuario Jtextfield

    }//GEN-LAST:event_txt_userActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbutton_acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
