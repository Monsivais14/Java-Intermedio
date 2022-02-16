
package clases;

import java.awt.HeadlessException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
        
        setSize(300, 378);//tamanno de ventana
        setTitle("Calculadora de ley de Ohm");
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        txt_voltaje = new javax.swing.JTextField();
        txt_corriente = new javax.swing.JTextField();
        txt_resistencia = new javax.swing.JTextField();
        txt_potencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        cmb_voltaje = new javax.swing.JComboBox<>();
        cmb_corriente = new javax.swing.JComboBox<>();
        cmb_resistencia = new javax.swing.JComboBox<>();
        cmb_potencia = new javax.swing.JComboBox<>();
        Limpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMennu_calcular = new javax.swing.JMenuItem();
        jMenu_Limpiar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_voltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));
        getContentPane().add(txt_corriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));
        getContentPane().add(txt_resistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));
        getContentPane().add(txt_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, -1));

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora de la ley de Ohm");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 30));

        jLabel2.setText("Voltaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Corriente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Resistencia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setText("Potencia ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Calcular.setFont(new java.awt.Font("Fira Sans", 1, 48)); // NOI18N
        Calcular.setText("=");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 80, 150));

        cmb_voltaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "KV" }));
        getContentPane().add(cmb_voltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, -1));

        cmb_corriente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "mA" }));
        getContentPane().add(cmb_corriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 60, -1));

        cmb_resistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ω", "KΩ", "MΩ" }));
        getContentPane().add(cmb_resistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, -1));

        cmb_potencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "W", "mW", "KW" }));
        getContentPane().add(cmb_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, -1));

        Limpiar.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        Limpiar.setText("C");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 80, 80));

        jMenu1.setText("Opciones");

        JMennu_calcular.setText("Calcular");
        JMennu_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMennu_calcularActionPerformed(evt);
            }
        });
        jMenu1.add(JMennu_calcular);

        jMenu_Limpiar.setText("Limpiar");
        jMenu_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_LimpiarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_Limpiar);

        jMenu3.setText("Modo");

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mas");

        jMenuItem5.setText("Acerca de");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMennu_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMennu_calcularActionPerformed
        //boton calcular en Menu
        Calcular.doClick(); //doClick hace click en el boton de calcular aun sin presionarlo
    }//GEN-LAST:event_JMennu_calcularActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //acerca de (mi git hub y razones de creacion del programa desde otra interfaz)    
        AcercaDe AD = new AcercaDe();
        AD.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        //boton calcular
        
        try{//inicio de Try para manejo de erorres(explicacion de funcion en catch)
        
        int validacion=0; //tipo bandera que verifica si solo hay dos campos llenados
        
        //cadena de if's para determinar cuantos campos hay validados
        if(txt_voltaje.getText().equals("")){
            validacion++;
        }if(txt_corriente.getText().equals("")){
            validacion++;
        }if(txt_resistencia.getText().equals("")){
            validacion++;
        }if(txt_potencia.getText().equals("")){
            validacion++;
        }
        
        //si solo hay 2 campos validados entra la accion
        if(validacion == 2){
            
            //obtiene el contenido de los textfield 
            String svoltaje = txt_voltaje.getText().trim();
            String scorriente = txt_corriente.getText().trim();
            String sresistencia = txt_resistencia.getText().trim();
            String spotencia = txt_potencia.getText().trim();
            
            if(svoltaje.equals("")){
                svoltaje="0";
            }if(scorriente.equals("")){
                scorriente="0";
            }if(sresistencia.equals("")){
                sresistencia="0";
            }if(spotencia.equals("")){
                spotencia="0";
            }
            
            /*
            Parseo de a de los doubles para obtener
            el valor de las Strings
            */
            double voltaje = Double.parseDouble(svoltaje);
            double corriente  = Double.parseDouble(scorriente);
            double resistencia = Double.parseDouble(sresistencia);
            double potencia = Double.parseDouble(spotencia);
            
            /*
            obtener el index de las combo y dividir o multiplicar dependiendo con if anidados
            hacer despues
            */
            //if's aumentando o bajando valores dependiendo la combo escogida
            if(cmb_voltaje.getSelectedIndex()==1){
                voltaje*=1000;
            }if(cmb_corriente.getSelectedIndex()==1){
                corriente/=1000;
            }if(cmb_resistencia.getSelectedIndex()==1){
                resistencia*=1000;
            }if(cmb_resistencia.getSelectedIndex()==2){
                resistencia*=10000;
            }if(cmb_potencia.getSelectedIndex()==1){
                potencia/=1000;
            }if(cmb_potencia.getSelectedIndex()==2){
                potencia*=1000;
            }
            
            //variantes de voltaje
            /*
            los if determinan cual de las combinaciones se realiza, en el caso de
            !medicion.isEmpty() quiere decir que no esta vacio y medicion.equals("0")
            hace referencia a que esta vacio o no tiene valor, el valor 0 se le
            annadio pasados ifs
            
            al momento de encontrar en que if esta la accion a ejecutar, entra
            y muestra un String retornado en el txt_medicion con su formula
            y los valores pasados para hacerla posible, el primero es el primer
            valor necesario para la operacion y asi con el segundo, el tercer
            parametro es el numero de operacion a realizar las cuales ya estan
            definidas en el metodo y el cuarto es el tipo de valor el cual se 
            va a retornar
            */
            if(!svoltaje.isEmpty()&&!scorriente.isEmpty()&&sresistencia.equals("0")&&spotencia.equals("0")){
                txt_resistencia.setText(formula(voltaje, corriente, 0, 3));
                txt_potencia.setText(formula(voltaje, corriente, 1, 4));
            }
            if(!svoltaje.isEmpty()&&scorriente.equals("0")&&!sresistencia.isEmpty()&&spotencia.equals("0")){
                txt_corriente.setText(formula(voltaje, resistencia, 0, 2));
                txt_potencia.setText(formula(voltaje, resistencia, 2, 4));
            }
            if(!svoltaje.isEmpty()&&scorriente.equals("0")&&sresistencia.equals("0")&&!spotencia.isEmpty()){
                txt_corriente.setText(formula(voltaje, potencia, 3, 2));
                txt_resistencia.setText(formula(voltaje, potencia, 2, 3));
            }
            //variantes de corriente
            if(svoltaje.equals("0")&&!scorriente.isEmpty()&&!sresistencia.isEmpty()&&spotencia.equals("0")){
                txt_voltaje.setText(formula(corriente, resistencia, 1, 1));
                txt_potencia.setText(formula(corriente, resistencia, 4, 4));
            }
            if(svoltaje.equals("0")&&!scorriente.isEmpty()&&sresistencia.equals("0")&&!spotencia.isEmpty()){
                txt_voltaje.setText(formula(corriente, potencia, 7, 1));
                txt_resistencia.setText(formula(voltaje, potencia, 2, 3));
            }
            //variantes de potencia
            if(svoltaje.equals("0")&&scorriente.equals("0")&&!sresistencia.isEmpty()&&!spotencia.isEmpty()){
                txt_voltaje.setText(formula(resistencia, potencia, 5, 1));
                txt_corriente.setText(formula(resistencia, potencia, 6, 2));
            }
            
        }else if(validacion == 4){ //al haber 4 campos llenos 
            JOptionPane.showMessageDialog(null, "Debes de llenar solo dos campos");
        }else{ // al haber 1 campo llenos
            JOptionPane.showMessageDialog(null, "Debes de llenar dos campos");
        }
        
        }catch(HeadlessException | NumberFormatException e){
            /*
            El try-catch es para manejo de errores, asi como si en algun momento 
            se ingresa algun numero no valido o al ingresar letras se muestra un
            mensaje en pantalla donde muestra el porque no se puede efectuar
            la operacion y ademas en consola aparece el error en codigo para desarrollador 
            */
            JOptionPane.showMessageDialog(null, "Error al realizar el calculo, \nporfavor solamente ingresa numeros");
            System.err.println("Error en boton calcular, identificacion de error = ("+e.getMessage()+")");
        }
    }//GEN-LAST:event_CalcularActionPerformed

    public String formula(double num1, double num2,int caso, int tipo){
        /*
        -num1 hace referencia a el primer parametro pasado de la formula
        -num2 hace referenacia a el segundo parametro de al formula
        -caso hace referencia a que tipo de formula se efectuara
        -tipo hace referencia a que tipo es(
            volt = 1
            ampere = 2
            resistencia = 3 
            watt = 4
            ) para hacer -
            seleccion de su caja combo en el caso de ser mayor a 1000
        -aux solamente es el que efectua la operacion y pasa a ser string retornado
        */
        double aux=0;
        
        //formulas en casos
        if(caso==0){
           aux=num1/num2;
        }else if(caso == 1){
           aux=num1*num2;
        }else if(caso == 2){
            aux= Math.pow(num1, 2)/num2;
        }else if(caso == 3){
            aux= num2/num1;
        }else if(caso == 4){
            aux = Math.pow(num1, 2)*num2;
        }else if(caso == 5){
            aux = Math.sqrt(num2*num1);
        }else if(caso == 6){
            aux = Math.sqrt(num2/num1);
        }else if(caso == 7){
            aux = num2/num1;
        }
        //cambio de combobox con tipo
        /*
        el tipo pasado por parametro sirve para 
        encontrar determinar que tipo de medicion es
        la que se hara el cambio en su JComboBox dependiendo
        de los que tiene ya definidos ademas de el tipo de 
        valor asi como en el voltaje, si es menor a 1000
        */
        if(aux<1){  //if para casos en valores menores a 1, como los mW y los mA que son menores a 1
            aux/=1000; //divide el valor para obtener el vaor en mili(W || A)
            switch(tipo){ //dependiendo del tipo de medicion cambia la seleccion
                case 2 : //tipo 2 = Corriente
                    cmb_corriente.setSelectedIndex(1);
                    break;
                case 4 : //tipo 4 == Potencia 
                    cmb_potencia.setSelectedIndex(1);
                    break;
            }
        }else if(aux>=1000){ //en el caso de que sea mayor a 1000 cambia la combobox
            aux /= 1000;
            switch(tipo){
                case 1 :
                    cmb_voltaje.setSelectedIndex(1); //KV
                    break;
                case 3 :
                    cmb_resistencia.setSelectedIndex(1);//Kohms
                    break;
                case 4 :
                    cmb_potencia.setSelectedIndex(2);//KW
                    break;
            }     
        }else if(aux>=10000){ //cuando es mayor a 10000, solamente aplica en megaohms
            aux /= 10000;
            switch(tipo){
                case 3 :
                    cmb_resistencia.setSelectedIndex(2);//Mohms
                    break;
            }
        }
        /*
        Para evitar que los decimales sean muchos hay que reducir la cantidad de 
        decimales que contiene el String a retornar; en este caso se hace al 
        momento de convertir la variable aux que es el resultado de la operacion
        a String para ser retornado dentro de un JTextField.
        
        Decimal format es un objeto para reducir la cantidad de decimales de un
        numero real, en este caso el objeto "df" utiliza su metodo .format() en 
        la variable aux al momento de ser un String resultado a retornar.
        (#0.000) hace referencia a la cantidad de decimales que seran visibles
        y puede ser modificado para mostrar mas o mostrar menos.
        */
        DecimalFormat df = new DecimalFormat("#0.000"); 
        String resultado = String.valueOf(df.format(aux));
        return resultado;
    }
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // Limpiar campos (limpia los campos JTextfield)
        txt_voltaje.setText("");
        txt_corriente.setText("");
        txt_resistencia.setText("");
        txt_potencia.setText("");
        cmb_voltaje.setSelectedIndex(0);
        cmb_corriente.setSelectedIndex(0);
        cmb_resistencia.setSelectedIndex(0);
        cmb_potencia.setSelectedIndex(0);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void jMenu_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_LimpiarActionPerformed
        //JMenu de Limpiar
        Limpiar.doClick();
    }//GEN-LAST:event_jMenu_LimpiarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JMenuItem JMennu_calcular;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> cmb_corriente;
    private javax.swing.JComboBox<String> cmb_potencia;
    private javax.swing.JComboBox<String> cmb_resistencia;
    private javax.swing.JComboBox<String> cmb_voltaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenu_Limpiar;
    private javax.swing.JTextField txt_corriente;
    private javax.swing.JTextField txt_potencia;
    private javax.swing.JTextField txt_resistencia;
    private javax.swing.JTextField txt_voltaje;
    // End of variables declaration//GEN-END:variables
}
