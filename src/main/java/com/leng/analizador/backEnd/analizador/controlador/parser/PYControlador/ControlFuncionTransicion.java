package com.leng.analizador.backEnd.analizador.controlador.parser.PYControlador;

import java.util.HashMap;
import java.util.Map;

public class ControlFuncionTransicion {

    /// analiza si es una trasicion

    private int estadoPrincipal = 0, estado2 = 0;
    private String cadena="";

    private Map<Character, Integer> estadosPorCaracter = new HashMap<>();

    private boolean cambioEstado;

    public ControlFuncionTransicion() {
        asignacionsEstados();
    }

    private void asignacionsEstados() {
        estadosPorCaracter.put('\n', 0);
        estadosPorCaracter.put('_', 1);
        estadosPorCaracter.put('.', 4);
        estadosPorCaracter.put('(', 5);
        estadosPorCaracter.put(')', 6);
        estadosPorCaracter.put('\"', 7);
        estadosPorCaracter.put('\'', 8);
        estadosPorCaracter.put('=', 9);
        estadosPorCaracter.put('[', 10);
        estadosPorCaracter.put(']', 11);

    }

    private void asignacionesEstados(char caracter) {
        if (Character.isLetter(caracter)) {
            estado2 = 1;
        } else if (Character.isDigit(caracter)) {
            estado2 = 2;
        } else if (estadosPorCaracter.containsKey(caracter)) {
            estado2 = estadosPorCaracter.get(caracter);
        } else {
            // Estado por defecto o manejo de casos no cubiertos
            estado2 = -1;
        }
    }

    public boolean analizar(char caracter) {
        /// dependidno del caracter que se envia se asigna un valor a estado2 para luego
        /// comparrlo
        asignacionesEstados(caracter);
        
        /// comienza comparacion de estado principal

        if (Character.isLetter(caracter)) {

            if ((estadoPrincipal >= 0 && estadoPrincipal <= 3) || estadoPrincipal == 5
                    || (estadoPrincipal >= 7 && estadoPrincipal <= 9)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (Character.isDigit(caracter)) {

            if (estadoPrincipal == 2 || estadoPrincipal == 4 || estadoPrincipal == 5
                    || (estadoPrincipal >= 7 && estadoPrincipal <= 9)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (caracter == '_') {

            if (estadoPrincipal == 0 || estadoPrincipal == 1 || estadoPrincipal == 3
                    || estadoPrincipal == 7 || estadoPrincipal == 8) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }
        } else if (caracter == '.') {

            if (estadoPrincipal == 2 || estadoPrincipal == 7 || estadoPrincipal == 8) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (caracter == '(') {

            if (estadoPrincipal == 1
                    || (estadoPrincipal >= 5 && estadoPrincipal <= 9)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);

                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (caracter == ')') {

            if (estadoPrincipal == 1 || estadoPrincipal == 2
                    || (estadoPrincipal >= 5 && estadoPrincipal <= 8)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (caracter == '\"') {

            if (estadoPrincipal == 5
                    || (estadoPrincipal >= 7 && estadoPrincipal <= 9)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        } else if (caracter == '=') {

            if (estadoPrincipal == 1 || estadoPrincipal == 2 || (estadoPrincipal >= 5 && estadoPrincipal <= 9)) {

                if (!(estado2 == estadoPrincipal)) {
                    cambioEstado();
                }
                cadena+=caracter;
                System.out.println(" cadena: "+cadena+ " estado: "+ estadoPrincipal);
                return true;
            } else {
                System.out.println(" error lexico");
                return false;
            }

        }
        return false;
    }

    public void cambioEstado() {
        System.out.println(" cambio de estado, cadena acumulada: "+cadena); 
        estadoPrincipal = estado2;
        cadena="";
        cambioEstado = true;
        
    }

    public boolean getCambioEstado() {
        return cambioEstado;
    }

    public void setCambioEstado(boolean cambioEstado) {
        this.cambioEstado = cambioEstado;
    }

}
