 Ejercicio 2: Función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicar(*num):  # Creamos la función con *args
    multi = 1
    for numero in num:      # Creamos un ciclo para multiplicar todos los números ingreados
        multi *= numero
    return multi

print(f'La multiplicación de todos los números es: {multiplicar(1,2,3,4,5,6,7,8,9)}')
print(f'La multiplicación de todos los números es: {multiplicar(1,2,3,4,5)}')