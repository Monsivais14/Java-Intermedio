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

public class GraficarMarcas extends javax.swing.JFrame {

    String user;

    int[] vector_marcas_cantidad = new int[11];
    String[] vector_marcas_nombre = new String[11];
    int Acer, Alienware, Apple, Asus, Brother, Dell, HP, Lenovo, Samsung, Toshiba, Xerox;//marcas

    public GraficarMarcas() {
        initComponents();
        user = Login.user;

        setSize(549, 450);
        setResizable(false);
        setTitle("Tecnico - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg"); //imagen wallpaper
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(JLabel_Wallpaper.getWidth(), JLabel_Wallpaper.getWidth(), Image.SCALE_DEFAULT)); //escalara la imagen del jlabel
        JLabel_Wallpaper.setIcon(icono);

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    //selecciona el campo marca contando la cantidad de marcas y haciendo una tabla con la marca y ordenandolos de acuerdo a la amrca
                    "select marca,count(marca) as Marcas from equipos group by marca");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                int posicion = 0;

                do {
                    //vaciado de datos en vectores
                    vector_marcas_nombre[posicion] = rs.getString(1); //1 por que en la columan 1 es donde se encuentran los nombres de las marcas
                    vector_marcas_cantidad[posicion] = rs.getInt(2);//la columna contiene la contidad de equipos que contiene cada marca

                    //cada if vacia el valor de la contidad de cada marca 
                    if (vector_marcas_nombre[posicion].equalsIgnoreCase("Acer")) {
                        Acer = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Alienware")) {
                        Alienware = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Apple")) {
                        Apple = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Asus")) {
                        Asus = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Brother")) {
                        Brother = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Dell")) {
                        Dell = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("HP")) {
                        HP = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Lenovo")) {
                        Lenovo = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Samsung")) {
                        Samsung = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Toshiba")) {
                        Toshiba = vector_marcas_cantidad[posicion];
                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Xerox")) {
                        Xerox = vector_marcas_cantidad[posicion];
                    }

                    posicion++;

                } while (rs.next());

            }

        } catch (SQLException e) { //catch de conexion abase de datos
            System.err.println("Error en consulta de base de datos = " + e);
            JOptionPane.showMessageDialog(null, "Error al graficar");
        }

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
        jLabel1.setText("Grafica de marcas");
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
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarMarcas().setVisible(true);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int total_marcas = Acer + Alienware + Apple + Asus + Brother + Dell + HP + Lenovo + Samsung + Toshiba + Xerox;

        //valor en grados a graficar
        int grados_Acer = Acer * 360 / total_marcas;
        int grados_Alienware = Alienware * 360 / total_marcas;
        int grados_Apple = Apple * 360 / total_marcas;
        int grados_Asus = Asus * 360 / total_marcas;
        int grados_Brother = Brother * 360 / total_marcas;
        int grados_Dell = Dell * 360 / total_marcas;
        int grados_HP = HP * 360 / total_marcas;
        int grados_Lenovo = Lenovo * 360 / total_marcas;
        int grados_Samsung = Samsung * 360 / total_marcas;
        int grados_Tosiba = Toshiba * 360 / total_marcas;
        int grados_Xerox = Xerox * 360 / total_marcas;

        g.setColor(new Color(175, 122, 197));//Acer morado
        g.fillArc(25, 100, 270, 270, 0, grados_Acer);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 120, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Acer + " de Acer", 340, 135); //String y localizacion x y 

        g.setColor(new Color(0, 255, 0));//Alienware verde
        g.fillArc(25, 100, 270, 270, grados_Acer, grados_Alienware);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 150, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Alienware + " de Alienware", 340, 165); //String y localizacion x y 

        g.setColor(new Color(0, 255, 255));//Apple verde otro tono
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware, grados_Apple);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 180, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Apple + " de Apple", 340, 195); //String y localizacion x y 

        g.setColor(new Color(55, 0, 255));//Asus azul
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple, grados_Asus);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 210, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Asus + " de Asus", 340, 225); //String y localizacion x y 

        g.setColor(new Color(255, 255, 255));//Brother blanco
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus, grados_Brother);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 240, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Brother + " de Brother", 340, 255); //String y localizacion x y 

        g.setColor(new Color(247, 220, 111));//Dell Amarillo
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother, grados_Dell);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 270, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Dell + " de Dell", 340, 285); //String y localizacion x y 

        g.setColor(new Color(21, 42, 160));//HP Azul Marino
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother + grados_Dell, grados_HP);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 300, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(HP + " de HP", 340, 315); //String y localizacion x y 

        g.setColor(new Color(215, 96, 0));//Lenovo Naranja
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother + grados_Dell + grados_HP, grados_Lenovo);//parametros de localizacion, dimensiones y graficado
        g.drawRect(310, 330, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Lenovo + " de Lenovo", 340, 345); //String y localizacion x y 

        g.setColor(new Color(215, 96, 140));//Samsung rosa
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother + grados_Dell + grados_HP + grados_Lenovo, grados_Samsung);//parametros de localizacion, dimensiones y graficado
        g.drawRect(430, 120, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Samsung + " de Samsung", 460, 135); //String y localizacion x y 

        g.setColor(new Color(215, 196, 25));//Toshiba Amarillo canario
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother + grados_Dell + grados_HP + grados_Lenovo + grados_Samsung, grados_Tosiba);//parametros de localizacion, dimensiones y graficado
        g.drawRect(430, 150, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Toshiba + " de Toshiba", 460, 165); //String y localizacion x y 

        g.setColor(new Color(93, 173, 226));//Xerox Azul Celeste
        g.fillArc(25, 100, 270, 270, grados_Acer + grados_Alienware + grados_Apple + grados_Asus + grados_Brother + grados_Dell + grados_HP + grados_Lenovo + grados_Samsung + grados_Tosiba, grados_Xerox);//parametros de localizacion, dimensiones y graficado
        g.drawRect(430, 180, 20, 20); //cuadrado de color localizacion y dimensiones
        g.drawString(Xerox + " de Xerox", 460, 195); //String y localizacion x y 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Wallpaper;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
