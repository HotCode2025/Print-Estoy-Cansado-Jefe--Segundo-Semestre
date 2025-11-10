package ar.com.codesystem.ventas.test;
import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(Stringp[] args){
        Producto producto1 = new Producto('Pantalon', 9500.00);
        Producto producto2 = new Producto('Campera', 29900.00);
        Producto producto3 = new Producto('Cerveza', 10.00);
        Producto producto4 = new Producto('Patineta', 300.00);
        Producto producto5 = new Producto('Inerte barra de carbono', 30000.00);
        Producto producto6 = new Producto('Pikmin', 200.00);
        Producto producto7 = new Producto('Barra de tungsteno', 5000.00);
        Producto producto8 = new Producto('Catalizador', 100.00);
        Producto producto9 = new Producto('Banana cavendish', 500.00);
        Producto producto10 = new Producto('Zanahoria', 1500.00);
        

        Orden orden1 = new Orden();
        //agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.mostrarOrden();

    }
}