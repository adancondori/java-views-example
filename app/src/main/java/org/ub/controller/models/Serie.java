package org.ub.controller.models;

public class Serie {
    public String generarPares(int cantidad) {
        int par = 2;
        String cadena= "";
        for (int i = 0; i < cantidad; i++) {
            cadena = cadena + par + ", ";
            par = par + 2;
        }
        return cadena;
    }
    public String generarImPares(int cantidad) {
        int par = 1;
        String cadena= "";
        for (int i = 0; i < cantidad; i++) {
            cadena = cadena + par + ", ";
            par = par + 2;
        }
        return cadena;
    }
}
