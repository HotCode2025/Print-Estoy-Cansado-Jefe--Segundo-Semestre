# Paso de Argumentos (funciones)
def mi_funcion(name, lastname):
    print("Hola " + name + " " + lastname)

mi_funcion("Lionel", "Messi")
mi_funcion("Ángel", "Di María")
mi_funcion("Enzo", "Fernández")

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b

# resultado = sumar(5, 10)
# print("El resultado de la suma es:", resultado)
print(f"El resultado de la suma es: {sumar(55, 25)}")

def sumar2(a = 0, b = 0): # Le damos un valor por default
    return a + b 
resultado = sumar2(22, 66)
print(f"El resultado de la suma es: {resultado}")
