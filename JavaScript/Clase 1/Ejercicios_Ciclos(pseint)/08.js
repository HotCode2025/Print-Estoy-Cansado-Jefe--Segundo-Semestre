//Ejercicio 8: Sustituir todos los espacios en blanco de una frase por un asterisco (*). 

let frase = "Nos Vemos Mañana";

let fraseModificada = "";

for (let i = 0; i < frase.length; i++){
    if (frase[i] === " "){
        fraseModificada += "*";
    }else{
        fraseModificada += frase[i];
    }
}

console.log("Frase Modificada: " + fraseModificada)