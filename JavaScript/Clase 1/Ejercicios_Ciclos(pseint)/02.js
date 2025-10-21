// Ejercicio 2: Calcular la longitud de 2 cadenas de caracteres, y mostrar la cadena con la mayor longitud.

let cadena1 = "Buenos dias";

let cadena2 = "Buenas Tardes";

let longitud1 = cadena1.length;

let longitud2 = cadena2.length;

if (longitud1 > longitud2){
    console.log("La cadena " + cadena1 + " es la cadena con mayor longitud")
}else if (longitud1 < longitud2){
    console.log("La cadena " + cadena2 + " es la cadena con mayor longitud")
} else{
    console.log("Ambas cadenas tienen la misma longitud")
}