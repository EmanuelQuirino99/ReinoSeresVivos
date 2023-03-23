package com.herencia.reinos;

public class protoctistas extends SeresVivos {
    String clasificacion;

    String tamaño;

    String habitat;


    public protoctistas() {

    }

    public void protoctistas(String clasificacion, String tamaño, String habitat) {
        this.clasificacion = clasificacion;
        this.tamaño = tamaño;
        this.habitat = habitat;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}




