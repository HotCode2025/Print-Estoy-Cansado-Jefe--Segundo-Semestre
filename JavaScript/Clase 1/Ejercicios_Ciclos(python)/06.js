//Supongamos que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. Realizar un algoritmo para calcular la calificacion promedio
//y la calificación mas baja y la mas alta

let notas = [87, 92, 78, 90, 88, 77, 95, 89, 84, 91];

let suma = 0;
let notaBaja = notas[0];
let notaAlta = notas[0];

for (let i = 0; i <= 9; i++) {

    suma += notas[i];

    if (notas[i] < notaBaja) {
        notaBaja = notas[i];
    }else if (notas[i] > notaAlta) {
        notaAlta = notas[i];
    }
}

console.log("La calificación promedio es: " + (suma / 10));
console.log("La calificación más baja es: " + notaBaja);
console.log("La calificación más alta es: " + notaAlta);