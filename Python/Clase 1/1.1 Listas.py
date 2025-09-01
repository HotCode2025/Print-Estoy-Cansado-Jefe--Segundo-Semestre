# lista = Emir, Lautaro, Fran, Martin

nombres = ['Emir' , 'Lautaro', 'Fran', 'Martin']
print(nombres)
print(nombres[0:2]) # Solo muestra el indice 0, 1 pero no el indice 2
# Ir del inicio de lista al indice (sin incluirlo)
print(nombres[ :3]) # Indices a mostrar 0, 1, 2
# Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor
nombres[3] = 'Abril'
nombres[0] = 'Gian'
print(nombres)
# Iterar una lista
for nombre in nombres: # Nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuantos elementos tiene
print(len(nombres)) # Le pasamos como parametro la lista

# Agregamos un elemento
nombres.append('Marcos')
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Nicolas')
print(nombres)
nombres.insert(3, 'Roy')
print(nombres)

# Eliminamos un elemento
nombres.remove('Nicolas')
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2] # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
print(nombres)
