// Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){ // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    }
}

console.log(persona.nombre); // Carlos
console.log(persona.apellido); // Gil
console.log(persona.email); // cgil@gmail.com
console.log(persona.edad); // 30
console.log(persona); // { nombre: 'Carlos', apellido: 'Gil', email: 'cgil@gmail.com'.
console.log(persona.nombreCompleto()); // Carlos Gil

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';
console.log(persona2.telefono); 5492618282821