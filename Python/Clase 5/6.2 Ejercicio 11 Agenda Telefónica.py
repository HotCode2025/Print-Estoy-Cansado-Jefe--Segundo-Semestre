# Ejercicio 11: Agenda telefonica.
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendra el siguiente menu de opciones: 
# 1. Nuevo contacto
# 2. Borrar contacto
# 3. Ver contactos existentes
# 4. Salir

# Ejercicio 11: Agenda telefónica

# Diccionario para almacenar contactos
agenda = {}

while True:
    # Mostrar menú
    print("\nAgenda Telefónica")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Elige una opción (1-4): ")

    if opcion == "1":
        nombre = input("Ingresa el nombre del contacto: ")
        if nombre in agenda:
            print(f"El contacto '{nombre}' ya existe con el número {agenda[nombre]}.")
        else:
            telefono = input("Ingresa el número de teléfono: ")
            agenda[nombre] = telefono
            print(f"Contacto '{nombre}' agregado correctamente.")

    elif opcion == "2":
        nombre = input("Ingresa el nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"Contacto '{nombre}' borrado correctamente.")
        else:
            print(f"El contacto '{nombre}' no existe.")

    elif opcion == "3":
        if agenda:
            print("\nContactos existentes:")
            for nombre, telefono in agenda.items():
                print(f"{nombre}: {telefono}")
        else:
            print("No hay contactos en la agenda.")

    elif opcion == "4":
        print("Saliendo de la agenda. ¡Hasta luego!")
        break

    else:
        print("Opción inválida. Por favor, elige entre 1 y 4.")