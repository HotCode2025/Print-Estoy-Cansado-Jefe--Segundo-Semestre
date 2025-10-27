# test_polimorfismo.py

from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
   # print(objeto) # Llama de manera indirecta al str de la clase Empleado o Gerente
    print(type(objeto)) # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())

empleado = Empleado('Juan', 60000)
imprimir_detalles(empleado)

gerente = Gerente('Ernesto', 80000, 'Sistemas')
imprimir_detalles(gerente)
