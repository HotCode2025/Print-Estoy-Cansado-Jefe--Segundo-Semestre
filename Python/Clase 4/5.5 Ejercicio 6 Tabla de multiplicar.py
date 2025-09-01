# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50

# Pedimos al usuario un digito
numero = int(input("Digite un número: "))
# Se crea la tabla de multiplicar hasta el 10
tabla = [numero * i for i in range(1, 11)]
# Y mostramos la lista con print("")
print("La tabla de multiplicar es:", tabla)
