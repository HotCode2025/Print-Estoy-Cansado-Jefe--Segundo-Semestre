# Pilas usando Listas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos los elementos desde el final
pila.pop() # Elimina el ultimo elemento de la lista 
print(pila)

elementoBorrado = pila.pop() # Quita el ultimo elemento y lo guarda en la variable
print(f"Sacamos el elemento {elementoBorrado}")
print(f"La pila ahora quedo asi: {pila}")