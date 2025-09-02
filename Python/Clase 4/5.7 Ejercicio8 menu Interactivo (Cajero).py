# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de 1000$ y tendrá el siguiente menú de opciones:
#    1. Ingresar dinero en la cuenta
#    2. Retirar dinero de la cuenta
#    3. Mostrar dinero disponible
#    4. Salir
# Fue gracioso hacer esto porque me imagine atendiendo al usuario xd ヾ(•ω•`)o

def cajero_automatico():
    #  plata inicial
    saldo = 1000.0
    
    print("🏦" + "=" * 50)
    print("           CAJERO AUTOMÁTICO VIRTUAL")
    print("=" * 50)
    print(f"💰 Saldo inicial: ${saldo:,.2f}")
    print("-" * 50)
    
    while True:
        #  Mostrar menú
        print("\n [--[MENÚ DE OPCIONES]--]")
        print("1️⃣  ►Ingresar dinero")
        print("2️⃣  ►Retirar dinero") 
        print("3️⃣  ►Consultar saldo")
        print("4️⃣  ►Salir")
        print("-" * 30)
        
        try:
            #  Seleccionar opciones
            opcion = int(input("► Selecciona una opción (1-4): "))
            print()
            
            if opcion == 1:
                #  Ingresar plata
                print("💵 INGRESAR EFECTIVO ")
                print("---------------------")
                try:
                    monto = float(input("¿Cuánto dinero deseas ingresar? $"))
                    if monto > 0:
                        saldo += monto
                        print(f"✅ ¡Perfecto! Has ingresado ${monto:,.2f}")
                        print(f"💰 Nuevo saldo: ${saldo:,.2f}")
                    else:
                        print("como vas a ingresar plata negativa o 0?? intenta de nuevo")
                except ValueError:
                    print("esto es un banco o un circo? porque estas muy chistoso por lo que veo, ingresa un (número) válido")
                    
            elif opcion == 2:
                #  Retirar plata
                print("💸 RETIRAR PLATA")
                print("-----------------")
                try:
                    monto = float(input("¿Cuánto dinero quiere retirar? $"))
                    if monto > 0:
                        if monto <= saldo:
                            saldo -= monto
                            print(f"✅ Retiro exitoso: ${monto:,.2f}")
                            print(f"💰 Nuevo saldo: ${saldo:,.2f}")
                        else:
                            print("Fondos insuficientes")
                            print(f"💰 Saldo disponible: ${saldo:,.2f}")
                    else:
                        print("No podes retirar plata negativa o 0, intenta de nuevo")
                except ValueError:
                    print("Estas loco? Ingresa una cantidad válida (número)     por favor🤌")
                    
            elif opcion == 3:
                #  Consultar saldo
                print("=-[CONSULTA DE SALDO]-=")
                print("-----------------------")
                print(f"💰 Saldo disponible: ${saldo:,.2f}")
                
            elif opcion == 4:
                #  Salir
                print("¡Gracias por usar este cajero automático!")
                print(f"💳 Saldo final: ${saldo:,.2f}")
                print("🏦" + "=" * 50)
                break
                
            else:
                print("Tenes 4 opciones y te complicas solo, elige 1-4")
                
        except ValueError:
            print("Todo mal con vos, ingresa un número válido (1-4)")
        
        # Separador entre operaciones
        print("\n" + "═" * 50)

#  Ejecutar el cajero
if __name__ == "__main__":
    cajero_automatico()