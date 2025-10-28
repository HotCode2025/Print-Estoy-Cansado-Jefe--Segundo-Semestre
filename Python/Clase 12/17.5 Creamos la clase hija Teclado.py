# from dispositivo_entrada import DispositivoEntrada

class Teclado(DispositivoEntrada):

    contador_teclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_teclados += 1
        self._id_teclados = Teclado.contador_teclados
        super().__init__(marca, tipo_entrada)

    def __str__(self):
        return f"ID: {self._id_teclados}, Marca: {self.marca}, Tipo: {self._tipo_entrada}"

# Pruebas.

if __name__ == '__main__':
    teclado1 = Teclado("Redragon", 'USB')
    print(teclado1)
    teclado2 = Teclado("ASUS", 'Wireless Bluetooth')
    print(teclado2)