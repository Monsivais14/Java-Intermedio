
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RestaurarPassword extends javax.swing.JFrame {

    String user = "",user_update= ""; //infromacion de user y userupdate
    
    public RestaurarPassword() {
        initComponents();
        
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(360,260);
        setResizable(false);
        setTitle("Cambio de password para "+user_update);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_passwordconfirmacion = new javax.swing.JPasswordField();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cambio de Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Nueva password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Confirmar password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_password.setBackground(new java.awt.Color(155, 155, 255));
        txt_password.setForeground(new java.awt.Color(254, 254, 254));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 30));

        txt_passwordconfirmacion.setBackground(new java.awt.Color(155, 155, 255));
        txt_passwordconfirmacion.setForeground(new java.awt.Color(254, 254, 254));
        txt_passwordconfirmacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_passwordconfirmacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_passwordconfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 30));

        jButton_RestaurarPassword.setBackground(new java.awt.Color(153, 153, 255));
        jButton_RestaurarPassword.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jButton_RestaurarPassword.setForeground(new java.awt.Color(254, 254, 254));
        jButton_RestaurarPassword.setText("Restaurar password");
        jButton_RestaurarPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed
        //boton restaurar password  
        
        String nuevaPassword = txt_password.getText().trim(),passwordcon = txt_passwordconfirmacion.getText().trim();
        
        if(!nuevaPassword.equals("") && !passwordcon.equals("")){
            //sino estan vacios
            
            if (nuevaPassword.equals(passwordcon)) {
                //si nuevapassword es igual a la password confirmacion 
                
                try{
                    
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(
                            "update usuarios set password = ? where username = '"+user_update+"' ");
                    //orden de base de datos: hara la actualizacion en la variable a la base donde el nombre de usuario sea el deseado
                    
                    pst.setString(1, nuevaPassword);
                    
                    pst.executeUpdate();
                    
                    cn.close();
                    
                    JOptionPane.showMessageDialog(null, "Cambio de contrasena exitoso");
                    this.dispose();
                    
                }catch(SQLException e){
                    System.err.println("Error al confirmar password 352: "+e);
                    JOptionPane.showMessageDialog(null, "Error al confirmar password, contacta al soporte del sistema");
                }
                
            } else {
                //sino son iguales
                JOptionPane.showMessageDialog(null, "Las contrasenas no coinciden");
            }
            
        }else{
            //si algun campo esta vacio
            JOptionPane.showMessageDialog(null, "Debes de llenar ambos campos");
        }
        
        
        
        
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    
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
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordconfirmacion;
    // End of variables declaration//GEN-END:variables
}
