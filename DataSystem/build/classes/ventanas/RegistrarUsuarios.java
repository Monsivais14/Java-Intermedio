package ventanas;

import clases.Conexion;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.ConnectException;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarUsuarios extends javax.swing.JFrame {

    String user;

    public RegistrarUsuarios() {
        initComponents();
        setTitle("Registrar nuevo usuario - sesion de " + user);

        user = Login.user; //nombre de usuario logeado

        setSize(630, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Registro de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(155, 155, 255));
        txt_nombre.setForeground(new java.awt.Color(254, 254, 254));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 30));

        jLabel3.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("permisos de:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_email.setBackground(new java.awt.Color(155, 155, 255));
        txt_email.setForeground(new java.awt.Color(254, 254, 254));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 30));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setForeground(new java.awt.Color(254, 254, 254));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setForeground(new java.awt.Color(254, 254, 254));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, 30));

        txt_password.setBackground(new java.awt.Color(155, 155, 255));
        txt_password.setForeground(new java.awt.Color(254, 254, 254));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 210, 30));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 120, 100));

        jLabel_Wallpaper.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_Wallpaper.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        jLabel_Wallpaper.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //registrar usuario a base de datos
        int permisos_cmb, validacion = 0;
        String nombre, email, telefono, username, pass, permisos_string="";

        nombre = txt_nombre.getText().trim();
        email = txt_email.getText().trim();     //recuperacion de datos ingresados en el txt 
        username = txt_username.getText().trim(); // almacenados entreo de su debido String
        telefono = txt_telefono.getText().trim();
        pass = txt_password.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1; //retorna el numero seleciconado, no la String, +1 para no iniciar desde 0 

        if (email.equals("")) {
            validacion++;
        }
        if (username.equals("")) {
            validacion++;
        }
        if (pass.equals("")) {
            validacion++;
        }
        if (telefono.equals("")) {
            validacion++;
        }
        if (nombre.equals("")) {
            validacion++;
        }

        if (permisos_cmb == 1) {
            permisos_string = "Administrador";
        } else if (permisos_cmb == 2) {
            permisos_string = "Capturista";
        } else if (permisos_cmb == 3) {
            permisos_string = "Tecnico";
        }

        try {

            Connection cn = Conexion.conectar(); // conexion base de datos
            PreparedStatement pst = cn.prepareStatement(// instruccion a base de datis
                    "select username from usuarios where username = '" + username + "'"); //busca el username sea igual a el usuairo que esta tratando de registrase

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                cn.close(); //cierra conexion a base de datos
            } else {
                //el nombbre de usuario esta disponible asi que realizara el registro
                cn.close(); //se cierra conexion anterior

                if (validacion == 0) { //bandera de validacion, detecta si los campos estan todos llenos y si asi asi entra en if

                    try { //try de base de datos en registro 
                        Connection cn2 = Conexion.conectar(); //conexion a base de datos numero 2, es para registro de la misma 
                        PreparedStatement pst2 = cn2.prepareStatement( // orden que hara la base de datos de registrar a el nuevo usuario
                                "insert into usuarios value (?,?,?,?,?,?,?,?,?)"); // '?' significa que el valor de esa variable se anadira depues 
                                
                            //columna, valor
                        pst2.setInt(1,0); // columnal [ID], valor[0, "autoincrementable asi que solamente se incrementa a el pasado"]
                        pst2.setString(2,nombre); //columa 2 de bd pasa el valor nombre de clase escrito en txt
                        pst2.setString(3, email);
                        pst2.setString(4,telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo"); //status e usuario, activo por default al registrar
                        pst2.setString(9, user); //nombre de usuario que registra a el nuevo usuario
                        
                        pst2.executeUpdate(); //ejecuta las lineas de codigo
                        cn2.close();
                        
                        Limpiar(); 
                        JOptionPane.showMessageDialog(null,"Registro exitoso");
                        this.dispose(); //cierra el programa al finalizar el registro
                        
                    } catch (SQLException e) {
                        System.err.println("Error en base de datos registrar usuarios " + e);
                        JOptionPane.showMessageDialog(null, "Error el registrar usuario 385");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los ");
                }

            }

        } catch (SQLException e) {
            System.err.println("Error een base de datos registrar usuarios " + e);
            JOptionPane.showMessageDialog(null, "Error el registrar usuario 345");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
    
    public void Limpiar(){ //limpia los campos txtfield y la combobox
        txt_email.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        cmb_niveles.setSelectedIndex(0);
 }

}

