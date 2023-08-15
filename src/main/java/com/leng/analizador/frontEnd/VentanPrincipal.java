package com.leng.analizador.frontEnd;

import java.awt.Color;

import javax.swing.JPanel;

import com.leng.analizador.frontEnd.compnents.ConstructorPanel;

public class VentanPrincipal extends javax.swing.JFrame {

    private static JPanel panelCentral;

     Panel3 panel3;

    public VentanPrincipal() {

        panelCentral = new JPanel();
        panel3 = new Panel3(Color.white, Color.white);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Analizador Léxico");
        this.setSize(600, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        panelCentral.setBounds(0, 40, 600, 660);
         panelCentral.setLayout(null);
        this.add(panelCentral);
        this.add(panel3);

    }

    public static void addPanel(ConstructorPanel panel1) {

        panelCentral.removeAll();
        panelCentral.add(panel1);
        panelCentral.repaint();
        panelCentral.revalidate();
    }
}
