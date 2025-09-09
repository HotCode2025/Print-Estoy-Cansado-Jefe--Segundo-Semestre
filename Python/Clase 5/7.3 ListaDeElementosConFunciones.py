def desplegarNombres (nombres):
    for nombre in nombres:
        print(nombre)

nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
#desplegarNombres(10) No es un objeto iterable
desplegarNombres((10,11)) #Lo convertimos en tupla, en un solo elemento no olvidar la coma sino no se considera como tupla
desplegarNombres([22,55])#Lo convertimos en lista