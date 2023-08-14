package com.leng.analizador.frontEnd;

import javax.swing.JLabel;
import javax.swing.JPanel;
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

    public Panel1(Color color, Color color2) {
        super(color, color2);
      
        panel1Escritura = new Panel1Escritura();
        setcomponentes1();
        System.out.println(" se esta creando un panel ");
    }

    public void setcomponentes1() {
        /*
        areaText = new JTextArea();
        areaText.setBounds(50, 30, 500, 370);
        areaText.setBackground(Color.black);
        areaText.setFont(new Font("Arial", Font.CENTER_BASELINE , 15));
        areaText.setForeground(Color.white);
        areaText.setEditable(true);
        
        // Configurar el panel de desplazamiento para el área de texto principal
        JScrollPane scrollBar = new JScrollPane(areaText);
        scrollBar.setBounds(50, 30, 500, 370);
        */

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
        panel1Escritura.setEscritura(text, Color.red);
    }

*/
}
