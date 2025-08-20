# Tipo Set o conjunto
planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)
print(len(planetas)) # Usamos la funcion len = lenght significa largo

# Revisar si un elemento existe dentro de set
print("Marte" in planetas)
print("Martes" in planetas) # Buscar el elemento tal cual está dentro de set
print("Jupiter" not in planetas)

# Agregar un elemento
planetas.add("Tierra") # add es una funcion
planetas.add("Tierra") # No se pueden agregar elementos duplicados o repetidos
print(planetas)

# Eliminar elementos puede arrojar un error si el elemento no existe
planetas.remove("Jupiter")
#planetas.remove("tierra") # Va a largar un error KeyError porque ese elemento no está en la lista
print(planetas) 
planetas.discard("Tierra")
print(planetas)
planetas.discard("marte") # No larga error, se va a mostrar la lista tal cual está
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
# print(planetas) # al eliminar el set nos muestra un error