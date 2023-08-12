package com.leng.analizador.backEnd.frontEnd2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LogicaArchivo {


    String Ruta ;

       public String leerArchivoExterior(String ruta) {
        System.out.println("ruta Exterior: "+ ruta);
        FileReader lector = null;
        BufferedReader br = null;
        this.Ruta = ruta;

        String lectura = " ";
        String contenido = " ";

        try {
            lector = new FileReader(ruta);
            br = new BufferedReader(lector);
            while ((lectura = br.readLine()) != null) {
                contenido += lectura + "\n";

            }
            br.close();
            lector.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e, " Error", JOptionPane.WARNING_MESSAGE);
        }
        return contenido;
    }

    
}
