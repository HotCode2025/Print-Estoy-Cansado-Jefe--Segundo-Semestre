class Aritmetica:
    """
    El nombre de este tipo de comentario es: Docstring
    esto es documentación de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y má
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    def sumar(self):
        return self.operandoA + self.operandoB

aritmetical = Aritmetica(7, 9) # Le pasamos los argumentos para los operandos
print("La suma es: ", aritmetical.sumar())