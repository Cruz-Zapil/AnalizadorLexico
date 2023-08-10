package com.leng.analizador.backEnd.analizador.controlador.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Analizable {

    /*** leer archivos y enviar */

    private String prueba = "def if \"cadena \" : ( 4 + 5 )\n mi_id_\n while\n for\n >=\n <\n 'cadena en comillas simples'\n\n #un error se puede presentar como la siguiente linea\n \n";

    public void almacenamiento() {
        
        // Dividir la cadena en líneas utilizando el carácter de salto de línea
        String[] lineas = prueba.split("\n");

        // Almacenar cada línea en un ArrayList
        List<String> lineasList = new ArrayList<>(Arrays.asList(lineas));
        int a=0;
        a = 1+1;
    }

}
