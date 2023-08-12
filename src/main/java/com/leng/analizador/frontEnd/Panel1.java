package com.leng.analizador.frontEnd;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;

public class Panel1 extends JPanel {

    //// panel de lot text area 


    private JTextArea areaText, areaTextError;
    private JLabel titulo;

    public Panel1(Color color/* , String etiqueta */, Color color2) {
        this.setLayout(null);
        this.setBounds(0, 40, 600, 660);
        this.setBackground(color);
        
        titulo = new JLabel();
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(color);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBounds(50, 20, 500, 30);
        this.add(titulo);
        
        setcomponentes1();
        this.setVisible(true);

    }

    public void setcomponentes1() {
        areaText = new JTextArea();
        areaText.setBounds(50, 30, 500, 370);
        areaText.setBackground(Color.black);
        areaText.setFont(new Font("Arial", Font.CENTER_BASELINE , 15));
        areaText.setForeground(Color.white);
        areaText.setEditable(true);
        //areaText.getDocument().addDocumentListener( new AccionesKey());

        // Configurar el panel de desplazamiento para el área de texto principal
        JScrollPane scrollBar = new JScrollPane(areaText);
        scrollBar.setBounds(50, 30, 500, 370);

        areaTextError = new JTextArea();
        areaTextError.setBounds(50, 430, 500, 150);
        areaTextError.setBackground(Color.black);
        areaTextError.setFont(new Font("Arial", Font.BOLD, 20));
        areaTextError.setForeground(Color.red);
        areaTextError.setEditable(false);

        // Configurar el panel de desplazamiento para el área de texto de errores
        JScrollPane scrollBarError = new JScrollPane(areaTextError);
        scrollBarError.setBounds(50, 430, 500, 150);

        this.add(areaText);
        this.add(scrollBar);
        this.add(areaTextError);
        this.add(scrollBarError);
    }






}
