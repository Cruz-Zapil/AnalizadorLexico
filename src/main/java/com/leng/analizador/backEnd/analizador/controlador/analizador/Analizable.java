package com.leng.analizador.backEnd.analizador.controlador.analizador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.leng.analizador.backEnd.analizador.controlador.analizador.PYControlador.PyAnalizable;

public class Analizable {

    /*** leer archivos y enviar */

    private String prueba = "def if \"cadena \" : ( 4 + 5 )\n mi_id_\n while\n for\n >=\n <\n 'cadena en comillas simples'\n\n #un error se puede presentar como la siguiente linea\n \n";

    private String hola = "hola_mundoc==1  . que.mas";






    String RUTA;
    String rutaB = "";
    private String rutaFichero = "src/main/java/com/practica2/ficheros/";


    public String leerArchivoExterior(String ruta) {
        System.out.println("ruta Exterior: "+ ruta);
        FileReader lector = null;
        BufferedReader br = null;
        this.RUTA = ruta;

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

    public String leerArchivosIterior(String ruta){
        System.out.println(rutaFichero+ruta);
        FileReader lector = null;
        BufferedReader br = null;
      

        String lectura = " ";
        String contenido = " ";

        try {
            lector = new FileReader(rutaFichero+ruta);
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


    public void escribirArchivo(String texto, String ruta, boolean reescribir) {
        System.out.println(" rutas firchero "+rutaFichero+ruta);
        try {
            File archivo = new File(rutaFichero + ruta);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter escritor = new FileWriter(archivo, reescribir);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write(texto);
            buffer.close();
            escritor.close();
        } catch (IOException error) {
            System.out.println(error);
        }
    }








    public void almacenamiento() {
        
        // Dividir la cadena en líneas utilizando el carácter de salto de línea
     //   String[] lineas = prueba.split("\n");

        // Almacenar cada línea en un ArrayList
       // List<String> lineasList = new ArrayList<>(Arrays.asList(lineas));
       // int a=0;
       // a = 1+1;

       

        new PyAnalizable(hola).avanzar();
    }

}
