"""
Ejercicio: Sistema de Vehículos

Consigna:
Definir una clase padre llamada Vehiculo y dos clases hijas llamadas Auto y Bicicleta,
las cuales heredan de la clase padre Vehiculo.

Necesario:
1. La clase padre Vehiculo debe tener:
   - Atributos: color, ruedas
   - Métodos: __init__(color, ruedas) y __str__()

2. La clase Auto (hija de Vehiculo) debe tener:
   - Atributos: velocidad (km/hr)
   - Métodos: __init__(color, ruedas, velocidad) y __str__()

3. La clase Bicicleta (hija de Vehiculo) debe tener:
   - Atributos: tipo (urbana/montaña/etc.)
   - Métodos: __init__(color, ruedas, tipo) y __str__()

4. Crear un objeto de cada clase y mostrar su información
"""

class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    
    def __str__(self):
        return f"Vehículo - Color: {self.color}, Ruedas: {self.ruedas}"


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    
    def __str__(self):
        return f"Auto - Color: {self.color}, Ruedas: {self.ruedas}, Velocidad: {self.velocidad} km/hr"


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    
    def __str__(self):
        return f"Bicicleta - Color: {self.color}, Ruedas: {self.ruedas}, Tipo: {self.tipo}"


# objetos de cada clase como indica el ejercicio
print("=== OBJETOS CREADOS ===")

# un vehículo genérico
vehiculo1 = Vehiculo("Rojo", 4)
print(vehiculo1)

# un auto
auto1 = Auto("Azul", 4, 180)
print(auto1)

# una bicicleta
bici1 = Bicicleta("Verde", 2, "Montaña")
print(bici1)

print("\n=== VERIFICACIÓN DE HERENCIA ===")
print(f"El auto es un vehículo: {isinstance(auto1, Vehiculo)}")
print(f"La bicicleta es un vehículo: {isinstance(bici1, Vehiculo)}")
