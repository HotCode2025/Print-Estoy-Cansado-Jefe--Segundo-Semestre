# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le devolverá
# la misma frase pero sin espacios en blanco, y además un contador de
# cuántos caracteres tiene la frase (sin contar los espacios en blanco)
# Es una pena terrible...
# A oliver le cayo un meteorito mientras caminaba por la calle 
# Ay ayyy... ay
def procesar_frase():
    print("=" * 50)
    print("      FRASENEITOR")
    print("=" * 50)
    
    # Solicitar la frase al usuario
    frase_original = input("Por favor, ingresa una frase: ")
    
    # Eliminar espacios
    frase_sin_espacios = frase_original.replace(" ", "")
    
    # Contar caracteres (sin espacios)
    longitud_sin_espacios = len(frase_sin_espacios)
    longitud_original = len(frase_original)
    
    # Resultados
    print("\n" + "-" * 50)
    print("RESULTADOS:")
    print(f"Frase original: '{frase_original}'")
    print(f"Frase sin espacios: '{frase_sin_espacios}'")
    print(f"Longitud original: {longitud_original} caracteres")
    print(f"Longitud sin espacios: {longitud_sin_espacios} caracteres")
    print(f"Espacios eliminados: {longitud_original - longitud_sin_espacios}")
    print("-" * 50)

# Ejecutar el programa
if __name__ == "__main__":
    procesar_frase()