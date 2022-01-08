
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class GraficarStatus extends javax.swing.JFrame {

    String user;
    int nuevoIngreso, noReparado,enRevision, reparado, entregado; //ti0pos de estatus
    
    String[] vector_estatus_nombre = new String[5]; //se guardaran las consultas de bd
    int[] vector_estatus_cantidad = new int[5]; //cuantos equipos de cada estatus hay
    
    public GraficarStatus() {
        initComponents();
        user = Login.user;
        
        setSize(549, 450);
        setResizable(false);
        setTitle("Tecnico - Sesion de "+user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(JLabel_Wallpaper.getWidth(), JLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        JLabel_Wallpaper.setIcon(icono);
        this.repaint(); //actualiza cambios

        try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //cuenta la cantidad de equipos con sus status 
                    //selecciona status contando la cantidad de status que existen y va a modificar la cantidad modificada en Cantidad y los agrupara en orden con status
                    "select status, count(status) as Cantidad from equipos group by status;");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int posicion = 0;
                
                do{
                    //llenado de vectores
                    vector_estatus_nombre[posicion] = rs.getString(1); //columna de status de base de datos
                    vector_estatus_cantidad[posicion] = rs.getInt(2); //columna de cantidad
                    
                    if(vector_estatus_nombre[posicion].equalsIgnoreCase("En revision")){
                        enRevision = vector_estatus_cantidad[posicion]; //almacena la cantidad que obtenda el vector dependiendo su posicion
                    }else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Entregado")){
                        entregado = vector_estatus_cantidad[posicion]; //almacena la cantidad que obtenda el vector dependiendo su posicion
                    }else if(vector_estatus_nombre[posicion].equalsIgnoreCase("No reparado")){
                        noReparado = vector_estatus_cantidad[posicion]; //almacena la cantidad que obtenda el vector dependiendo su posicion
                    }else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Nuevo Ingreso")){
                        nuevoIngreso = vector_estatus_cantidad[posicion]; //almacena la cantidad que obtenda el vector dependiendo su posicion
                    }else if(vector_estatus_nombre[posicion].equalsIgnoreCase("Reparado")){
                        reparado = vector_estatus_cantidad[posicion]; //almacena la cantidad que obtenda el vector dependiendo su posicion
                    }//asi se almacena la cantidad de equipos con ese estatus almacenados en un int invididualmente
                    
                    posicion++;
                    
                }while(rs.next());
                
            }
            
        } catch (SQLException e) {
            System.err.println("Error al almacenar status en int con vectores y bd = "+e);
            JOptionPane.showMessageDialog(null, "Error al graficar");
        }//fuera del try
        
        repaint(); //invoca al metodo para poder graficar(paint)
        
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
        Mostrar = new javax.swing.JButton();
        JLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grafica de estatus");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));
        getContentPane().add(JLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        //bug en clase graphics
        //la solucion del bug es reacomodar la resolucion del jframe
        setSize(550, 450);
    }//GEN-LAST:event_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(GraficarStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Wallpaper;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    public int statusMasRepetido(int NuevoIngreso ,int NoReparado, int EnRevision, int Reparado, int Entregado ){
        //determina el int con mas valor y lo retorna
        if(NuevoIngreso>NoReparado&&NuevoIngreso>EnRevision&&NuevoIngreso>Reparado&&NuevoIngreso>Entregado){
            return NuevoIngreso;
        }else if(NoReparado>EnRevision&&NoReparado>Reparado&&NoReparado>Entregado){
            return NoReparado;
        }else if(EnRevision>Reparado&&EnRevision>Entregado){
            return EnRevision;
        }else if(Reparado>Entregado){
            return Reparado;
        }else{
            return Entregado;
        }
        
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
        int EstatusMasRepetido = statusMasRepetido(nuevoIngreso, noReparado, enRevision, reparado, entregado);
        
        //largos de cada barra
        int largo_NuevoIngreso = nuevoIngreso*400/EstatusMasRepetido; //400 es por los pixeles
        int Largo_NoReparado = noReparado*400/EstatusMasRepetido;
        int Largo_EnRevision = enRevision*400/EstatusMasRepetido;
        int Largo_Reparado = reparado*400/EstatusMasRepetido;
        int Largo_Entregado = entregado*400/EstatusMasRepetido;
        
        
        //graficacon sobre interfaz
        g.setColor(Color.yellow);//amarillo
        g.fillRect(100, 100, largo_NuevoIngreso, 40); //tamanno y coordenadas
        g.drawString("Nuevo Ingreso", 10, 118); //texto y coordenadas
        g.drawString("Cantidad: "+nuevoIngreso, 10, 133); //cantidad y coordenadas
        
        g.setColor(Color.red);//rojo
        g.fillRect(100, 150, Largo_NoReparado, 40); //tamanno y coordenadas
        g.drawString("No Reparado", 10, 168); //texto y coordenadas
        g.drawString("Cantidad: "+noReparado, 10, 183); //cantidad y coordenadas
        
        g.setColor(Color.BLACK);//Negro
        g.fillRect(100, 200, Largo_EnRevision, 40); //tamanno y coordenadas
        g.drawString("En revision:", 10, 218); //texto y coordenadas
        g.drawString("Cantidad: "+enRevision, 10, 233); //cantidad y coordenadas
        
        g.setColor(Color.white);//blanco
        g.fillRect(100, 250, Largo_Reparado, 40); //tamanno y coordenadas
        g.drawString("Reparado:", 10, 268); //texto y coordenadas
        g.drawString("Cantidad: "+reparado, 10, 283); //cantidad y coordenadas
        
        g.setColor(Color.green);//verde
        g.fillRect(100, 300, Largo_Entregado, 40); //tamanno y coordenadas
        g.drawString("Entregado", 10, 318); //texto y coordenadas
        g.drawString("Cantidad: "+entregado, 10, 333); //cantidad y coordenadas
        
    }
    
}