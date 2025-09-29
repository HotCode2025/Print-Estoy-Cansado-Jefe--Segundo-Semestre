# Crear tres objetos más, utilizando los métodos getter y setter.
# para modificar, y mostrar los cambios con el método mostrar_detalles.

class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre   # atributo privado
        self.__edad = edad       # atributo privado

    # Getter y Setter para nombre
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    # Getter y Setter para edad
    def get_edad(self):
        return self.__edad

    def set_edad(self, edad):
        if edad > 0:
            self.__edad = edad
        else:
            print("Edad inválida")

    # Método para mostrar detalles
    def mostrar_detalles(self):
        print(f"Nombre: {self.__nombre}, Edad: {self.__edad}")


# Crear 3 objetos más y modificarlos con setter
p1 = Persona("Ana", 20)
p2 = Persona("Luis", 25)
p3 = Persona("María", 30)

# Mostrar detalles iniciales
p1.mostrar_detalles()
p2.mostrar_detalles()
p3.mostrar_detalles()

print("---- Modificando con setters ----")

# Usar setters para cambiar datos
p1.set_nombre("Ana María")
p1.set_edad(21)

p2.set_nombre("Luis Alberto")
p2.set_edad(26)

p3.set_nombre("María Fernanda")
p3.set_edad(31)

# Mostrar cambios
p1.mostrar_detalles()
p2.mostrar_detalles()
p3.mostrar_detalles()