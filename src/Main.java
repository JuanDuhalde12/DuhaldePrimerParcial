import models.*;


public class Main {
    public static void main(String[] args) {
            Comercio delta = new Comercio("Delta Computacion");
            Informaticos impresora = new Impresora("hp2540",3500,20,15,"DELL");
            Informaticos impresora2 = new Impresora("frq5500",8000,5,35,"DELL");
            Informaticos notebook = new Notebook("latitude 5400",50000,10,500,"DELL");
            Muebles escritorio = new Escritorio("gamer",15000,5,350,400);
            Muebles silla = new Silla("cobra",45000,4,true);

            delta.agregarProducto(impresora);
            delta.agregarProducto(impresora2);
            delta.agregarProducto(notebook);
            delta.agregarProducto(escritorio);
            delta.agregarProducto(silla);
            System.out.println("#################################");
            System.out.println("Lista sin eliminar producto: ");
            delta.imprimirLista();
            System.out.println("#################################");
            delta.eliminarProducto("hp2540");
            System.out.println("Lista con producto eliminado: ");
            delta.imprimirLista();
            System.out.println("#################################");
            delta.aplicarDescuentoProducto(15,notebook);
            delta.aplicarDescuentoProducto(20,silla);
            System.out.println("#################################");
            System.out.println("Aplicando aumentos");
            delta.actualizarValores();



        }
    }