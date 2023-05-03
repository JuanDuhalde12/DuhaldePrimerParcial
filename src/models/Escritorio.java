package models;

public class Escritorio extends Muebles{
    private double ancho, alto;

    public Escritorio(String nombre, double precio, int stock, double ancho, double alto) {
        super(nombre, precio, stock);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Escritorio() {
        super();
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }
}
