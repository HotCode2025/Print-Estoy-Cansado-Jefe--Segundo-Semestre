# Diccionario para datos de la seleccion Argentina
seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 37, "Altura": 1.70, "Precio": "50 millones", "Posicion": "Extremo Derecho"},
    11: {"Nombre": "Ángel Di María", "Edad": 36, "Altura": 1.80, "Precio": "5 millones", "Posicion": "Extremo Izquierdo"},
    24: {"Nombre": "Enzo Fernández", "Edad": 23, "Altura": 1.78, "Precio": "80 millones", "Posicion": "Centrocampista"},
    9: {"Nombre": "Julián Álvarez", "Edad": 24, "Altura": 1.70, "Precio": "90 millones", "Posicion": "Delantero Centro"},
    1: {"Nombre": "Emiliano Martínez", "Edad": 32, "Altura": 1.95, "Precio": "28 millones", "Posicion": "Arquero"},
    17: {"Nombre": "Cristian Romero", "Edad": 26, "Altura": 1.85, "Precio": "60 millones", "Posicion": "Defensa Central"},
    3: {"Nombre": "Nicolás Tagliafico", "Edad": 33, "Altura": 1.72, "Precio": "10 millones", "Posicion": "Lateral Izquierdo"},
    7: {"Nombre": "Rodrigo De Paul", "Edad": 30, "Altura": 1.80, "Precio": "40 millones", "Posicion": "Centrocampista"},
    5: {"Nombre": "Leandro Paredes", "Edad": 31, "Altura": 1.82, "Precio": "12 millones", "Posicion": "Centrocampista Defensivo"},
    21: {"Nombre": "Paulo Dybala", "Edad": 31, "Altura": 1.77, "Precio": "20 millones", "Posicion": "Segundo Delantero"}
}

for numero, datos in seleccionArgentina.items():
    print(numero, datos)

# Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f"{i} -> {seleccionArgentina[i]}")