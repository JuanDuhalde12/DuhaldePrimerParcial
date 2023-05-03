package models;

public class Informaticos extends Producto{
    private String nombreFabricante;
    public Informaticos(String nombre, String nombreFabricante, double precio, int stock) {
        super(nombre, precio, stock);
        this.nombreFabricante = nombreFabricante;
    }

    public Informaticos() {
        super();
    }

    @Override
    public String toString() {
        return "Informaticos{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }
}
