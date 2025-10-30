public class Orden {
    private int inOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor vacio

    public Orden() {
        this.inOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]
    }
 public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos: "+Orden.MAX_PRODUCTOS);
        }
 }

 public double calcularTotal(){
     double total = 0; //variable temporal
     for (int i = 0; i < this.contadorProductos; i++) {
       //  Productos producto = this.productos[i];
       //  total += producto.getPrecio();
         total += this.productos[i].getPrecio();
     }
     return total;
 }
}