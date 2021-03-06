package ventanas;

import javax.swing.WindowConstants;
import java.sql.*;
import clases.Conexion;

//itext imports
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Capturista extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario; //bandera

    public Capturista() {
        initComponents();

        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario; //si es administrador la variables es igual a 1 sino solamente 0

        setSize(550, 300);
        setResizable(false);
        setTitle("Capturista - Sesion de " + user);
        setLocationRelativeTo(null);

        //condicional que marca el tipo de finalizacion dependiendo de el tipo de sesion de usuario enviado desde Administrador
        if (sesion_usuario == 1) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            //no tiene valor y por lo tanto tampoco es igual a 1 y eso identifica que es sesion de capturista sin administrador
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        jLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        //obtiene el nombre del usuario capturista desde la base de datos
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "' ");
            //recupera la informacion de nombre usuarios de la tabla usuarios donde la tabla de usuarios sea el nombre dle usuario

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_nombreUsuario.setText("Bienvenido " + nombre_usuario);
            }

        } catch (SQLException e) {
            System.err.print("Error al obtener nombre de capturista");
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombreUsuario = new javax.swing.JLabel();
        jButton_registrarCliente = new javax.swing.JButton();
        jButton_gestionarClientes = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombreUsuario.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel_nombreUsuario.setForeground(new java.awt.Color(254, 254, 254));
        jLabel_nombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_registrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 100));

        jButton_gestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        jButton_gestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gestionarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_gestionarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 120, 100));

        jButton_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        jButton_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 100));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Registrar cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Gestionar clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Imprimir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        CerrarSesion.setText("Cerrar Sesion Actual");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarClienteActionPerformed
        //registrar cliente
        RegistrarCliente rc = new RegistrarCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_jButton_registrarClienteActionPerformed

    private void jButton_gestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gestionarClientesActionPerformed
        GestionarClientes gc = new GestionarClientes();
        gc.setVisible(true);
    }//GEN-LAST:event_jButton_gestionarClientesActionPerformed

    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed
        //boton imprimir 
        
        Document documento = new Document();
        
        try {
            
            String ruta =  System.getProperty("user.home"); 
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Escritorio/ListaClientes.pdf")); //lugar de guardado a pdf
            
            //imagen dentro de header con objeto de la libreroa itext.text.image no importada por conflicto con una de JDK
            com.itextpdf.text.Image header  = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(460,1000); //dimensiones
            header.setAlignment(Chunk.ALIGN_CENTER); //alinea en el centro la imagen
            
            Paragraph parrafo = new Paragraph(); //objeto parrafo 
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);//alineado en centro
            parrafo.add("Lista de clientes \n \n "); //texto a mostrar en parrafo
            parrafo.setFont(FontFactory.getFont("tahoma",18,Font.BOLD,BaseColor.DARK_GRAY)); //tipo de letra, tamanno,tipo de letra, color
            
            //apertura de documento
            documento.open();
            
            documento.add(header); //annade la imagen enel documento
            documento.add(parrafo); //annade el parrafo en el documento 
            
            PdfPTable tabla = new PdfPTable(5); //tabla (numero de columnas)
            tabla.addCell("ID"); //nombres de las columnas
            tabla.addCell("Nombre");
            tabla.addCell("Email");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");
            
            try {//trycatch de base de datos
                
                Connection cn = Conexion.conectar(); //conexion a bd
                PreparedStatement pst = cn.prepareStatement( //orden a bd
                        //obten todo de la tabla clientes
                        "select * from clientes");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    do{
                        //recuperamos y almacenamos la info de la bd_ en la tabla
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3)); //los numeros es la clumna en  bd
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
                    }while(rs.next()); //el ciclo se ejecutara mientras encuentre mas informacion
                    
                    documento.add(tabla);
                    cn.close();
                }
                
            } catch (SQLException e) {
                System.err.println("Error al generar lista de clientes = "+e);
            }
            
            documento.close(); //cierre del documento
            JOptionPane.showMessageDialog(null, "Exito al generar lista de clientes");
            
        } catch (Exception e) {
            System.err.println("Error en generar PDF = "+e);
            JOptionPane.showMessageDialog(null, "Error al genear PDF, contacta al soporte del programa");
        }
    }//GEN-LAST:event_jButton_ImprimirActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        //cierra la sesion actual

        if(sesion_usuario == 1){
            JOptionPane.showMessageDialog(null, "Error, Cierra sesion desde la ventana Administrador");
        }else if(sesion_usuario == 0){
            this.setVisible(false);

        Login log = new Login();
        log.setVisible(true);

        user = "";
        }
        
    }//GEN-LAST:event_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capturista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_gestionarClientes;
    private javax.swing.JButton jButton_registrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
