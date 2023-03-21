package com.herencia.reinos;

public class animal extends SeresVivos{
    String clasificacion;

    public animal() {
    }

    public animal(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
