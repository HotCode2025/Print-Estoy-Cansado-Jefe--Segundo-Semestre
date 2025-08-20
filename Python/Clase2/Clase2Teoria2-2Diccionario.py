# Diccionario
# Un diccionario esta compuesto por 2 elementos: UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    "IDE" : "Integrated Development Enviroment",
    "POO" : "Programacion Orientada a objetos",
    "SABD": "Sistema de Administracion de Base de Datos"
}
# Verificar la cantidad de elementos en el diccionario
print(diccionario)
print(len(diccionario))

# Acceder a un diccionario con la llave (key)
print(diccionario["IDE"])
#print(diccionario["IDe"]) # Va a largar un error porque la llave está mal escrita

# Otra forma de recuperar un elemento
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# Modificamos los elementos

diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

#for termino, valor in diccionario:
    #print(termino, valor)          # Esto larga un error

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de accedder a un diccionario
for termino in diccionario.keys(): # Estamos usando una funcion
    print(termino)                 # Muestra solo las llaves

for valor in diccionario.values(): # Usamos una funcion para acceder al valor
    print(valor)

# Comprobar la existencia de algun elemento

print("IDE" in diccionario) # Devuelve un booleano

# Agregar un elemento

diccionario["PK" ] = "Primary Key"
print(diccionario) # No se pueden agregar elementos duplicados

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
del diccionario # El diccionario se borró
#print(diccionario) # Larga un error ya que el diccionario no existe

