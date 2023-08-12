package com.leng.analizador.backEnd.enums;

public enum Comparacion {
    
    IGUAL("=="),
    DIFERENTE("!="),
    MAYOR(">"),
    MENOR("<"),
    MAYOR_IGUAL(">="),
    MENOR_IGUAL("<=");

    private String simbolo;

    private Comparacion(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return this.simbolo;
    }
    
    public static Aritmeticos getAritmetico(String simbolo){
        for(Aritmeticos a : Aritmeticos.values()){
            if(a.getSimbolo().equals(simbolo)){
                return a;
            }
        }
        return null;
    }

    
}
