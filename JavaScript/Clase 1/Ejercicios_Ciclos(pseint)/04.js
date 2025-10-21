//Ejercicio 4: Diseñe un algoritmo que elimine los espacios en blanco de un texto.

let cadena = "Como estuvo tu dia";

let textoSinEspacio = cadena.replace(/\s+/g, "");

console.log ("Texto sin espacios: " +textoSinEspacio)