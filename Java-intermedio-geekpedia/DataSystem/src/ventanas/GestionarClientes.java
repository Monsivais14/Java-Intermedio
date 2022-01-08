package ventanas;

import java.sql.*;
import clases.Conexion;
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

public class GestionarClientes extends javax.swing.JFrame {

    String user;
    public static int IDcliente_update; //indica cual es el usuario de la consulta  
    DefaultTableModel model1 = new DefaultTableModel(); //tabla de gestion

    public GestionarClientes() {
        initComponents();
        user = Login.user;

        setSize(640, 360);
        setResizable(rootPaneCheckingEnabled);
        setTitle("Capturista - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //determina que no mate el proceso al cerrarse

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

//bd_ds
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_cliente, nombre_cliente, mail_cliente, tel_cliente, ultima_modificacion from clientes");
            ResultSet rs = pst.executeQuery();

            jTable_clientes = new JTable(model1); //model coloca datos dentor de la tabla
            jScrollPane.setViewportView(jTable_clientes);//coloca la tabla dentro del Scrollpane

            //columnas de la informacion
            model1.addColumn("ID");
            model1.addColumn("Nombre");
            model1.addColumn("Email");
            model1.addColumn("Telefono");
            model1.addColumn("Modificado por");

            while (rs.next()) {//mientras existan registros ejecutara el codigo
                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {
//extrae toda la informacion obtenida dentro de la base de datos con el rs y almacenandolo en un objetc
                    fila[i] = rs.getObject(i + 1);
                }
                model1.addRow(fila);//agrega la fila en la tabla
            }
            cn.close();

        } catch (SQLException e) {
            System.err.print("Error en conexion de datos: " + e);
            JOptionPane.showMessageDialog(null, "Error en llenado de base de datos, porfavor coneacta al soporte del programa 542");
        }

//accion de abrir interfaz de cada uno de los clientes
        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//obtiene el punto exacto donde se esta dando click en la tabla
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
                int columa_point = 0; //0 por que siempre se obtendra el ID del cliente para ver su informacion

//verifica si se a presionado sobre la tabla cumpliendo la condicion
                if (fila_point > -1) {
//obtenemos el id del cliente 
                    //se obtiene directamente de la tbla con sus coordenadas 
                    IDcliente_update = (int) model1.getValueAt(fila_point, columa_point);
                    
                    //hace visible a la interfaz de informacion del cliente
                    Informacion_Cliente informacion_Cliente1 = new Informacion_Cliente();
                    informacion_Cliente1.setVisible(true);
                    
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane.setViewportView(jTable_clientes);

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
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable_clientes;
    // End of variables declaration//GEN-END:variables
}
