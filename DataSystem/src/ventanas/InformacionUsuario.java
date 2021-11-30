package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionUsuario extends javax.swing.JFrame {

    //user_update hace referencia a el nombre de usuario de la persona a la que etsamos editando
    String user = "", user_update = "";
    int ID;

    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update; //user update que es static que viene dese gestionar usuarios

        setSize(630, 450);
        setResizable(false);
        setTitle("Informacion del usuario " + user_update + " - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        jLabel_Titulo.setText("Informacion del usuario " + user_update);

        try {
            Connection cn = Conexion.conectar(); // conexion a base de datos
            PreparedStatement pst = cn.prepareStatement( //orden a base de datos
                    "select * from usuarios where username = '"+user_update+"'"); //selecciona todo de la tabla usuarios donde el userneme sea user_update,y userupdate es el usuario al cual quieren editar
                    
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){ //si se ejecuta la instruccion
                
                ID = rs.getInt("id_usuario"); //recupero el id del usuario 
                
                txt_nombre.setText(rs.getString("nombre_usuario"));
                txt_email.setText(rs.getString("email"));               //lleando de txtFIelds
                txt_telefono.setText(rs.getString("telefono"));
                txt_username.setText(rs.getString("username"));
                txt_registradopor.setText(rs.getString("registrado_por"));
                
                cmb_niveles.setSelectedItem(rs.getString("tipo_nivel")); //seleccion de combobox
                cmb_status.setSelectedItem(rs.getString("status"));
                
            }
            
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("Error al conectar base de datos en informacion usuarios 256 ="+e);
            JOptionPane.showMessageDialog(null, "Error al cargar usuario, contacta a el equipo de soporte del programa");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        jLabel_Nombre6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_registradopor = new javax.swing.JTextField();
        cmb_status = new javax.swing.JComboBox<>();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Titulo.setText("Informacion del usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre.setText("Username");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel_Nombre1.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre1.setText("email: ");
        getContentPane().add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_Nombre2.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre2.setText("telefono:");
        getContentPane().add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_Nombre3.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre3.setText("permisos de:");
        getContentPane().add(jLabel_Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_Nombre4.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre4.setText("Nombre");
        getContentPane().add(jLabel_Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_Nombre5.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre5.setText("status");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_Nombre6.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre6.setText("registrador por:");
        getContentPane().add(jLabel_Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(254, 254, 254));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_email.setBackground(new java.awt.Color(153, 153, 255));
        txt_email.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_email.setForeground(new java.awt.Color(254, 254, 254));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(254, 254, 254));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(254, 254, 254));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_registradopor.setBackground(new java.awt.Color(153, 153, 255));
        txt_registradopor.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_registradopor.setForeground(new java.awt.Color(254, 254, 254));
        txt_registradopor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registradopor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_registradopor.setEnabled(false);
        getContentPane().add(txt_registradopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "inactivo" }));
        getContentPane().add(cmb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        cmb_niveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nivelesActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(254, 254, 254));
        jButton_Actualizar.setText("Actualizar Usuario");
        jButton_Actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, 35));

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
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    private void cmb_nivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_nivelesActionPerformed

    //boton actualizar usuario
    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        
        int permisos_cmb, status_cmb, validacion = 0; //validacion es tipo bandera
        String nombre, email, telefono, username, pass, permisos_String = "", status_String = "";
        
        email = txt_email.getText().trim();
        username = txt_username.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        status_cmb = cmb_status.getSelectedIndex() + 1;
        
        if(email.equals("")){
            validacion++;
        }if(username.equals("")){
            validacion++;
        }if(nombre.equals("")){
            validacion++;
        }if(telefono.equals("")){
            validacion++;
        }
        
       
        if(validacion == 0){  //validacion entra por que si es igual a 0
            
            //seleccion en combobox
            if(permisos_cmb == 1){
                permisos_String = "Administrador";
            }else if(permisos_cmb == 2){
                permisos_String = "Capturista";
            }else if(permisos_cmb == 3){
                permisos_String = "Tecnico";
            }
            //status a string 
            if(status_cmb == 1){
                status_String = "Activo";
            }else if(status_cmb == 2 ){
                status_String = "Inactivo";
            }
            
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement( //identifica si username ingresado existe ya en la base de datos
                        "select username from usuarios where username = '"+username+"' and not id_usuario = '"+ID+"'");
                // comprueba si el nombre de usuarios esta ocupado tomando en cuenta que no consulte el nombre que estamos utilizando
                
                ResultSet rs = pst.executeQuery(); //ejecutar unaconsulta
                
                if(rs.next()){// si encuentra el nombre de usuario igual
                    JOptionPane.showMessageDialog(null, "Nombre de usurio no disponible");
                    cn.close();
                }else{
                    
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update usuarios set nombre_usuario = ?, email = ?, telefono = ?, username = ?,  tipo_nivel = ?, status = ? "
                                    + "where id_usuario = '"+ID+"'");
                    //modifica la informacion previamente ingresada en el sistema
                    
                    pst2.setString(1,nombre );
                    pst2.setString(2, email);
                    pst2.setString(3, telefono);
                    pst2.setString(4, username );
                    pst2.setString(5, permisos_String );
                    pst2.setString(6, status_String);
                    
                    pst2.executeUpdate(); //ejecutar una actualizacion
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al actualizar, contacta al soporte del programa");
                System.err.println("Error al actualizar: "+e);
            }            
            
        }else{ //validacion no es igual a 0, por lo tanto fal tan llenar campos
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed
            RestaurarPassword rp = new RestaurarPassword();
            rp.setVisible(true);
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

    
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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_registradopor;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
