
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarEquipo extends javax.swing.JFrame {
    
    int IDcliente_update = 0;
    String user = "", nom_cliente= "";
    
    public RegistrarEquipo() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //obtendra el nombre del cliente de la base  de datos con el ID del cliente 
                    "select nombre_cliente from clientes where id_cliente = '"+IDcliente_update+"'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nom_cliente = rs.getString("nombre_cliente");
            }
            
            
        } catch (SQLException e) {
            System.err.println("Error al c=al obtener nombre del cliente: "+e);
        }
        
        setSize(630, 445);
        setTitle("Registrar nuevo equipo para "+nom_cliente);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios
        
        txt_nombreCliente.setText(nom_cliente);
        txt_nombreCliente.setEditable(false);
    }
    
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombreCliente = new javax.swing.JTextField();
        txt_Modelo = new javax.swing.JTextField();
        txt_num_serie = new javax.swing.JTextField();
        cmb_tipo_equipo = new javax.swing.JComboBox<>();
        cmb_marca = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
        jButton_Registrar = new javax.swing.JButton();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombreCliente.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombreCliente.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(254, 254, 254));
        txt_nombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        txt_Modelo.setBackground(new java.awt.Color(153, 153, 255));
        txt_Modelo.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_Modelo.setForeground(new java.awt.Color(254, 254, 254));
        txt_Modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Modelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        txt_num_serie.setBackground(new java.awt.Color(153, 153, 255));
        txt_num_serie.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_num_serie.setForeground(new java.awt.Color(254, 254, 254));
        txt_num_serie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_num_serie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_num_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        cmb_tipo_equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        cmb_tipo_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_equipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_tipo_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cmb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asus", "Acer", "HP", "Dell", "Lenovo", "Huawei" }));
        getContentPane().add(cmb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jScrollPane.setViewportView(jTextPane_observaciones);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 330, 230));

        jButton_Registrar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Registrar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jButton_Registrar.setForeground(new java.awt.Color(254, 254, 254));
        jButton_Registrar.setText("Registrar equipo");
        jButton_Registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 210, 35));

        jLabel_Titulo.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Titulo.setText("Registro de equipo");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 30));

        jLabel_Nombre.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre.setText("Nombre del cliente");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel_Nombre1.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre1.setText("Tipo de equipo");
        getContentPane().add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel_Nombre2.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre2.setText("Marca");
        getContentPane().add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel_Nombre3.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre3.setText("Modelo");
        getContentPane().add(jLabel_Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel_Nombre4.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre4.setText("Numero de serie");
        getContentPane().add(jLabel_Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel_Nombre5.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre5.setText("Dano deportado y observaciones");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_tipo_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_equipoActionPerformed

    }//GEN-LAST:event_cmb_tipo_equipoActionPerformed

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // boton registrar equipo
        int validacion = 0; //tipo bandera
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso,
               estatus , observaciones;
        
        tipo_equipo =  cmb_tipo_equipo.getSelectedItem().toString();
        marca = cmb_marca.getSelectedItem().toString();
        modelo = txt_Modelo.getText().trim();
        num_serie = txt_num_serie.getText().trim();
        observaciones = jTextPane_observaciones.getText();
        estatus = "Nuevo ingreso";
        
        Calendar calendar = Calendar.getInstance(); //objeto calendar
        dia_ingreso = Integer.toString(calendar.get(calendar.DATE));
        mes_ingreso = Integer.toString(calendar.get(calendar.MONTH));
        annio_ingreso = Integer.toString(calendar.get(calendar.YEAR));
        
        if(modelo.equals("")){
            validacion++;
        }if(marca.equals("")){
            validacion++;
        }if(num_serie.equals("")){
            validacion++;
        }if(observaciones.equals("")){
            jTextPane_observaciones.setText("Sin observaciones");
        }
        
        if(validacion == 0){
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        //inserta los valores '?' que seran agregados despues en la tabla equipos
                        "insert into equipos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                //parametros pasados a base de datos
                pst.setInt(1,0);
                pst.setInt(2,IDcliente_update);
                pst.setString(3, tipo_equipo);
                pst.setString(4, marca);
                pst.setString(5, modelo);
                pst.setString(6, num_serie);
                pst.setString(7, dia_ingreso);
                pst.setString(8, mes_ingreso);
                pst.setString(9, annio_ingreso);
                pst.setString(10, observaciones);
                pst.setString(11, estatus);
                pst.setString(12, user);
                pst.setString(13, "");
                pst.setString(14, "");
                
                pst.executeUpdate(); //update
                cn.close(); //cierre de bd
                JOptionPane.showMessageDialog(null, "Registro de equipo exitoso");
                
            } catch (SQLException e) {
                System.err.println("Error al registrar equipo: "+e);
                JOptionPane.showMessageDialog(null, "Error al registrar equipo, contacta al soporte del programa.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_marca;
    private javax.swing.JComboBox<String> cmb_tipo_equipo;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextPane jTextPane_observaciones;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_num_serie;
    // End of variables declaration//GEN-END:variables
}
