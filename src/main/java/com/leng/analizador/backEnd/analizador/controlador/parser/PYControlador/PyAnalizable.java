package com.leng.analizador.backEnd.analizador.controlador.parser.PYControlador;

public class PyAnalizable {
    // desminuzar cada cadena, saber la linea y la comuna de cada caracter
    private int linea;
    private int columna;
    private String contenido;
    private int indice; // Índice del caracter actual

    public PyAnalizable(String envio) {
        contenido = envio;
        linea = 1;
        columna = 1;
        indice = 0;
    }

    public void avanzar() {

        for ( indice = 0; indice < contenido.length(); indice++) {
            
            char caracterActual = contenido.charAt(indice);
            if (caracterActual != '\n') {
                //// se envia a Controlador de función de transición

                columna++;
            }else {
                linea++;
            }
                
                        
        }
    }
    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
    public String getContenido() {
        return contenido;
    }
}
