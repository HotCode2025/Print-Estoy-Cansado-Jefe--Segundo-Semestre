//Diseñar un programa que al ingresar el año, nos devuelva
//por consola si es un año bisiesto o no, repetir la accion
//hasta que el usuario lo desida.

s = 1;

año = 1948;

while (s == 1) {

    if (año % 4 == 0){

        console.log("El año " + año + " es bisiesto.");
    }else{
        console.log("El año " + año + " no es bisiesto.");
    }
    
    s++;
}