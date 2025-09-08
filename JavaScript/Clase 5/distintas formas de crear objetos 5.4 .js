// Diferentes formas de crear objetos

// caso objeto 1
let miobjeto = new Object(); // Esta es una opción formal
// caso objeto 2
let miobjeto2 = {}; // Esta opción es breve y recomendada

// caso String 1
let miCadena1 = new String('Hola'); // Sintaxis formal
// caso String 2
let miCadena2 = 'Hola'; // Esta es la sintaxis simplificada y recomendada

// caso con números 1
let miNumero = new Number(1); // Es formal no recomendable
// caso con números 2
let miNumero2 = 1; // Sintaxis recomendada

// caso boolean 1
let miBoolean1 = new Boolean(false); // Formal
// caso boolean 2
let miBoolean2 = false; // Sintaxis recomendada

// caso Arreglos 1
let miArreglo1 = new Array(); // Formal
// caso Arreglos 2
let miArreglo2 = []; // Sintaxis recomendada

// caso function 1
let miFuncion1 = new function(){}; // Todo después de new es considerado objeto
// caso function 2
let miFuncion2 = function(){}; // Notación simplificada y recomendada