package models;

public class Notebook extends Informaticos {
    private int memoria;

    public Notebook(String nombre, double precio, int stock, int memoria, String nombreFabricante) {
        super(nombre,nombreFabricante, precio, stock);
        this.memoria = memoria;
    }

    public Notebook() {
        super();
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
}
