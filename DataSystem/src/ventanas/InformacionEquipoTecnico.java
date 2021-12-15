
package ventanas;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionEquipoTecnico extends javax.swing.JFrame {
    
    int ID_equipo = 0;
    String user="";
    
    public InformacionEquipoTecnico() {
        initComponents();
        
        user = Login.user; //user logeado
        //idequipo se obtiene el la infromacion del cliente al dar doble click en la tabla
        ID_equipo = GestionarEquipos.IDequipo_update; //parametro que viene desde GEstionar equipos en tabla    
        
        
        try { //conexion a bd para infromacion del equipo
            
            Connection cn = Conexion.conectar(); //conexion a bd
            PreparedStatement pst = cn.prepareStatement( //orden
                    //recopila toda la infomracion del equipo segun su id
                    "select * from equipos where id_equipo = '"+ID_equipo+"'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                //campos de texto Jtextfield y combobox
                cmb_tipo_equipo.setSelectedItem(rs.getString("tipo_equipo"));
                cmb_marca.setSelectedItem(rs.getString("marca"));
                cmb_estatus.setSelectedItem(rs.getString("status"));
                txt_modelo.setText(rs.getString("modelo"));
                txt_num_serie.setText(rs.getString("num_serie"));
                txt_ultima_modificacion.setText(rs.getString("ultima_modificacion"));
                
                //fecha de ingreso
                String dia="", mes="", annio="";
                dia = rs.getString("dia_ingereso");
                mes = rs.getString("mes_ingereso");
                annio = rs.getString("annio_ingereso");
                txt_fecha_ingreso.setText(dia+" de "+mes+" de "+annio);
                
                //JTextPane
                jTextPane_observaciones.setText(rs.getString("observaciones"));
                JTextPane_comentariosTecnico.setText(rs.getString("comentarios_tecnico"));
                //revision tecnica
                jLabel_rTecnica.setText("Comentarios y actualizacion del tecnico: "+rs.getString("revision_tecnica_de"));
                
                cn.close();
            }
            
        } catch (SQLException e) {
            System.err.println("Error al consultar base de datos = "+e);
            JOptionPane.showMessageDialog(null, "Hubo un error al consultar, contacta al soporte del programa");
        }
        
        setTitle("Equipo registrado con el ID "+ID_equipo+" - Sesion de "+user);
        setSize(670,530);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

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
        jLabel_Nombre7 = new javax.swing.JLabel();
        jLabel_Nombre8 = new javax.swing.JLabel();
        jLabel_rTecnica = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_num_serie = new javax.swing.JTextField();
        txt_ultima_modificacion = new javax.swing.JTextField();
        txt_fecha_ingreso = new javax.swing.JTextField();
        cmb_estatus = new javax.swing.JComboBox<>();
        cmb_marca = new javax.swing.JComboBox<>();
        cmb_tipo_equipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTextPane_comentariosTecnico = new javax.swing.JTextPane();
        jButton_Actualizar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Titulo.setText("Informacion de equipo");
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
        jLabel_Nombre5.setText("Fecha de ingreso");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel_Nombre6.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre6.setText("Ultima modificacion por");
        getContentPane().add(jLabel_Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel_Nombre7.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre7.setText("Estatus");
        getContentPane().add(jLabel_Nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel_Nombre8.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre8.setText("Daño reportado y observaciones");
        getContentPane().add(jLabel_Nombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel_rTecnica.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_rTecnica.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_rTecnica.setText("Comentarios y actualizacion del tecnico");
        getContentPane().add(jLabel_rTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        txt_nombreCliente.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombreCliente.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(254, 254, 254));
        txt_nombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombreCliente.setEnabled(false);
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        txt_modelo.setBackground(new java.awt.Color(153, 153, 255));
        txt_modelo.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_modelo.setForeground(new java.awt.Color(254, 254, 254));
        txt_modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        txt_num_serie.setBackground(new java.awt.Color(153, 153, 255));
        txt_num_serie.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_num_serie.setForeground(new java.awt.Color(254, 254, 254));
        txt_num_serie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_num_serie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_num_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        txt_ultima_modificacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_ultima_modificacion.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_ultima_modificacion.setForeground(new java.awt.Color(254, 254, 254));
        txt_ultima_modificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ultima_modificacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ultima_modificacion.setEnabled(false);
        getContentPane().add(txt_ultima_modificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 210, -1));

        txt_fecha_ingreso.setBackground(new java.awt.Color(153, 153, 255));
        txt_fecha_ingreso.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_fecha_ingreso.setForeground(new java.awt.Color(254, 254, 254));
        txt_fecha_ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fecha_ingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_fecha_ingreso.setEnabled(false);
        getContentPane().add(txt_fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 180, -1));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado" }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        cmb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer ", "Alienware", "Apple", "Asus", "Brother", "Dell", "HP", "Lenovo", "Samsung", "Toshiba", "Xerox" }));
        getContentPane().add(cmb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cmb_tipo_equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_tipo_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextPane_observaciones.setEditable(false);
        jScrollPane1.setViewportView(jTextPane_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, 120));

        jScrollPane2.setViewportView(JTextPane_comentariosTecnico);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 330, 120));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(254, 254, 254));
        jButton_Actualizar.setText("Comentar y actualizar");
        jButton_Actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
       //boton comentar y actualizar
       //guarda en base de datos lso cambios realizados por el tecnico
       
       String estatus,comentariosTecnicos,tecnico;
       
       estatus = cmb_estatus.getSelectedItem().toString();
       comentariosTecnicos = JTextPane_comentariosTecnico.getText();
       tecnico = user;
       
        try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "update equipos set status= ? ,comentarios_tecnico= ? ,revision_tecnica_de = ? where id_equipo = '"+ID_equipo+"'");
            
            pst.setString(1, estatus);
            pst.setString(2, comentariosTecnicos);
            pst.setString(3, tecnico);
            
            pst.executeUpdate(); //ejecuta la actualizacion
            cn.close();
            
            JOptionPane.showMessageDialog(null, "Exito al realizar actualizacion de informacion de equiipo");
            
        } catch (SQLException e) {
            System.err.println("Error en al hacer guardado de base de datos"+e);
            JOptionPane.showMessageDialog(null, "Error al actualizar informacion de equipo, contacta al soporte del programa");
        }
       
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    public void Limpiar(){
        txt_fecha_ingreso.setText("");
        txt_modelo.setText("");
        txt_num_serie.setText("");
        jTextPane_observaciones.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipoTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane JTextPane_comentariosTecnico;
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_marca;
    private javax.swing.JComboBox<String> cmb_tipo_equipo;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JLabel jLabel_Nombre7;
    private javax.swing.JLabel jLabel_Nombre8;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_rTecnica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane_observaciones;
    private javax.swing.JTextField txt_fecha_ingreso;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_num_serie;
    private javax.swing.JTextField txt_ultima_modificacion;
    // End of variables declaration//GEN-END:variables
}
