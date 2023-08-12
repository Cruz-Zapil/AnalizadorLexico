package com.leng.analizador.frontEnd;

import java.awt.Color;

import javax.swing.JPanel;

public class VentanPrincipal extends javax.swing.JFrame {

    private static JPanel panelCentral;

    static Panel3 panel3;

    public VentanPrincipal() {

        panelCentral = new JPanel();
        panel3 = new Panel3(Color.white, Color.white);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Analizador Léxico");
        this.setSize(600, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        panelCentral.setBounds(0, 0, 600, 660);
        this.add(panelCentral);
        this.add(panel3);

    }

    public static void addPanel(JPanel panel1) {

        panelCentral.removeAll();
        panelCentral.add(panel1);
        panelCentral.repaint();
        panelCentral.revalidate();
    }
}
