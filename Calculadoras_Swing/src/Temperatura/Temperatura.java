package Temperatura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Temperatura extends JFrame implements ActionListener {

    JTextField celsius,fahrenheit,kelvin,rankine;
    JLabel labelcelsius,labelfahrenheit,labelkelvin,labelrankine;
    JLabel imagecelsus,imagefahrenheit,imagekelvin,imagerankine;
    JButton calcular,restablecer;

    public Temperatura(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperatura");

        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("images/icon.png"))).getImage());
        ImageIcon image1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("images/C.png")));
        ImageIcon image2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("images/F.png")));
        ImageIcon image3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("images/K.png")));
        ImageIcon image4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("images/R.png")));
        imagecelsus = new JLabel(image1);
        imagecelsus.setBounds(20, 10, 80, 80);
        add(imagecelsus);
        imagefahrenheit = new JLabel(image2);
        imagefahrenheit.setBounds(20, 90, 80, 80);
        add(imagefahrenheit);
        imagekelvin = new JLabel(image3);
        imagekelvin.setBounds(20, 170, 80, 80);
        add(imagekelvin);
        imagerankine = new JLabel(image4);
        imagerankine.setBounds(20, 250, 80, 80);
        add(imagerankine);

        labelcelsius = new JLabel("Celsius");
        labelcelsius.setBounds(110,20,80,30);
        labelcelsius.setFont(new Font("TimesRoman",Font.PLAIN,15));
        add(labelcelsius);
        labelfahrenheit = new JLabel("Fahrenheit");
        labelfahrenheit.setBounds(110,100,80,30);
        labelfahrenheit.setFont(new Font("TimesRoman",Font.PLAIN,15));
        add(labelfahrenheit);
        labelfahrenheit = new JLabel("Kelvin");
        labelfahrenheit.setBounds(110,180,80,30);
        labelfahrenheit.setFont(new Font("TimesRoman",Font.PLAIN,15));
        add(labelfahrenheit);
        labelfahrenheit = new JLabel("Rankine");
        labelfahrenheit.setBounds(110,260,80,30);
        labelfahrenheit.setFont(new Font("TimesRoman",Font.PLAIN,15));
        add(labelfahrenheit);

        celsius = new JTextField();
        celsius.setBounds(110,50,100,30);
        celsius.setHorizontalAlignment(SwingConstants.CENTER);
        add(celsius);
        fahrenheit = new JTextField();
        fahrenheit.setBounds(110,130,100,30);
        fahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
        add(fahrenheit);
        kelvin = new JTextField();
        kelvin.setBounds(110,210,100,30);
        kelvin.setHorizontalAlignment(SwingConstants.CENTER);
        add(kelvin);
        rankine = new JTextField();
        rankine.setBounds(110,290,100,30);
        rankine.setHorizontalAlignment(SwingConstants.CENTER);
        add(rankine);

        /////////

        calcular = new JButton("Calcular");
        calcular.setBounds(130,350,90,50);
        calcular.addActionListener(this);
        add(calcular);

        restablecer = new JButton("Restablecer");
        restablecer.setBounds(10,350,110,50);
        restablecer.addActionListener(this);
        add(restablecer);
    }
    public void actionPerformed(ActionEvent e) {
        String scelsius = celsius.getText().trim();
        String sfahrenheit = fahrenheit.getText().trim();
        String skelvin = kelvin.getText().trim();
        String srankine = rankine.getText().trim();
        double numcelsius,numfahrenheit,numkelvin,numrankine;

        if(e.getSource()==restablecer){
                celsius.setText("");
                fahrenheit.setText("");
                kelvin.setText("");
                rankine.setText("");
        }
        if(e.getSource()==calcular) {
            if (!scelsius.isEmpty() && sfahrenheit.isEmpty() && skelvin.isEmpty() && srankine.isEmpty()) {
                numcelsius = Double.parseDouble(scelsius);
                numfahrenheit = ((9 * numcelsius) / 5) + 32;
                numkelvin = numcelsius + 273.15;
                numrankine = (numcelsius * 1.8) + 491.67;
                setF(numfahrenheit);
                setK(numkelvin);
                setR(numrankine);
            }
            if (scelsius.isEmpty() && !sfahrenheit.isEmpty() && skelvin.isEmpty() && srankine.isEmpty()) {
                numfahrenheit = Double.parseDouble(sfahrenheit);
                numcelsius = (numfahrenheit - 32) * 5 / 9;
                numkelvin = (numfahrenheit - 32) * 5 / 9 + 273.15;
                numrankine = numfahrenheit + 491.67;
                setC(numcelsius);
                setK(numkelvin);
                setR(numrankine);
            }
            if (scelsius.isEmpty() && sfahrenheit.isEmpty() && !skelvin.isEmpty() && srankine.isEmpty()) {
                numkelvin = Double.parseDouble(skelvin);
                numcelsius = numkelvin - 273.15;
                numfahrenheit = (numkelvin - 273.15) * 9 / 5 + 32;
                numrankine = numkelvin * 9 / 5;
                setC(numcelsius);
                setF(numfahrenheit);
                setR(numrankine);
            }
            if (scelsius.isEmpty() && sfahrenheit.isEmpty() && skelvin.isEmpty() && !srankine.isEmpty()) {
                numrankine = Double.parseDouble(srankine);
                numcelsius = (numrankine - 491.67) * 5 / 9;
                numfahrenheit = numrankine - 459.67;
                numkelvin = numrankine * 5 / 9;
                setC(numcelsius);
                setF(numfahrenheit);
                setK(numkelvin);
            }
            /////
            if (scelsius.isBlank() && sfahrenheit.isBlank() && skelvin.isBlank() && srankine.isBlank()) {
                ex();
            } if (scelsius.isBlank() && !sfahrenheit.isBlank() && !skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && sfahrenheit.isBlank() && !skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && !sfahrenheit.isBlank() && skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && !sfahrenheit.isBlank() && !skelvin.isBlank() && srankine.isBlank()) {
                ex();
            } if (scelsius.isBlank() && sfahrenheit.isBlank() && !skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && sfahrenheit.isBlank() && !skelvin.isBlank() && srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && sfahrenheit.isBlank() && skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (scelsius.isBlank() && !sfahrenheit.isBlank() && !skelvin.isBlank() && srankine.isBlank()) {
                ex();
            } if (scelsius.isBlank() && !sfahrenheit.isBlank() && skelvin.isBlank() && !srankine.isBlank()) {
                ex();
            } if (!scelsius.isBlank() && !sfahrenheit.isBlank() && skelvin.isBlank() && srankine.isBlank()) {
                ex();
            } if(!scelsius.isBlank()&&!sfahrenheit.isBlank()&&!skelvin.isBlank()&&!srankine.isBlank()){
                ex();
            }
        }
    }
    public static void main(String []args){
        Temperatura Temperatura1 = new Temperatura();
        Temperatura1.setBounds(0,0,250,450);
        Temperatura1.setVisible(true);
        Temperatura1.setResizable(false);
        Temperatura1.setLocationRelativeTo(null);
    }
    ////////////////////////////////////////////////
    private void setC(double numcelcelsius){
        String scelcius = String.valueOf(String.format("%.4f",numcelcelsius));
        celsius.setText(scelcius+"°");
    }private void setF(double numfahrenheit){
        String sfahrenheit = String.valueOf(String.format("%.4f",numfahrenheit));
        fahrenheit.setText(sfahrenheit+"°");
    }private void setK(double numkelvin){
        String skelvin = String.valueOf(String.format("%.4f",numkelvin));
        kelvin.setText(skelvin);
    }private void setR(double numrankine){
        String srankine = String.valueOf(String.format("%.4f",numrankine));
        rankine.setText(srankine+"°");
    }private static void ex(){
        JOptionPane.showMessageDialog(null, "Ingresa un solo numero");
    }
}