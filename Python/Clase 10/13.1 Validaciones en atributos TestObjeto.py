from Cuadrado import *
from Rectangulo import *
from FiguraGeometrica import *

print("Creacion de objeto clase Cuadrado".center(50, "-"))
c1 = Cuadrado(8, "Rojo")
c1.alto = -10
# print(c1.alto)
# print(c1.ancho)
# print(c1.color)
print("Área del cuadrado:", c1.calcular_area())
print(c1)

# MRO = Method Resolution Order
# Nos indica el orden en que se buscan los métodos en una jerarquía de herencia múltiple.
# print(Cuadrado.mro()) 


print("Creacion de objeto clase Rectangulo".center(50, "-"))
r1 = Rectangulo(3, 9, "Azul")
r1.ancho = 15
# print(r1.alto)
# print(r1.ancho)
# print(r1.color)
print("Área del rectángulo:", r1.calcular_area())
print(r1)

# f1 = FiguraGeometrica(3, 6) #No se puede instanciar una clase abstracta, da error
print(Cuadrado.mro())