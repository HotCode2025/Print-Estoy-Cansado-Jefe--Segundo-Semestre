let x = 10; // Variable de tipo primitiva 
console.log(x.length);
console.log('Tipos primitivos');

// Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){ // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    }
};

// Entre el texto de los console.log que hagamos "//" será lo que se muestre en la consola de nuestro navegador.

console.log(persona.nombre); // Carlos
console.log(persona.apellido); // Gil
console.log(persona.email); // cgil@gmail.com
console.log(persona.edad); // 30
console.log(persona); // { nombre: 'Carlos', apellido: 'Gil', email: 'cgil@gmail.com', edad: 30, nombreCompleto: [Function: nombreCompleto] }
console.log(persona.nombreCompleto()); // Carlos Gil

console.log('Ejecutando con un objeto');
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';

console.log(persona2.telefono); // 5492618282821

console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); // Accedemos como si fuera un arreglo

console.log('Usamos el ciclo for in');
// for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad); // nombre, apellido, email, edad, nombreCompleto
    console.log(persona[propiedad]); // Carlos, Gil, cgil@gmail.com, 30, [Function: nombreCompleto]
}

console.log('cambiamos y eliminamos un error');
persona.apellido = 'Betancud'; // Cambiamos dinámicamente un valor del objeto
delete persona.apellido; // Eliminamos el error

console.log(persona); // { nombre: 'Carlos', email: 'cgil@gmail.com', edad: 30, nombreCompleto: [Function: nombreCompleto] }