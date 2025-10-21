//#Calcular la suma de los "N" primeros numeros

num = 10;
i= 1;
suma = 0;

while (i <= num) {
    suma = suma + i;
    i++;
}

console.log("La suma de los primeros " + num + " numeros es: " + suma);