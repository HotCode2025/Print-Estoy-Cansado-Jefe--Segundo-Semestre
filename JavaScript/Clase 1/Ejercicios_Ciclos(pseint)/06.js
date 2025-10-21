//Ejercicio 6: Diseñar un algoritmo que tomando como entrada una cadena de texto nos devuelva si es o no un palíndromo.
//Se conoce que se denomina palíndromo a una palabra o frase que, ignorando los blancos, 
//se lee igual de izquierda a derecha que de derecha a izquierda. 

let cadena = "Reconocer";

let cadenaMinusculas = cadena.toLowerCase();

let cadenaInvertida = "";

for (let i = cadenaMinusculas.length - 1; i >= 0; i--){
    cadenaInvertida += cadenaMinusculas[i];
}

if (cadenaMinusculas == cadenaInvertida){
    console.log("La palabra es Palindroma")
}else{
    console.log("La palabra no es Palindroma")
}