package models;

import interfaces.IDescuento;

public class Silla extends Muebles implements IDescuento {
    private boolean tieneRuedas;

    public Silla(String nombre, int precio, int stock, boolean tieneRuedas) {
        super(nombre, precio, stock);
        this.tieneRuedas = tieneRuedas;
    }

    public Silla() {
        super();
    }

    public boolean isTieneRuedas() {
        return tieneRuedas;
    }

    public void setTieneRuedas(boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public void aplicarDescuento(double descuento) {
        double cantDescuento = this.getPrecio()*(descuento/100);
        double precioDescontado = this.getPrecio()-cantDescuento;
        System.out.println("El producto con descuento del "+descuento+"% queda en: "+ precioDescontado);
    }

    @Override
    public String toString() {
        return "Silla{" +
                "tieneRuedas=" + tieneRuedas +
                "} " + super.toString();
    }
}

