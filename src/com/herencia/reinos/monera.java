package com.herencia.reinos;

public class monera {
    String tamaño;
    String clasificacion;

    public monera() {
    }

    public monera(String tamaño, String clasificacion) {
        this.tamaño = tamaño;
        this.clasificacion = clasificacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
