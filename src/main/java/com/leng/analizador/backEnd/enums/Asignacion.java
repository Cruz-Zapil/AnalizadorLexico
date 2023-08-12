package com.leng.analizador.backEnd.enums;

public enum Asignacion {
    
    IGUAL("="),
    SUMA("+="),
    RESTA("-="),
    MULTIPLICACION("*="),
    DIVISION("/="),
    MODULO("%="),
    POTENCIA("^="),
    INCREMENTO("++"),
    DECREMENTO("--");
    
    private String simbolo;
    
    private Asignacion(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return this.simbolo;
    }
    
    public static Asignacion getAsignacion(String simbolo){
        for(Asignacion a : Asignacion.values()){
            if(a.getSimbolo().equals(simbolo)){
                return a;
            }
        }
        return null;
    }


}
