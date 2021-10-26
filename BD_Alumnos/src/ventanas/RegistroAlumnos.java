/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import java.sql.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
Primero hay qe abregar el "driver" en formato jar en la libreria del proyecto
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Base de datos de Alumnos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_grupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Grupo:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el codigo del alumno: ");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButton5.setText("Generar PDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton2))
                                        .addComponent(jLabel1)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(23, 23, 23)
                                    .addComponent(jButton3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        REGISTRAR
         */
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins", "Monsi", "monsi270405");  //conexion a base de datos, las primeras comillas contienen la ruta y el nomrbe de la base de datos, el segundo el nomrbe de la base de datos y el ultimo la contrasena
            PreparedStatement pst = cn.prepareStatement("Insert into alumnos values(?,?,?)"); //Instruccion a la base de datos (los ? indican los campos a guardar

            pst.setString(1, "0");//el primer campo hace referencia a que columna va, el segundo es a donde guardar 
            pst.setString(2, txt_nombre.getText().trim());  //nombre del alumno con trim para eliminar espacios basura
            pst.setString(3, txt_grupo.getText().trim());  //grupo

            pst.executeUpdate(); //ejecuta las lineas de las odendes que le ordenamos a la base de datos

            txt_nombre.setText("");
            txt_grupo.setText("");

            label_status.setText("registro exitoso");

        } catch (Exception e) {
            label_status.setText("Error al Registrar");
            System.out.print(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*
        BUSCAR
         */
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins", "Monsi", "monsi270405");  //conexion a base de datos, las primeras comillas contienen la ruta y el nomrbe de la base de datos, el segundo el nomrbe de la base de datos y el ultimo la contrasena
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where ID = ?"); //Instruccion a la base de datos (hace referencia seleccione todos los ID registrados y busque el ID escrito en la field

            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();  //permite saber si se encontraron o no los valores (objeto de su clase)

            if (rs.next()) { //si encuentra los valores
                txt_nombre.setText(rs.getString("NombreAlumno")); //colocara lo que este en la instancia de Nombre aluno
                txt_grupo.setText(rs.getString("Grupo"));
            } else {  //sino encuentra los valores
                JOptionPane.showMessageDialog(null, "Alumno no registrado");
            }

        } catch (Exception e) {
            label_status.setText("Error al Buscar");
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
        Modificar
         */
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins", "Monsi", "monsi270405"); //conexion a base de datos
            PreparedStatement pst = cn.prepareStatement("update alumnos set NombreAlumno = ?, Grupo = ? where ID =" + ID);//instruccion a base de datos 
            /*
            vamos a pasar un parametro nuevo con update a las variables NombreAlumno y Grupo no identificadas por eso un ? en donde el ID sea el mismo el cual busco
            por ejemplo si esta editando el alumno de la variable ID 2, hara el update con lso nuevos parametros en la ID 2 e ingresara los neuvos datos ahi.
             */

            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_grupo.getText().trim());
            /*
            se utiliza 1 y 2 por que son los datos de pst los cuales se hara la instruccion de un update 
             */

            pst.executeUpdate();

            label_status.setText("Modificacion exitosa");
        } catch (Exception e) {
            label_status.setText("Error al Modificar");
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ins", "Monsi", "monsi270405"); //conexion a base de datos
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where ID = ?");
            
            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_grupo.setText("");
            
            label_status.setText("Eliminacion exitosa");
            
        } catch (Exception e) {
            label_status.setText("Error al Eliminar");
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
        Document documento = new Document(); //clase documento de la libreria itextpdf de terceros        
        
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Escritorio/reporte.pdf"));//en donde va a guardar el documento
            documento.open();
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell(" ID ");
            tabla.addCell(" Nombre del Alumno ");
            tabla.addCell(" Grupo ");
            
            try{
                
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins","Monsi","monsi270405");
                PreparedStatement pst = cn.prepareStatement("select * from alumnos");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){ //verifica si hay informacion den la base
                    
                    do{ 
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    }while(rs.next());
                    documento.add(tabla);
                }
                               
            }catch(DocumentException | SQLException e){
                System.out.println("Base de datos en imprimir "+e );
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        }catch(DocumentException | HeadlessException | FileNotFoundException e){
            System.out.println("Error al crear pdf "+e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
