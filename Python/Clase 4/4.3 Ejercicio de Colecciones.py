# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del Señor de los Anillos:
#   Nombre: Aragorn
#   Clase: Guerrero
#   Raza: Dúnadan del norte

#   Nombre: Gandalf
#   Clase: Mago
#   Raza: Istar

#   Nombre: Legolas
#   Clase: Arquero
#   Raza: Elfo Sindar

PersonajesDeSDLA = {
    1: {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del norte"},
    2: {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"},
    3: {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"},
}

PersonajesDeSDLA[4] = {"Nombre": "Galadriel", "Clase": "Hechicera", "Raza": "Elfa Noldor"}

for llave, valor in PersonajesDeSDLA.items():
    print(llave, valor)
