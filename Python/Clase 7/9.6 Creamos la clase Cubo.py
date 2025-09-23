class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

# Ejemplo de uso:
# Crea un objeto de la clase Cubo con las dimensiones 2, 3 y 4.
cubo1 = Cubo(2, 3, 4)

# Llama al método calcular_volumen para obtener el volumen.
volumen = cubo1.calcular_volumen()

# Imprime el resultado.
print(f"El volumen del cubo es: {volumen}")