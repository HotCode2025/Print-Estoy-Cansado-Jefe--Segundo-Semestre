class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_productos
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto) #Esto es para agregar un nuevo producto
    
    def calcular_total(self):
        total = 0 #Variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total
    
    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__()+'|'

    if __name__ == '__main__':
        producto1 = Producto('Camiseta', 100.00)
        producto2 = Producto('Pantalon', 150.00)
        producto3 = Producto('Notebook', 5200.00)
        producto4 = Producto('Botella', 20.00)
        productos1 = [producto1, producto2] # Lista de productos
        productos2 = [producto3, producto4]
        orden1 = Orden(productos1) # Primer objeto orden pasando la lista de productos
        print(orden1)
        orden2 = Orden(productos2)
        print(orden2)