package models;

import interfaces.IDescuento;

import javax.sound.sampled.Line;

public class Impresora extends Informaticos implements IDescuento {
    private int impresionesXMinuto;

    public Impresora(String nombre, double precio, int stock, int impresionesXMinuto, String nombreFabricante) {
        super(nombre,nombreFabricante, precio, stock);
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public Impresora() {
        super();
    }

    public int getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(int impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public void aplicarDescuento(double descuento) {
        double cantDescuento = this.getPrecio()*(descuento/100);
        double precioConDescuento = this.getPrecio()-cantDescuento;
        System.out.println("El producto con descuento del "+descuento+"% queda en: "+ precioConDescuento);
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesXMinuto=" + impresionesXMinuto +
                "} " + super.toString();
    }
}
