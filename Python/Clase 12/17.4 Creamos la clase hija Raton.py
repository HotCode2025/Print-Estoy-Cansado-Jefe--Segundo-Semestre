# from dispositivo_entrada import DispositivoEntrada

class Raton(DispositivoEntrada):
    contador_ratones = 0

    def __init__(self, marca, tipo_entrada):
        super().__init__(marca, tipo_entrada)
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones

    def __str__(self):
        return f'ID: {self._id_raton}, Marca: {self.marca}, Tipo de entrada: {self._tipo_entrada}]'


# Prueba
if __name__ == '__main__':
    raton1 = Raton('Logitech', 'USB')
    print(raton1)
    raton2 = Raton('Razer', '2.4 GHz')
    print(raton2)