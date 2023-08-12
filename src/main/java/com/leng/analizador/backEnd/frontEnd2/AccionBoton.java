package com.leng.analizador.backEnd.frontEnd2;

import java.awt.event.ActionEvent;
import com.leng.analizador.frontEnd.compnents.ConstructorBotton;

public class AccionBoton implements java.awt.event.ActionListener {


    public AccionBoton(){
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        Object fuente = event.getSource();

        if (fuente instanceof ConstructorBotton) {

            ConstructorBotton botones = (ConstructorBotton) event.getSource();

            if (botones.getText().equals("Cargar")) {
                System.out.println(" Cargando ");

            } else if (botones.getText().equals("Grafico")) {
                System.out.println("Grafico ");


            } else if (botones.getText().equals("Ayuda")) {

                System.out.println(" help");
            } else if (botones.getText().equals("Acerca")) {
                System.out.println(" acerda de");

            } else if (botones.getText().equals("Play")) {

                System.out.println(" play");
            } else if (botones.getText().equals("Limpiar")) {
                System.out.println("Limpiar");

            }

        }

    }

}
