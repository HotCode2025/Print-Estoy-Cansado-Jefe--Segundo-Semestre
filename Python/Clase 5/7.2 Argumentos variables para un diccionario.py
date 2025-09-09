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

#Argumentos, variables en funciones
def listarNombres(*nombres): # El asterisco indica que puede recibir varios argumentos
    for nombre in nombres:
        print(nombre)
listarNombres("Lionel", "Ángel", "Ariel", "Rosa", "Maria")
listarNombres("Marcos", "Emir", "Cesar", "Gian", "Abril", "Roy", "Lautaro")

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items():  # kwargs significa: key word argument
        print(f'{llave} : {valor}')

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE = 'Integrated Develoment Enviroment', PK='Primary Key')
listarTerminos(Nombre='Leonel Messi')