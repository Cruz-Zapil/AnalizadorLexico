package com.leng.analizador.backEnd.enums;

public enum Aritmeticos {

    SUMA("+"),
    RESTA("-"),
    EXPONENTE("**"),
    MODULO("%"),
    MULTIPLICACION("*"),
    DIVISION("/");

    

    private String simbolo;

    private Aritmeticos(String simbolo) {
        this.simbolo = simbolo;
    }




    public String getSimbolo() {
        return this.simbolo;
    }

    public static boolean probandoAritme(String simboloEnvio) {

        for (Aritmeticos a : Aritmeticos.values()) {

            if (a.getSimbolo().equals(simboloEnvio)) {
                return true;
            }        
        }
        return false;
    }

}
