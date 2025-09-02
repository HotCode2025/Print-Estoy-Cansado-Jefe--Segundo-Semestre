# Ejercicio 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostra
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...-50

numeros = []
for num in range(1,51):
    numeros.append(num) #Lenamos la lista con los números del 1 al 50

for num in range(len(numeros)):
    print(numeros[num], end="") # Imprime el número
    if num < len(numeros)-1: # Si no es el último elemento de la lista
        print("-", end="") # Imprime un "-" despues del elemento