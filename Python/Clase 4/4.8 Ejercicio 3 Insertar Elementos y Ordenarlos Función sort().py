# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaria de insertar.
# Por último, mostrar los números ordenados de menor a mayor

numeros = []
salir = False
while not salir:
    num=int(input("Ingrese un número: ")) # Pedimos números al usuario
    if num == 0: 
        salir = True    # Si el número ingresado es 0 cambiamos el valor
    else:
        numeros.append(num) # Agregamos el número ingresado a la lista

numeros.sort()  # Ordenamos la lista con la función sort
print(f"\nLista ordenada: \n{numeros}")