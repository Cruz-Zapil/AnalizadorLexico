package com.leng.analizador.backEnd.enums;

public enum Logicos {

    AND("&&"),
    OR("||");

    private String simbolo;

    private Logicos(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

    public static Logicos getLogico(String simbolo) {
        for (Logicos a : Logicos.values()) {
            if (a.getSimbolo().equals(simbolo)) {
                return a;
            }
        }
        return null;
    }
    



}
