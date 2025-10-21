//Ejercicio 9: Leer una frase y contar el número de vocales (de cada una) que aparecen.

let frase = "Aguacate";

let fraseMinuscula = frase.toLowerCase();

let contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

for (let i = 0; i < fraseMinuscula.length; i++){
    if (fraseMinuscula[i] === "a"){
        contadorA ++;
    } else if (fraseMinuscula[i] === "e"){
        contadorE ++;
    } else if (fraseMinuscula[i] === "i"){
        contadorI ++;
    } else if (fraseMinuscula[i] === "o"){
        contadorO ++;
    } else if (fraseMinuscula[i] === "u"){
        contadorU ++;
    }
}

console.log("Cantidad de A: " + contadorA);
console.log("Cantidad de E: " + contadorE);
console.log("Cantidad de I: " + contadorI);
console.log("Cantidad de O: " + contadorO);
console.log("Cantidad de U: " + contadorU);