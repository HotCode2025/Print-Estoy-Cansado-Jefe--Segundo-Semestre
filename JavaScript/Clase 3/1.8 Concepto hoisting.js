//Función tipo expresión 
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //muestra el parametro de: a
    console.log(arguments[1]); //muestra el parametro de: b
    return a + b + (arguments[2]);
}
resultado = sumar(3, 2, 9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta); 41 
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}