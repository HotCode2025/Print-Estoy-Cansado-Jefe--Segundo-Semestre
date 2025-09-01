# Ejercicio 2: Operaciones de conjuntos con listas
# Este programa trabaja con 2 listas de palabras y que a continuacion
# 1. Lista de palabras que aparecen en las listas.
# 2. Lista de palabras que aparecen en la primera lista, pero no en la segunda.
# 3. Lista de palabras que aparecen en la segunda lista, pero no en la primera.
# 4. Lista de palabras que aparecen en ambas listas.

L1 = ["manzana", "pera", "banana", "kiwi"]
L2 = ["banana", "kiwi", "naranja", "uva"]

lista1 = []
lista2 = []
lista3 = []
lista4 = []

for palabra in L1:
    if palabra not in lista1:
        lista1.append(palabra)

for palabra in L2:
    if palabra not in lista1:
        lista1.append(palabra)

for palabra in L1:
    if palabra not in lista2 and palabra not in L2:
        lista2.append(palabra)

for palabra in L2:
    if palabra not in lista3 and palabra not in L1:
        lista3.append(palabra)

for palabra in L1:
    if palabra not in lista4 and palabra in L2:
        lista4.append(palabra)

print("Todas las palabras de ambas listas son: ",lista1)
print("Las palabras que solo estan en la primera lista son: ",lista2)
print("Las palabras que solo estan en la segunda lista son: ",lista3)
print("Las palabras que estan en ambas listas son: ",lista4)
