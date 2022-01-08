
package ventanas;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    
    private JTextField textfield;
    private JLabel label;
    private JButton boton;
    
    public Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label = new JLabel("Mensaje: ");
        label.setBounds(15, 10, 100, 30);
        add(label);
        
        textfield = new JTextField();
        textfield.setBounds(80,16,190,20);
        add(textfield);
        
        boton =  new JButton("Mostrar");
        boton.setBounds(10, 60, 100, 30);
        boton.addActionListener(this);
        add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){
            String cadena = textfield.getText();
            JOptionPane.showMessageDialog(null,cadena);
        }
    }
    
    public static void main(String []args){
        Formulario Formulario = new Formulario();
        Formulario.setBounds(0,0,300,150);
        Formulario.setVisible(true);
        Formulario.setLocationRelativeTo(null);
        Formulario.setResizable(false);
    }
}
