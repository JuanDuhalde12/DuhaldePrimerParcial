package models;

import java.util.ArrayList;

public class Comercio {
    private ArrayList <Producto> listaProductos;
    private String nombreComercio;

    public Comercio(String nombreComercio) {
        this.listaProductos = new ArrayList<>();
        this.nombreComercio = nombreComercio;
    }

    public Comercio() {
        this.listaProductos = new ArrayList<>();
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public void imprimirLista(){
        if(!listaProductos.isEmpty()){
            for (int i = 0; i < listaProductos.size(); i++) {
                System.out.println(i+ " - "+listaProductos.get(i).toString());
            }
        }else{
            System.out.println("No hay productos creados");
        }
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    public void eliminarProducto(String nombre){
        for (int i = 0; i < listaProductos.size(); i++) {
            if(listaProductos.get(i).getNombre().equals(nombre)){
                System.out.println("Producto "+ listaProductos.get(i).getNombre() + " eliminado");
                listaProductos.remove(i);
            }
        }
    }

    public void actualizarValores(){
        for (Producto producto:listaProductos) {
            if(producto instanceof Silla){
                double productoConAumento = producto.getPrecio()+(producto.getPrecio()*0.05);
                System.out.println("El precio del "+producto.getNombre()+" aumento de "+ producto.getPrecio()+" a "+productoConAumento);
            }else if(producto instanceof Escritorio){
                double productoConAumento = producto.getPrecio()+(producto.getPrecio()*0.10);
                System.out.println("El precio del "+producto.getNombre()+" aumento de "+ producto.getPrecio()+" a "+productoConAumento);
            }else if(producto instanceof Notebook){
                double productoConAumento = producto.getPrecio()+(producto.getPrecio()*0.20);
                System.out.println("El precio del "+producto.getNombre()+" aumento de "+ producto.getPrecio()+" a "+productoConAumento);
            }else if(producto instanceof Impresora){
                double productoConAumento = producto.getPrecio()+(producto.getPrecio()*0.15);
                System.out.println("El precio del "+producto.getNombre()+" aumento de "+ producto.getPrecio()+" a "+productoConAumento);
            }
        }
    }

    public void aplicarDescuentoProducto(double descuento, Producto producto){
        if(producto instanceof Silla){
            ((Silla) producto).aplicarDescuento(descuento);
        }else if(producto instanceof Impresora){
            ((Impresora) producto).aplicarDescuento(descuento);
        }else{
            System.out.println("El producto seleccionado no posee descuento aplicable");
        }

    }

}
