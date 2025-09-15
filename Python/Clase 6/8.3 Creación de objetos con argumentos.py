class Persona: # Creamos una clase

    def __init__(self, nombre, apellido, edad): #Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

persona1 = Persona('Ariel', 'Betancud', 40) # Necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)