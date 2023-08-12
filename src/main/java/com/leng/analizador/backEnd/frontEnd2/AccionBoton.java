package com.leng.analizador.backEnd.frontEnd2;

import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.leng.analizador.backEnd.analizador.controlador.analizador.Analizable;
import com.leng.analizador.frontEnd.compnents.ConstructorBotton;

public class AccionBoton implements java.awt.event.ActionListener {


    private Analizable miArchivo = new Analizable();
    private JFileChooser miBuscador;

    public AccionBoton() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        Object fuente = event.getSource();

        if (fuente instanceof ConstructorBotton) {

            ConstructorBotton botones = (ConstructorBotton) event.getSource();

            if (botones.getText().equals("Archivo")) {
                System.out.println(" Cargando ");

                message();

            } else if (botones.getText().equals("Grafico")) {
                System.out.println("Grafico ");

            } else if (botones.getText().equals("Ayuda")) {

                System.out.println(" help");
            } else if (botones.getText().equals("Acerca")) {
                System.out.println(" acerda de");

            } else if (botones.getText().equals("Play")) {

                /// aqui deberia de leer todo el archivo del area text
                System.out.println(" play");

            } else if (botones.getText().equals("Limpiar")) {
                System.out.println("Limpiar");

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
            fileChoser();
        } else if (choice == 1) {
            // Acción para "Nuevo"
            System.out.println("Nuevo seleccionado.");
        } else if (choice == 2) {
            // Acción para "Cancelar"
            System.out.println("Cancelar seleccionado.");
        }
    }

    public void fileChoser() {

        String textoLeido;
        miBuscador = new JFileChooser(".");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Python (.py)", "py");

        miBuscador.setFileFilter(filtro);

        int valor = miBuscador.showOpenDialog(miBuscador);
        if (valor == JFileChooser.APPROVE_OPTION) {

            textoLeido = miArchivo.leerArchivoExterior(miBuscador.getSelectedFile().getAbsolutePath());
            System.out.println(miBuscador.getSelectedFile().getAbsolutePath());
          // areaText.setText(textoLeido);
        }

    }
}
