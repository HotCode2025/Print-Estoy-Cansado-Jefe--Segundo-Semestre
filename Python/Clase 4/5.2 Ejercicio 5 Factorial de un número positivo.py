"""
Ejercicio 5: Factorial de un número positivo
Hacer un programa para calcular el factorial de un número positivo
"""

# Solicitar al usuario un número positivo
numero = int(input("Ingresa un número entero positivo: "))

# Asegurarse de que el número sea positivo
if numero < 0:
    print("El factorial no está definido para números negativos.")
else:
    # Caso especial: el factorial de 0 es 1
    if numero == 0:
        factorial = 1
    else:
        # Calcular el factorial usando un bucle
        factorial = 1
        for i in range(1, numero + 1):
            factorial *= i

    # Imprimir el resultado
    print(f"El factorial de {numero} es {factorial}")