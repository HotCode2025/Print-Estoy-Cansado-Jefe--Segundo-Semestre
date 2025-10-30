package ar.com.codesystem.ventas;

public class Orden {
    public static void main(String[] args) {
        private int idOrden;
        private Producto productos[]; //Declaramos el arreglo
        private static int contadorOrdenes;
        private int contadorProductos;
        private static final int MAX_PRODUCTOS = 10;
    }
    //Constructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    public void agregaProducto(Producto producto) {
        if (this.contadorProductos < orden.MAX_PRODUCTOS) {
            this.productos[this.contadoProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }    
}
