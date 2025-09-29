class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre=nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'LOs datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property
    def nombre(self):
        print("estamos utilizando el metodo get ")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("estamos utilizando el metodo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad
# Metodo set comentado para probar el read-only
    #@edad.setter
    #def edad(self, edad):
   #     self._edad = edad

persona1 = Persona2('Gian', 'Albornoz', 26)
print(persona1.nombre)
persona1.nombre = "Jorgito Perito"
print(persona1.nombre)
print(persona1.mostrar_detalles())
#Atributo read-only (sería la edad porque no tiene el metodo set)
print(persona1.edad)
