miFuncion(8,2); //Esto se lo conoce como hosting
function miFuncion(a,b){
    //console.log("sumamos: "+ (a+b));
return a+b;
}

// LLamando la funcion
miFuncion (5,4);
let resultado = miFuncion (6,7);
console.log(resultado);

// Declaramos una funcion de tipo expresión
let x = function(a,b){return a+b}; // necesita cierre con punto y coma
resultado = x(5,6); // al llamarla se pone la variable y parentesis
console.log(resultado);