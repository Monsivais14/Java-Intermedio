
package ventanas;

import java.sql.*;
import clases.Conexion;
import com.sun.java.swing.plaf.windows.resources.windows;
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

public class GestionarUsuarios extends javax.swing.JFrame {

    String user;
    public static String user_update = "";
    DefaultTableModel model = new DefaultTableModel(); //permite acceder a metodos para modificar datos de tabla

    public GestionarUsuarios() {
        initComponents();
        user = Login.user;

        setSize(630, 330);
        setTitle("Usuarios registrados - Sesion de " + user);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // no finaliza el programa al cerrar interfaz

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        try {
            Connection cn = Conexion.conectar(); //conexion a base de datos
            PreparedStatement pst = cn.prepareStatement( //orden a base de datos
                    "select id_usuario, nombre_usuario, username, tipo_nivel, status from usuarios");

            ResultSet rs = pst.executeQuery(); //ejecuta la instruccion

            jTable_usuarios = new JTable(model); //objeto de la jtable //model objeto de defaulmodel
            jScrollPane.setViewportView(jTable_usuarios); // hace que el Jtable este dentro del jscreollpane 
            //y hace un scroll cuadno la informacion sea 
            //mucha para que no salga de la pantalla

            model.addColumn("ID ");
            model.addColumn("Nombre ");
            model.addColumn("Username "); //columnas
            model.addColumn("Permisos ");
            model.addColumn("Status ");

            while (rs.next()) { //si al base de datos encontro sesultados entra el while
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i+1); //obtendra la informacion de la base de datos 
                    //almacenara su contenido en un object para 
                    //poder llenar la tabla

                }

                model.addRow(fila);//agrega la fila en el objeto model
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla "+e);
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion en tabla 456");
        }
        
        //evento de mouse en gestionar tabla
        jTable_usuarios.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = jTable_usuarios.rowAtPoint(e.getPoint()); //obtiene la fila seleccionada
                int columna_point = 2; //recupera el username de donde se hizo click
                
                if(fila_point > -1){
                    user_update = (String)model.getValueAt(fila_point, columna_point ); //user_update es igual a el valor que este en model (tabla) donde este fila apuntando y columna apuntando
                    InformacionUsuario informacion_usuario = new InformacionUsuario();
                    informacion_usuario.setVisible(true); //interfaz de informacion usuario
                }
            }
            
        });
        
    } //fin de constructor

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_usuarios = new javax.swing.JTable();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane.setViewportView(jTable_usuarios);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 610, 250));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable_usuarios;
    // End of variables declaration//GEN-END:variables
}
