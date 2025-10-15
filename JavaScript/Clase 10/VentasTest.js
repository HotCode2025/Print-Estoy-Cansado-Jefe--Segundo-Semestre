class Producto {
  static contadorProductos = 0;

  constructor(nombre, precio) {
    this._idProducto = ++Producto.contadorProductos;
    this._nombre = nombre;
    this._precio = precio;
  }

  get idProducto() {
    return this._idProducto;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get precio() {
    return this._precio;
  }

  set precio(precio) {
    this._precio = precio;
  }

  toString() {
    return `Producto [ID: ${this._idProducto}, Nombre: ${this._nombre}, Precio: $${this._precio}]`;
  }
}

class Orden {
  static contadorOrdenes = 0;
  static MAX_PRODUCTOS = 5;

  constructor() {
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
  }

  agregarProducto(producto) {
    if (this._productos.length < Orden.MAX_PRODUCTOS) {
      this._productos.push(producto);
    } else {
      console.log('No se pueden agregar más productos a esta orden.');
    }
  }

  calcularTotal() {
    let total = 0;
    for (let producto of this._productos) {
      total += producto.precio;
    }
    return total;
  }

  mostrarOrden() {
    let productosStr = '';
    for (let producto of this._productos) {
      productosStr += '\n  ' + producto.toString();
    }
    console.log(`Orden [ID: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosStr}]`);
  }
}

// ---- VentasTest ----
const producto1 = new Producto('Camisa', 500);
const producto2 = new Producto('Pantalón', 800);
const producto3 = new Producto('Cinturón', 300);

const orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

orden1.mostrarOrden();
