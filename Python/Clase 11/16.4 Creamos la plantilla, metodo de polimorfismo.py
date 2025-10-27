# test_polimorfismo.py

from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    print(objeto) # Llama de manera indirecta al str de la clase Empleado o Gerente
    print(type(objeto)) # Esto es para saber el tipo de dato que recibe

empleado = Empleado('Juan', 60000)
imprimir_detalles(empleado)
