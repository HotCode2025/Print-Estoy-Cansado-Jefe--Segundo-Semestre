# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.

import random

numero = random.randint(1, 100)
intentos = 0

while True:
    x = int(input("Adivina el número (1-100): "))
    intentos += 1

    if x == numero:
        print("¡Acertaste en", intentos, "intentos!")
        break
    elif x < numero:
        print("Es mayor")
    else:
        print("Es menor")
