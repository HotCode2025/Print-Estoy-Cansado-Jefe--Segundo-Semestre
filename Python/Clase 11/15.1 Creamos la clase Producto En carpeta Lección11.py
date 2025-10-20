class Producto:
    contador_productos = 0_# Variable de Clase

    def __init__(self, precio):
    Producto.contador_productos += 1 # Aumento para la variable de clase
    self._id_producto = Producto.contador_productos # Asignacion desde la clase
    self._nombre = nombre
    self._precio = precio

    
# Metodos setters and gets
    @property
def nombre(self):
    return self._nombre

@nombre.setter
def nombre(self, nombre):
    self._nombre = nombre

@property
def precio(self):
    return self._precio

@precio.setter
def precio(self, precio):
    self._precio = precio
# Sobre escribimos el metodo srt
def __str__(self):
    return f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


if __name__ == '__main__':_# Solo sera visible si la prueba se ejecuta desde aqui
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalon', 150.00)
