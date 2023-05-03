package models;

public class Muebles extends Producto{

    public Muebles(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public Muebles() {
        super();
    }

    @Override
    public String toString() {
        return "Muebles{} " + super.toString();
    }
}
