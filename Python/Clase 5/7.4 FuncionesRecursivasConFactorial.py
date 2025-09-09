#Funciones Recursivas
def factorial(numero):
    if  numero == 1: #caso base
        return 1
    else:
        return numero * factorial(numero-1) #Caso recursivo

numero_usuario = int(input("Ingresa un número para calcular su factorial: "))
resultado = factorial(numero_usuario)
#resultado = factorial(5) #LO hacemos en código duro
print('El factorial del número 5 es: {resultado}')