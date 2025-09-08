# Ejercicio 10: No repetir caracteres.
# Hacer un programa que pida una cadena por teclado, luego.
# meter los caracteres en una lista sin repetir caracteres.

# Pedir una cadena al usuario
cadena = input("Ingrese una cadena: ")

# Crear una lista para almacenar caracteres únicos
lista_caracteres = []

# Recorrer cada carácter de la cadena
for char in cadena:
    if char not in lista_caracteres:
        lista_caracteres.append(char)

# Mostrar la lista final
print("Caracteres sin repetir:", lista_caracteres)