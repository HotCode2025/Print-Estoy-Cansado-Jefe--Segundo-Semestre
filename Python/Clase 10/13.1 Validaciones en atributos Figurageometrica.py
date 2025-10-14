from abc import ABC, abstractmethod #Importamos ABC y abstractmethod para crear una clase abstracta

class FiguraGeometrica(ABC): #Hereda de ABC para ser una clase abstracta
    """Clase abstracta que representa una figura geométrica"""
    def __init__(self, alto, ancho):
        if self._validar_valores(alto):
            self._alto = alto
        else: 
            self._alto = 0
            print(f"Valor de alto no válido {ancho}")
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f"Valor de ancho no válido {ancho}")


    @property
    def alto(self):
        return self._alto

    @property
    def ancho(self):
        return self._ancho
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f"Valor de alto no válido {alto}")

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else: 
            print(f"Valor de ancho no válido {ancho}")
    
    @abstractmethod
    def calcular_area(self): #Método abstracto, debe ser implementado en las subclases por eso implementamos pass, para que no de error, por ende a las clases hijas las obliga a crear el método de calcular el área
        pass

    def __str__(self):
        return f"FiguraGeometrica: [Alto: {self._alto}, Ancho: {self._ancho}]"
    
    def _validar_valores(self, valor): #Método encapsulado
        return True if 0 < valor < 10 else False