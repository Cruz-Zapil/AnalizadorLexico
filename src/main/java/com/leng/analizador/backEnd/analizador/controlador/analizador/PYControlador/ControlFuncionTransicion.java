package com.leng.analizador.backEnd.analizador.controlador.analizador.PYControlador;

import java.util.HashMap;
import java.util.Map;

public class ControlFuncionTransicion {

    private int estadoPrincipal = 0, estado2 = 0, estado3 = 0;
    private String cadena = "";
    private Map<Character, Integer> estadosPorCaracter = new HashMap<>();

    private boolean cambioEstado;
    private boolean estadoInicial = true;


    public ControlFuncionTransicion() {
        asignacionsEstados();
    }

    private void asignacionsEstados() {
        estadosPorCaracter.put('\n', 0);
        estadosPorCaracter.put('_', 3);
        estadosPorCaracter.put('.', 4);
        estadosPorCaracter.put('(', 5);
        estadosPorCaracter.put(')', 6);
        estadosPorCaracter.put('\"', 7);
        estadosPorCaracter.put('\'', 8);
        estadosPorCaracter.put('=', 9);
        estadosPorCaracter.put('[', 10);
        estadosPorCaracter.put(']', 11);
        estadosPorCaracter.put(':', 13);
        estadosPorCaracter.put(' ', 14);

        for (char c : "+-*/%^".toCharArray()) {
            estadosPorCaracter.put(c, 12);
        }
    }

    private void asignacionesEstados(char caracter) {
        estado2 = Character.isLetter(caracter) ? 1
                : Character.isDigit(caracter) ? 2 : estadosPorCaracter.getOrDefault(caracter, -1);
    }

    private boolean validarEstadoPrincipal(int... estadosPermitidos) {
        for (int estado : estadosPermitidos) {
            if (estadoPrincipal == estado) {
                return true;
            }
        }
        return false;
    }

    public boolean analizar(char caracter) {
        asignacionesEstados(caracter);

        if (Character.isWhitespace(caracter)) {
            if (estadoPrincipal >= 0 && estadoPrincipal <= 3 || estadoPrincipal >= 5) {
                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena += caracter;
                System.out.println(" cadena: " + cadena + " estado: " + estadoPrincipal);
                return true;
            }
        } else if (Character.isLetter(caracter)) {
            if (validarEstadoPrincipal(0, 1, 3, 5, 6, 7, 8, 9, 11, 12, 13, 14)) {
                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena += caracter;
                return true;
            }
        } else if (Character.isDigit(caracter)) {
            if (validarEstadoPrincipal(2, 4, 6, 7, 8, 11, 12, 14)) {

                if (estado2 != 4) {
                    if (!(estado2 == estadoPrincipal)) {
                        cambioEstado();
                    }
                }
                cadena += caracter;
                System.out.println(" cadena: " + cadena + " estado: " + estadoPrincipal);
                return true;
            }
        } else if (caracter == '_' || caracter == '.' || caracter == '(' || caracter == ')' ||
                caracter == '\"' || caracter == '\'' || caracter == '=' || caracter == '[' ||
                caracter == ']' || caracter == ':') {
            int[] estadosPermitidos = {};
            if (caracter == '_') {
                estadosPermitidos = new int[] { 0, 1, 3, 7, 8, 13 };
            } else if (caracter == '.') {
                estadosPermitidos = new int[] { 2, 7, 8 };
            } else if (caracter == '(') {
                estadosPermitidos = new int[] { 1, 2, 5, 6, 7, 8 };
            } else if (caracter == ')') {
                estadosPermitidos = new int[] { 1, 2, 3, 5, 6, 7, 8, 12, 13 };
            } else if (caracter == '\"' || caracter == '\'') {
                estadosPermitidos = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
            } else if (caracter == '=') {
                estadosPermitidos = new int[] { 1, 2, 5, 6, 7, 8, 9 };
            } else if (caracter == '[') {
                estadosPermitidos = new int[] { 1, 2, 5, 6, 7, 8, 9 };
            } else if (caracter == ']') {
                estadosPermitidos = new int[] { 6, 7, 8, 10, 11, 14 };
            } else if (caracter == ':') {
                estadosPermitidos = new int[] { 1, 2, 5, 7, 8, 9, 10, 11, 12, 14 };
            }else if (caracter == ' ') {
                estadosPermitidos = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11 };
            }



            if (validarEstadoPrincipal(estadosPermitidos)) {
                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena += caracter;
                System.out.println(" cadena: " + cadena + " estado: " + estadoPrincipal);
                return true;
            }
        }
        System.out.println(" error lexico");
        return false;
    }
    public void cambioEstado() {
        System.out.println(" cambio de estado, cadena acumulada: " + cadena);
        estadoPrincipal = estado2;
        cadena = "";
        cambioEstado = true;
    }
    public boolean getCambioEstado() {
        return cambioEstado;
    }
    public void setCambioEstado(boolean cambioEstado) {
        this.cambioEstado = cambioEstado;
    }

    public void setEstadoInicial(){
        estadoInicial = true;        
    }
}
