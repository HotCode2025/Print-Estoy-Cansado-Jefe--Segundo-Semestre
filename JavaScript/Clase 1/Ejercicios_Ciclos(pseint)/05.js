//Ejercicio 5: Cambiar una cadena de caracteres, al revés 

let cadena = "Futbol";

let cadenaInvertida = "";

for (let i = cadena.length - 1; i >= 0; i--) {
    cadenaInvertida += cadena[i];
}

console.log("La cadena invertida es: " + cadenaInvertida)