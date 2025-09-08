# Desempaquetado de listas o list unpacking
def show(name_, lastName_):
    print(name_ + lastName_)

person = ["Ariel", "Betancud"]
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto

person2 = ("Osvaldo", "Giordanini")  # desempatamos a través de una tupla
show(*person2)

person3 = {"lastName": "Lucero", "name": "Natalia"}
show(*person3)
