class Persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad 

persona1 = Persona('Gian', 'Albornoz', 26)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona('Elpe', 'Pe', 27)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

