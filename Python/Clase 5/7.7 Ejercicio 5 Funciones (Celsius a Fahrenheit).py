# Ejercicio 5: Convertidor de Temperaturas

def celsius_a_fahrenheit(celsius):
  """
  Convierte una temperatura de grados Celsius a Fahrenheit.
  Fórmula: F = (C * 9/5) + 32
  """
  fahrenheit = (celsius * 9/5) + 32
  return fahrenheit

def fahrenheit_a_celsius(fahrenheit):
  """
  Convierte una temperatura de grados Fahrenheit a Celsius.
  Fórmula: C = (F - 32) * 5/9
  """
  celsius = (fahrenheit - 32) * 5/9
  return celsius

# Ejemplos de uso
temp_celsius = 25
temp_fahrenheit = 77

# Conversiones
print(f"{temp_celsius}°C es igual a {celsius_a_fahrenheit(temp_celsius)}°F")
print(f"{temp_fahrenheit}°F es igual a {fahrenheit_a_celsius(temp_fahrenheit)}°C")