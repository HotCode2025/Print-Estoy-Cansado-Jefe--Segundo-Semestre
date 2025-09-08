# Ejercicio 4: Calculadora de Impuestos

# Se define una función para calcular el total de un pago con un impuesto aplicado.
def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
  """
  Calcula el pago total después de aplicar un impuesto.
  
  Args:
    pago_sin_impuesto (float): El costo original del producto o servicio.
    impuesto (float): El porcentaje del impuesto a aplicar.
    
  Returns:
    float: El pago total incluyendo el impuesto.
  """
  pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
  return pago_total

# Proporcionar los valores del ejercicio.
pago_sin_impuesto = 1000
impuesto = 21

# Calcular y mostrar el resultado.
pago_con_impuesto = calcular_pago_con_impuesto(pago_sin_impuesto, impuesto)
print(f"Pago con impuesto: {pago_con_impuesto}")