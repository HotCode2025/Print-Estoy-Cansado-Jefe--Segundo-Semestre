# Tarea: encapsular atributos y agregar getters/setters.

class Persona:
    def __init__(self, nombre, apellido, edad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad

    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_edad(self):
        return self.__edad

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_apellido(self, apellido):
        self.__apellido = apellido

    def set_edad(self, edad):
        self.__edad = edad

    def __str__(self):
        return f"Persona(nombre={self.__nombre}, apellido={self.__apellido}, edad={self.__edad})"
    
persona = Persona("Juan", "Perez", 30)
print(f"Nombre: {persona.get_nombre()}")
print(f"Apellido: {persona.get_apellido()}")
print(f"Edad: {persona.get_edad()}")
persona.set_nombre("Juan")
persona.set_apellido("Perez")
persona.set_edad(35)
