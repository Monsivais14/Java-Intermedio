package ventanas;

import java.sql.*;
import clases.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static ventanas.GestionarClientes.IDcliente_update;

public class Informacion_Cliente extends javax.swing.JFrame {

    DefaultTableModel model1 = new DefaultTableModel(); //permite la ejecucion de eventos de una tabla
    int IDcliente_update = 0; //recupera la variable de otra interfaz
    public static int IDequipo = 0;
    String user = "";

    public Informacion_Cliente() {
        initComponents();
        user = Login.user;

        //recuprea el ID del cliente que viene desde la interfaz pasada de gestion de clientes
        IDcliente_update = GestionarClientes.IDcliente_update;

        setSize(630, 450);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        //coneccion a bd
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //obtiene la informacion del usuario donde el id cliente sea igual a la que esta en base de datos
                    "select * from clientes where id_cliente = '" + IDcliente_update + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //si la instruccion pst encuentra el valor
                setTitle("Informacion del cliente " + rs.getString("nombre_cliente") + " - Sesion de " + user);
                jLabel_Titulo.setText("Informacion del cliente " + rs.getString("nombre_cliente"));

                txt_nombre.setText(rs.getString("nombre_cliente"));
                txt_email.setText(rs.getString("mail_cliente"));
                txt_telefono.setText(rs.getString("tel_cliente"));
                txt_direccion.setText(rs.getString("dir_cliente"));
                txt_ultima_modificacion.setText(rs.getString("ultima_modificacion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener informacion de usuario: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener informacion, contacta al soporte del programa");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //obtiene la informacion del equipo donde la id del cliente sea la pasada por parametro static
                    "select id_equipo, tipo_equipo, marca ,status from equipos where id_cliente = '" + IDcliente_update + "'");

            ResultSet rs = pst.executeQuery();

            jTable_equipos = new JTable(model1); //coloca elementos dentro dle jtable que esta dentro de un scrollpane
            jScrollPane_equipos.setViewportView(jTable_equipos); //entra e; tale en el Scrollpane

            model1.addColumn("ID equipo");
            model1.addColumn("Tipo de equipo");
            model1.addColumn("Marca");
            model1.addColumn("Estatus");

            while (rs.next()) {
                //mientras encuentre informacion se ejecutara el cliclo

                Object[] fila = new Object[4]; //4 por que hay 4 columnas y se vacie correctamente en la tabla

                for (int i = 0; i < 4; i++) {
                    //en cada registro vaciara la informacion en  la tabla
                    fila[i] = rs.getObject(i + 1);
                }

                model1.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error en llenado de tabla equipos: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener informacion, contacta al soporte del programa");
        }

        //accion de abrir interfaz de cada uno de los clientes
        jTable_equipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //obtiene el punto exacto donde se esta dando click en la tabla
                int fila_point = jTable_equipos.rowAtPoint(e.getPoint());
                int columa_point = 0; //0 por que siempre se obtendra el ID del cliente para ver su informacion

                //verifica si se a presionado sobre la tabla cumpliendo la condicion
                if (fila_point > -1) {
                    //obtenemos el id del cliente 
                    //se obtiene directamente de la tbla con sus coordenadas 
                    IDequipo = (int) model1.getValueAt(fila_point, columa_point);

                    //hace visible la informacion del equipo (form aun no programado)

                }
            }

        });

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane_equipos = new javax.swing.JScrollPane();
        jTable_equipos = new javax.swing.JTable();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        jLabel_direccion = new javax.swing.JLabel();
        jLabel_ultima_modificacion_por = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_ultima_modificacion = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jBUtton_Imprimir_Reporte = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane_equipos.setViewportView(jTable_equipos);

        getContentPane().add(jScrollPane_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 380, 180));

        jLabel_Titulo.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Titulo.setText("Informacion del usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel_Nombre.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_Nombre.setText("Nombre");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_email.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_email.setText("email");
        getContentPane().add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_telefono.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_telefono.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_telefono.setText("telefono:");
        getContentPane().add(jLabel_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_direccion.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_direccion.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_direccion.setText("Direccion");
        getContentPane().add(jLabel_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_ultima_modificacion_por.setFont(new java.awt.Font("Fira Sans", 1, 12)); // NOI18N
        jLabel_ultima_modificacion_por.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_ultima_modificacion_por.setText("Ultima modificacion:");
        getContentPane().add(jLabel_ultima_modificacion_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

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

        txt_direccion.setBackground(new java.awt.Color(153, 153, 255));
        txt_direccion.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(254, 254, 254));
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        txt_ultima_modificacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_ultima_modificacion.setFont(new java.awt.Font("Fira Sans", 1, 16)); // NOI18N
        txt_ultima_modificacion.setForeground(new java.awt.Color(254, 254, 254));
        txt_ultima_modificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ultima_modificacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ultima_modificacion.setEnabled(false);
        getContentPane().add(txt_ultima_modificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, -1));

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
        getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 35));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(254, 254, 254));
        jButton_Actualizar.setText("Actualizar Cliente");
        jButton_Actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 210, 35));

        jBUtton_Imprimir_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        getContentPane().add(jBUtton_Imprimir_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 120, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // boton registrar equipo 
        RegistrarEquipo re = new RegistrarEquipo();
        re.setVisible(true);
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        // boton actualizar cliente
        int validacion = 0;
        String nombre, mail, telefono, direccion;

        nombre = txt_nombre.getText().trim();
        mail = txt_email.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_direccion.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        if (mail.equals("")) {
            validacion++;
        }
        if (telefono.equals("")) {
            validacion++;
        }
        if (direccion.equals("")) {
            validacion++;
        }

        if (validacion == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        //actualiza la tabla clientes con lso siguientes parametros donde la ID cliente sea la que tengas en la bd
                        "update clientes set nombre_cliente = ?, mail_cliente = ?, tel_cliente = ?, dir_cliente = ?, ultima_modificacion = ? "
                        + "where id_cliente = '" + IDcliente_update + "'");
                
                pst.setString(1, nombre);
                pst.setString(2, mail);
                pst.setString(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, user);
                
                pst.executeUpdate();
                
                Limpiar();
                
                JOptionPane.showMessageDialog(null, "Actualizacion de cliente ejecutada con exito");

            } catch (SQLException e) {
                System.err.println("Error en base de datos" + e);
                JOptionPane.showMessageDialog(null, "Error en base de datos, contacta al soporte del programa");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
        }

    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    public void Limpiar(){
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
        
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
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBUtton_Imprimir_Reporte;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JLabel jLabel_ultima_modificacion_por;
    private javax.swing.JScrollPane jScrollPane_equipos;
    private javax.swing.JTable jTable_equipos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_ultima_modificacion;
    // End of variables declaration//GEN-END:variables
}
