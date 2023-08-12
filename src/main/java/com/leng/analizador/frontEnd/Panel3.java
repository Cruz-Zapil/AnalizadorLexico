package com.leng.analizador.frontEnd;


import javax.swing.JPanel;

import com.leng.analizador.backEnd.frontEnd2.AccionBoton;
import com.leng.analizador.frontEnd.compnents.ConstructorBotton;

import java.awt.Color;

public class Panel3 extends JPanel {

    //*// panel del los botones  */
    private ConstructorBotton[] botones = new ConstructorBotton[6];
    private String[] etiquetas = {"Archivo", "Grafico", "Ayuda", "Acerca", "Play", " Limpiar"};

    private AccionBoton accionBoton = new AccionBoton();


    public Panel3(Color color/* , String etiqueta */, Color color2) {

        
        this.setLayout(null);
        this.setBounds(0, 0, 600, 40);
        this.setBackground(color);

        setcomponentes();
        this.setVisible(true);

    }


    public void setcomponentes() {
        
        for (int i = 0; i < botones.length; i++) {
            
            botones[i] = new ConstructorBotton(etiquetas[i], Color.BLACK, Color.WHITE, Color.BLACK, 0 + (i * 100), 0, accionBoton);

            this.add(botones[i]);
        }




    }

}
