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

public class GestionarEquipos extends javax.swing.JFrame {

    String user;
    public static int IDequipo_update; //indica cual es el equipo de la consulta  
    DefaultTableModel model1 = new DefaultTableModel(); //tabla de gestion

    public GestionarEquipos() {
        initComponents();
        user = Login.user;

        setSize(630, 446);
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
                    //selecciona los aprametros de equipos
                    "select id_equipo, tipo_equipo, marca, status from equipos");
            ResultSet rs = pst.executeQuery();

            jTable_equipos = new JTable(model1); //model coloca datos dentor de la tabla
            jScrollPane_equipos.setViewportView(jTable_equipos);//coloca la tabla dentro del Scrollpane

            //columnas de la informacion
            model1.addColumn("ID");
            model1.addColumn("Tipo");
            model1.addColumn("Marca");
            model1.addColumn("Estatus");

            while (rs.next()) {//mientras existan registros ejecutara el codigo
                Object[] fila = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i+1);
                    //extrae toda la informacion obtenida dentro de la base de datos con el rs y almacenandolo en un objetc
                }
                model1.addRow(fila);//agrega la fila en la tabla
            }
            cn.close();

        } catch (SQLException e) {
            System.err.print("Error en conexion de datos: " + e);
            JOptionPane.showMessageDialog(null, "Error en llenado de base de datos, porfavor contacte a al soporte del programa 542");
        }
        
        obtener_datos_tabla(); //cuadno ejecute el programa s eejecutara por defecto 

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
        cmb_estatus = new javax.swing.JComboBox<>();
        jScrollPane_equipos = new javax.swing.JScrollPane();
        jTable_equipos = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Equipos registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado" }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, -1));

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

        getContentPane().add(jScrollPane_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 610, 280));

        Mostrar.setBackground(new java.awt.Color(153, 153, 255));
        Mostrar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(254, 254, 254));
        Mostrar.setText("Mostrar");
        Mostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // boton Mostrar en tabla
        
        String seleccion = cmb_estatus.getSelectedItem().toString(); //seleccion de combo en String
        String query = ""; //
        
        model1.setRowCount(0);//limpia las filas de la tabla
        model1.setColumnCount(0); //limpia las columnas
        
        try { //conexion a bd
            
            Connection cn = Conexion.conectar();
            //instruccion dinamica de base de datos
            
            if(seleccion.equalsIgnoreCase("Todos")){ 
                //instruccion a bd si cumple el if
                //muetra los parametros de equipos
                query = "select id_equipo, tipo_equipo,marca, status from equipos"; 
                
            }else{
                //va a buscar en la base de datos solamente los equipos que relacionen el status con el where de seleccion de combobox
                query = "select id_equipo, tipo_equipo,marca, status from equipos where status = '"+seleccion+"'"; 
            }
            
            PreparedStatement pst = cn.prepareStatement(query);//instruccion query dentro de los if de arriba
            ResultSet rs =  pst.executeQuery();
            
            jTable_equipos = new JTable(model1);  //se crea una tabla con el contenido de modelq
            jScrollPane_equipos.setViewportView(jTable_equipos); //se introduce la tabla de jtable equipos dentro del scrollpane
            
            model1.addColumn(" ");
            model1.addColumn("Tipo");
            model1.addColumn("Marca");
            model1.addColumn("Estatus");
            
            while(rs.next()){ //mientras encuentre informacion en bd el buble sigue
                
                Object[] fila = new Object[4]; //fila tipo objetc 
                
                for(int i=0;i<4;i++){
                    
                    fila[i] = rs.getObject(i+1); //guarda la infromacion d ela bs en un object array
                            
                }
                model1.addRow(fila); //annade cada una de las filas entro de la tabla
            }
            
            cn.close();
                       
        } catch (SQLException e) {
            
            System.err.println("Error en base de datos, en registro de equipos = "+e);
            JOptionPane.showMessageDialog(null, "Error al llenar tabla, contacta al soporte del programa");
        }
        
        obtener_datos_tabla(); //action listener de tabla, al hacer doble click
        
    }//GEN-LAST:event_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar;
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane_equipos;
    private javax.swing.JTable jTable_equipos;
    // End of variables declaration//GEN-END:variables

    public void obtener_datos_tabla() {

        //accion de abrir interfaz de cada uno de los equipos
        jTable_equipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //obtiene el punto exacto donde se esta dando click en la tabla
                int fila_point = jTable_equipos.rowAtPoint(e.getPoint());
                int columa_point = 0; //0 por que siempre se obtendra el ID del equipo para ver su informacion

                //verifica si se a presionado sobre la tabla cumpliendo la condicion
                if (fila_point > -1) {
                    //obtenemos el id del equipo
                    //se obtiene directamente de la tbla con sus coordenadas 
                    IDequipo_update = (int) model1.getValueAt(fila_point, columa_point);

                    //hace visible a la interfaz de informacion del equipo de tecnico
                    InformacionEquipoTecnico iet = new InformacionEquipoTecnico();
                    iet.setVisible(true);
                }
            }

        });
    }
}
