# Video 1: 
# En el primer video se realiza repaso y correcciones de 
# las listas de Clase1

#Video 2:
# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 # Concatenacion
print(lista3)

lista3.extend([7, 8, 9, 1]) # Funcion para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice esta el valor ingresado
#print(lista.index(0)) # Esto da un error porque el elemento no esta en la lista

# Como saber cuantos valores repetidos hay en una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Video 3:
# Para que una lista se multiplique repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento
lista3.sort() # Ordena los elementos ascendentemente
print(lista3)

lista3.sort(reverse=True)
print(lista3)


