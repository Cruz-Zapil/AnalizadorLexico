package com.leng.analizador.backEnd.enums;

public class CambiosEstado {

    public boolean cambiosKW(char envio) {

        if (envio == ' ') {
            return true;
        } else if (envio == ':') {
            return true;
        } else if (envio == '(') {
            return true;
        }
        return false;
    }

    public boolean cambiosIde(String cadena, char envio) {
        boolean estado = false;
        if (cadena.equals("")) {
            if (envio == '_') {
                estado = true;
            }else if (Character.isDigit(envio)) {
                System.out.println(" error de lexema ");      
            }

        } else {
            if (Character.isDigit(envio) || envio == '_') {
                estado = true;
            }
        }
        return estado;

    }

}
