class Monitor:

    contador_monitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self._id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f"ID: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}"

    # Prueba

if __name__ == '__main__':
    monitor1 = Monitor("AOC", "23.8 Pulgadas")
    print(monitor1)
    monitor2 = Monitor("Samsung", "27 Pulgadas")
    print(monitor2)
