package com.herencia.reinos;

public class Fungi extends SeresVivos{

boolean venenoso,comestible,medicinal;

    public Fungi() {
    }

    public Fungi(String nombre, String tipo, String clase, String ecosistema, String alimentacion, String reproduccion) {
        super(nombre, tipo, clase, ecosistema, alimentacion, reproduccion);
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    public boolean isMedicinal() {
        return medicinal;
    }

    public void setMedicinal(boolean medicinal) {
        this.medicinal = medicinal;
    }
}
