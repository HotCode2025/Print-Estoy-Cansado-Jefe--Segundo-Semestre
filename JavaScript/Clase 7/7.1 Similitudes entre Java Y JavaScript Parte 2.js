let nombre = "Juan";
let apellido = "Pérez";

var juntos = nombre + 219; // Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos); // Juan219
juntos = nombre + 78 + 17; // Aquí se puede diferenciar a través de los paréntesis
console.log(juntos); // Juan7817
juntos = 78 + 17 + nombre;
console.log(juntos); // 95Juan

nombre += apellido; // Tercera Concatenación usando el operador simplificado
console.log(nombre); // JuanPérez

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2); // Pedro

const apellido2 = "Lepes";
// apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2); // Lepes

let x, y; // Se pueden crear varias variables dentro de una misma línea
x = 17, y = 21; // Se puede hacer asignación de varias variables dentro de la misma línea
let z = x + y; // Se asigna el valor de la operación
console.log(z); // 38

let _1num = 31; // No utilizar números para iniciar el nombre de una variable
let rompiendo = "rompe"; // No utilizar palabras reservadas para variables

console.log(_1num); // 31
console.log(rompiendo); // rompe