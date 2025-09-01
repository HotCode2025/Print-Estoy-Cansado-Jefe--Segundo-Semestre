# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuacion
# cree las siguientes listas (en las que no deben haber repeticion)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

lista1 = ["perro", "gato", "loro", "caballo", "hamster"]
lista2 =  ["vaca", "oveja", "cabra", "caballo", "conejo"]

set1 = set(lista1)
set2 = set(lista2)

# Lista de palabras que aparecen en las listas
union = list(set1 | set2)

# Lista de palabras que aparecen en la primera lista, pero no en la segunda
palabrasPrimerLista = list(set1 - set2)

# Lista de palabras que aparecen en la segunda lista, pero no en la primera
palabrasSegundaLista = list(set2 - set1)

# Lista de palabras que aparecen en ambas listas
palabrasAmbasListas = list(set1 & set2)

print("Palabras que aparecen en las listas: ",union)
print(f"\nPalabras que solo aparecen en la primer lista: ", palabrasPrimerLista)
print(f"\nPalabras que solo aparecen en la segunda lista: ", palabrasSegundaLista)
print(f"\nPalabras que aparecen en ambas listas: ", palabrasAmbasListas)
