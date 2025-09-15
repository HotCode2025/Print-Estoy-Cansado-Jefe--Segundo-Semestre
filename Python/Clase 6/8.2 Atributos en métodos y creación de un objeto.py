class Persona:  # Creamos una clase

    def __init__(self):  # Se lo llama método Init Dunder
        self.nombre = 'Bartolito'
        self.apellido = 'Guzman'
        self.edad = 22

persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)