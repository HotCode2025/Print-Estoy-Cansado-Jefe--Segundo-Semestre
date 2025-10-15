// Creamos la clase 'Producto'
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

// Creamos la clase 'Orden'
class Orden {
  static contadorOrdenes = 0;
  static MAX_PRODUCTOS = 5;

  constructor() {
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
  }

  agregarProducto(producto) {
    // Validar el limite de productos
    if (this._productos.length < Orden.MAX_PRODUCTOS) {
      this._productos.push(producto);
    } else {
      console.log(`No se pueden agregar más de ${Orden.MAX_PRODUCTOS} productos. Tendra que crear otra orden.`);
    }
  }

  // Sumar el precio de todos los productos
  calcularTotal() {
    let total = 0;
    for (let producto of this._productos) {
      total += producto.precio;
    }
    return total;
  }

  // Mostrar la orden completa
  mostrarOrden() {
    let listadoProductos = '';
    for (let producto of this._productos) {
      listadoProductos += '\n  ' + producto.toString();
    }
    return `Orden [ID: ${this._idOrden},\nProductos: ${listadoProductos},\nTotal: $${this.calcularTotal()}]`;
  }
}

// Pruebas
// Creacion de los productos
const producto1 = new Producto('Camisa', 500);
const producto2 = new Producto('Pantalón', 800);
const producto3 = new Producto('Cinturón', 300);

// Mostrar los productos
console.log('Productos creados:');
console.log(producto1.toString());
console.log(producto2.toString());
console.log(producto3.toString());

// Crear una orden y agregar los productos
const orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

// Mostrar la orden completa
console.log('Orden creada:');
console.log(orden1.mostrarOrden());
