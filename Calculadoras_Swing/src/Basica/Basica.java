package Basica;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Basica extends JFrame implements ActionListener {
    JTextField field;
    JButton restablecer,borrar,porcentaje,dividir;
    JButton siete,ocho,nueve,multiplicar;
    JButton cuatro,cinco,seis, restar;
    JButton uno, dos, tres, mas;
    JButton camsig,cero,punto,calcular;
    JLabel label;
    public Basica(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora Basica");
        field = new JTextField("");
        field.setBounds(20,20,230,40);
        field.setHorizontalAlignment(SwingConstants.RIGHT);
        field.setFont(new Font("ITALIC", Font.PLAIN,28));
        RestrictedTextField limite =  new RestrictedTextField(field);
        limite.setLimit(14);
        add(field);

        label = new JLabel("0");
        label.setBounds(180,60,100,30);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        add(label);

        ///
        restablecer = new JButton("AC");
        restablecer.setBounds(20,90,50,50);
        restablecer.addActionListener(this);
        add(restablecer);
        borrar = new JButton("D");
        borrar.setBounds(80,90,50,50);
        borrar.addActionListener(this);
        add(borrar);
        porcentaje = new JButton("%");
        porcentaje.setBounds(140,90,50,50);
        porcentaje.addActionListener(this);
        add(porcentaje);
        dividir = new JButton("÷");
        dividir.setBounds(200,90,50,50);
        dividir.addActionListener(this);
        add(dividir);
        ///
        siete = new JButton("7");
        siete.setBounds(20,150,50,50);
        siete.addActionListener(this);
        add(siete);
        ocho = new JButton("8");
        ocho.setBounds(80,150,50,50);
        ocho.addActionListener(this);
        add(ocho);
        nueve = new JButton("9");
        nueve.setBounds(140,150,50,50);
        nueve.addActionListener(this);
        add(nueve);
        multiplicar = new JButton("X");
        multiplicar.setBounds(200,150,50,50);
        multiplicar.addActionListener(this);
        add(multiplicar);
        ///
        cuatro = new JButton("4");
        cuatro.setBounds(20,210,50,50);
        cuatro.addActionListener(this);
        add(cuatro);
        cinco = new JButton("5");
        cinco.setBounds(80,210,50,50);
        cinco.addActionListener(this);
        add(cinco);
        seis = new JButton("6");
        seis.setBounds(140,210,50,50);
        seis.addActionListener(this);
        add(seis);
        restar = new JButton("-");
        restar.setBounds(200,210,50,50);
        restar.addActionListener(this);
        add(restar);
        ///
        uno = new JButton("1");
        uno.setBounds(20,270,50,50);
        uno.addActionListener(this);
        add(uno);
        dos = new JButton("2");
        dos.setBounds(80,270,50,50);
        dos.addActionListener(this);
        add(dos);
        tres = new JButton("3");
        tres.setBounds(140,270,50,50);
        tres.addActionListener(this);
        add(tres);
        mas = new JButton("+");
        mas.setBounds(200,270,50,50);
        mas.addActionListener(this);
        add(mas);
        ///
        cero = new JButton("0");
        cero.setBounds(80,330,50,50);
        cero.addActionListener(this);
        add(cero);
        punto = new JButton(".");
        punto.setBounds(140,330,50,50);
        punto.addActionListener(this);
        add(punto);
        camsig = new JButton("+/-");
        camsig.setBounds(20,330,50,50);
        camsig.addActionListener(this);
        add(camsig);
        calcular = new JButton("=");
        calcular.setBounds(200,330,50,50);
        calcular.addActionListener(this);
        add(calcular);
    }
    public void actionPerformed(ActionEvent e) {
        String sacomulado="";
        String aux;
        int i = 0;
        if(e.getSource()==uno){
            aux=field.getText(); i=1;
            field.setText(num(aux,sacomulado,i));               //Numeros
        }if(e.getSource()==dos){
            aux=field.getText(); i=2;
            field.setText(num(aux,sacomulado,i));               //En la funcion ado el auxilar mas el valor i que es el numeor a agregar y lo retorno a un String el cual estara en setText
        }if(e.getSource()==tres){
            aux=field.getText(); i=3;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==cuatro){
            aux=field.getText(); i=4;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==cinco){
            aux=field.getText(); i=5;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==seis){
            aux=field.getText(); i=6;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==siete){
            aux=field.getText(); i=7;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==ocho){
            aux=field.getText(); i=8;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==nueve){
            aux=field.getText(); i=9;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==cero){
            aux=field.getText(); i=0;
            field.setText(num(aux,sacomulado,i));
        }if(e.getSource()==punto){
            aux=field.getText();
            if(!aux.contains(".")){
                sacomulado=aux+".";
                field.setText(sacomulado);
            }
        }if(e.getSource()==camsig){
            aux=field.getText(); i=10;
            field.setText(num(aux,sacomulado,i));
        }
        ////////////////////////////////////////
        if(e.getSource()==restablecer){
            field.setText("");
            label.setText("0");
        }
        if(e.getSource()==borrar){
            aux=field.getText();
            if(!aux.isBlank()){
                i=aux.length(); i-=1;
                sacomulado =  aux.substring(0,i);
                field.setText(sacomulado);
            }
        }if(e.getSource()==mas){
            aux=field.getText();
            label.setText(aux+"+");
            field.setText("");
        }if(e.getSource()==restar){
            aux=field.getText();
            label.setText(aux+"-");
            field.setText("");
        }if(e.getSource()==multiplicar){
            aux=field.getText();
            label.setText(aux+"*");
            field.setText("");
        }if(e.getSource()==dividir){
            aux=field.getText();
            label.setText(aux+"/");
            field.setText("");
        }if(e.getSource()==porcentaje){
            aux=field.getText();
            label.setText(aux+"%");
            field.setText("");
        }
        ////////////////////////////////////////
        double resulado,num2=0,num3=0;
        if(e.getSource()==calcular){
            sacomulado=label.getText();
            aux=field.getText();
            if(sacomulado.contains("+")){
                label.setText(sacomulado+aux);
                re(sacomulado,aux,num2,num3,i);
            }if(sacomulado.contains("-")){
                label.setText(sacomulado+aux);
                re(sacomulado,aux,num2,num3,i);
            }if(sacomulado.contains("*")){
                label.setText(sacomulado+aux);
                re(sacomulado,aux,num2,num3,i);
            }

            if(sacomulado.contains("/")){
                label.setText((sacomulado+aux));
                re(sacomulado,aux,num2,num3,i);
            }

            if(sacomulado.contains("%")){
                label.setText(sacomulado+aux);
                re(sacomulado,aux,num2,num3,i);
            }
        }
        ////////////////////////////////////////
    }
    private void re(String sacomulado,String aux,double num2,double num3,int i) {
        i=sacomulado.length();i-=1;
        String sacomulado1 = sacomulado;
        if(sacomulado1.contains("+")){
            sacomulado = sacomulado.substring(0,i);
            num2=Double.parseDouble(sacomulado);
            num3=Double.parseDouble(aux);
            if(sacomulado.contains("-")){
                num2+=num3;
            }
            sacomulado = String.valueOf(num2+num3);
            field.setText(sacomulado);
        }if(sacomulado1.contains("-")){
            sacomulado = sacomulado.substring(0,i);
            num2=Double.parseDouble(sacomulado);
            num3=Double.parseDouble(aux);
            sacomulado=String.valueOf(num2-num3);
            field.setText(sacomulado);
        }if(sacomulado1.contains("*")){
            sacomulado=sacomulado.substring(0,i);
            num2=Double.parseDouble(sacomulado);
            num3=Double.parseDouble(aux);
            if(sacomulado.contains("-")){
                num2+=num3;
            }
            sacomulado=String.valueOf(num2*num3);
            field.setText(sacomulado);
        }if(sacomulado1.contains("/")){
            sacomulado = sacomulado.substring(0,i);
            num2=Double.parseDouble(sacomulado);
            num3=Double.parseDouble(aux);
            if(sacomulado.contains("-")){
                num2+=num3;
            }
            sacomulado=String.valueOf((num2)/num3);
            field.setText(sacomulado);
        }if(sacomulado.contains("%")){
            sacomulado=sacomulado.substring(0,i);
            num2=Double.parseDouble(sacomulado);
            num3=Double.parseDouble(aux);
            sacomulado=String.valueOf((num3/100)*(num2));
            field.setText(sacomulado);
        }
    }
    private static String num(String aux,String sacomulado,int i){
        int e=i;
        if(i<=9){
          for(; i==e; i++){
              sacomulado=aux+i;
          }
        } else if(i==10){
            int d=aux.length();
            if(aux.contains("-")){
                aux=aux.substring(1,d);
                sacomulado="+"+aux;
            }else if(aux.contains("+")){
                aux=aux.substring(1,d);
                sacomulado="-"+aux;
            } else if(!aux.contains("-")&&!aux.contains("+")){
                sacomulado="-"+aux;
            }
        }
        return sacomulado;
    }
    public static void main(String[] args) {
        Basica Basica1 = new Basica();
        Basica1.setVisible(true);
        Basica1.setBounds(0,0,285,430);
        Basica1.setLocationRelativeTo(null);
        Basica1.setResizable(false);
    }
}