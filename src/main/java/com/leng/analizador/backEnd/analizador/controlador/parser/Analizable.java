package com.leng.analizador.backEnd.analizador.controlador.parser;



import com.leng.analizador.backEnd.analizador.controlador.parser.PYControlador.PyAnalizable;

public class Analizable {

    /*** leer archivos y enviar */

    private String prueba = "def if \"cadena \" : ( 4 + 5 )\n mi_id_\n while\n for\n >=\n <\n 'cadena en comillas simples'\n\n #un error se puede presentar como la siguiente linea\n \n";

    private String hola = "hola_mundoc==1  . que.mas";

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
