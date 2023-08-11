package com.leng.analizador.backEnd.analizador.controlador.parser.PYControlador;

public class PyAnalizable {


    public ControlFuncionTransicion controlFuncionTransicion = new ControlFuncionTransicion();


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
                columna++;
            }else {
                linea++;
            }
            //// se envia a Controlador de función de transición
            controlFuncionTransicion.analizar(caracterActual); 
          //  System.out.println("el envio: "+ caracterActual);               
                        
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
