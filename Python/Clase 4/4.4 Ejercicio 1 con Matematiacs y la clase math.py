import math
# Ejercicio de matematicas
# Para sacar la raiz cuadrada de un numero positivo 

numero = int(input("Digite un numero positivo: "))
while numero < 0:
    print("Error, el numero debe ser positivo")
    numero = int(input("Digite un numero positivo: "))
print(f"\nLa raiz cuadrada de {numero} es igual a {math.sqrt(numero):.2f}")