"""
Ejercicio 4: Sumar números pares dentro de un rango
Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
    suma de números pares del 2 al 30
    suma = 240
"""

# Pedir al usuario el inicio y fin del rango
inicio_rango = int(input("Ingresa el número de inicio del rango: "))
fin_rango = int(input("Ingresa el número final del rango: "))

# Inicializar la variable para la suma
suma_pares = 0

# Iterar sobre el rango de números
for numero in range(inicio_rango, fin_rango + 1):
    # Comprobar si el número es par
    if numero % 2 == 0:
        # Si es par, sumarlo a la variable suma_pares
        suma_pares += numero

# Imprimir el resultado
print(f"La suma de los números pares en el rango de {inicio_rango} a {fin_rango} es: {suma_pares}")