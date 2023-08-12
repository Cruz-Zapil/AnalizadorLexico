package com.leng.analizador.frontEnd;

import java.awt.Color;

public class VentanPrincipal extends javax.swing.JFrame{
    
    Panel1 panel;

    public VentanPrincipal(){
        initComponents();
    }

    private void initComponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.setVisible(true);

        setTitle("Analizador Léxico");
        setResizable(false);
        setSize(600 , 700);
        setLocationRelativeTo(null);
        this.setLayout(null);

        /// agregando panel
        panel = new Panel1( Color.ORANGE , Color.white);
        this.add(panel);
        
        Panel3 panel3 = new Panel3( Color.white , Color.white);
        this.add(panel3);

    }

    
}
