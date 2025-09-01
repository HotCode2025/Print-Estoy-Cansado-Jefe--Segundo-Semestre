conjunto3 = conjunto1 | conjunto2 #Union.La linea es la que une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #Interseccion.Elementos que tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2#Diferencia.Asigna el valor que esta en el conjunto1 y no esta en conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2#Diferencia Simetrica.Elementos que no corparten o que son diferentes entre ambos.
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) #Subconjuntos. Preguntar si un conjunto es un subconjunto dentro de otro.
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issubset(conjunto3)) # preguntamos si los elementos del conjunto1 estan dentro del 3
print(conjunto3.issubset(conjunto2)) # Si es verdadero quiere decir que el conjunto3 es u superconjunto
print(conjunto2.issubset(conjunto3))

#Como ssaber si ambos conjuntos son disconexos, esto  es si no comparten elementos en comun.
print(conjunto1.isdisjoint(conjunto2))#Preguntamos si existen cosas en comun

#Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea totalmente inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto