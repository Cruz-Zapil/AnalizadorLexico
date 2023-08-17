package com.leng.analizador.backEnd.analizador.controlador.analizador;


import com.leng.analizador.backEnd.analizador.controlador.analizador.PYControlador.PyAnalizable;

public class Analizable {

    /*** leer archivos y enviar */

    private String prueba = "def if \"cadena \" : ( 4 + 5 )\n mi_id_\n while\n for\n >=\n <\n 'cadena en comillas simples'\n\n #un error se puede presentar como la siguiente linea\n \n";

    private String hola = "hola_mundoc==1  . que.mas";

    public void analizar(String envio) {  
        System.out.println("envio: " + envio);  

        if(!envio.isBlank()){
            new PyAnalizable(envio).avanzar();
        }
        
    }

}
