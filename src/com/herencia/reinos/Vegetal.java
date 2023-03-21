package com.herencia.reinos;

public class Vegetal  extends SeresVivos{

String reino;

    public Vegetal() {
    }

    public Vegetal(String reino) {
        this.reino = reino;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
