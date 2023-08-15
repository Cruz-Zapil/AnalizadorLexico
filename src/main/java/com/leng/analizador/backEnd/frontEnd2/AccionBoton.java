package com.leng.analizador.backEnd.frontEnd2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import com.leng.analizador.frontEnd.Panel1;
import com.leng.analizador.frontEnd.Panel1Escritura;
import com.leng.analizador.frontEnd.VentanPrincipal;
import com.leng.analizador.frontEnd.compnents.ConstructorBotton;

public class AccionBoton implements java.awt.event.ActionListener {

    private Panel1 panel1= new Panel1(Color.DARK_GRAY, null);

    @Override
    public void actionPerformed(ActionEvent event) {

        Object fuente = event.getSource();

        if (fuente instanceof ConstructorBotton) {

            ConstructorBotton botones = (ConstructorBotton) event.getSource();

            if (botones.getText().equals("Archivo")) {
                System.out.println(" Cargando ");

                message();
                VentanPrincipal.addPanel(panel1);

            } else if (botones.getText().equals("Grafico")) {
                System.out.println("Grafico ");

                VentanPrincipal.addPanel(panel1);

            } else if (botones.getText().equals("Ayuda")) {

                System.out.println(" help");
            } else if (botones.getText().equals("Acerca")) {
                System.out.println(" acerda de");

            } else if (botones.getText().equals("Play")) {

                /// aqui deberia de leer todo el archivo del area text
               // System.out.println(" play: "+  panel1.getEscritura());
         
                System.out.println(" el texto obtenido es: "+ Panel1Escritura.getText());
                Panel1Escritura.setTextColor("hola", Color.red);

               

            } else if (botones.getText().equals("Limpiar")) {
                System.out.println("Limpiar");
                Panel1Escritura.setTextColor(" que tal", Color.GREEN);

            }

        }

    }

    public void message() {
        String[] options = { "Abrir Archivo","Nuevo", "Cancelar" };
        int choice = JOptionPane.showOptionDialog(
                null,
                "Attencion: ",
                "Seleccione una opci\u00F3n:",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == 0) {
            // Acción para "Abrir Archivo"
            System.out.println("Abrir Archivo seleccionado.");
          //  fileChoser();
        } else if (choice == 1) {
            // Acción para "Nuevo"
            System.out.println("Nuevo seleccionado.");
        } else if (choice == 2) {
            // Acción para "Cancelar"
            System.out.println("Cancelar seleccionado.");
        }
    }

 
}
