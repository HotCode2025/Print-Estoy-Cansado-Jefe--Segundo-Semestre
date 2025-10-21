//Ejercicio 1: Diseñe un programa que permita ingresar una cadena de caracteres, y detecte cuántas vocales tiene. 

let cadena = "Buenos dias";

let contador = 0;

let texto = cadena.toLowerCase(); //Nos tranforma cualquier cadena de texto a minuscula

for (let i = 0; i < texto.length; i++){
    if ( texto[i] === "a" || texto[i] === "e" || texto[i] === "i" || texto[i] === "o" || texto[i] === "u"){
        contador++;
    }
}

console.log("Total de vocales: " + contador)