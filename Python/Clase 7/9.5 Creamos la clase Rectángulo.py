class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

rectangulos = []

for i in range(1, 4):
    print(f"\nRectángulo {i}")
    base = float(input("Ingresa la base: "))
    altura = float(input("Ingresa la altura: "))
    rectangulo = Rectangulo(base, altura)
    rectangulos.append(rectangulo)

print("\nÁreas calculadas:")
for i, r in enumerate(rectangulos, start= 1):
    print(f"Rectángulo {i}: Área = {r.area()}")
