package com.leng.analizador.frontEnd;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.leng.analizador.frontEnd.compnents.ConstructorPanel;

import java.awt.Font;
import java.awt.Color;

public class Panel1 extends ConstructorPanel {

    //// panel de lot text area 

    private Panel1Escritura panel1Escritura;
    private JTextArea  areaTextError;
    private JLabel titulo;

    public Panel1() {
        super(new Color(245, 245, 220));
      
        panel1Escritura = new Panel1Escritura();
        setcomponentes1();
        System.out.println(" se esta creando un panel ");
    }

    public void setcomponentes1() {

        areaTextError = new JTextArea();
        areaTextError.setBounds(50, 430, 500, 150);
        areaTextError.setBackground(Color.black);
        areaTextError.setFont(new Font("Arial", Font.BOLD, 20));
        areaTextError.setForeground(Color.red);
        areaTextError.setEditable(false);

        // Configurar el panel de desplazamiento para el área de texto de errores
        JScrollPane scrollBarError = new JScrollPane(areaTextError);
        scrollBarError.setBounds(50, 430, 500, 150);

        this.add(panel1Escritura);
       // this.add(scrollBar);
        this.add(areaTextError);
        this.add(scrollBarError);
    }
    
/*
    public String getEscritura(){
        return panel1Escritura.getEscritura();
    }
    public void setEscritura(String text){
        panel1Escritura.setText(text);
    }
*/
}
