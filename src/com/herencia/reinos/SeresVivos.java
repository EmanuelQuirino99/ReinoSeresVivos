package com.herencia.reinos;

public class SeresVivos {
    String nombre;
    String tipo;
    String clase;
    String ecosistema;
    String alimentacion;
    String reproduccion;
    public SeresVivos() {
    }

    public SeresVivos(String nombre, String tipo, String clase,String ecosistema,String alimentacion,String reproduccion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.clase = clase;
        this.ecosistema= ecosistema;
        this.alimentacion=alimentacion;
        this.reproduccion=reproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEcosistema() {
        return ecosistema;
    }

    public void setEcosistema(String ecosistema) {
        this.ecosistema = ecosistema;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }
}
