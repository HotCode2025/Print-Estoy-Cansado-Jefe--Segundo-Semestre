// ========== TIPOS PRIMITIVOS ==========
console.log('\n=== TIPOS PRIMITIVOS ===');
let x = 10; // variable de tipo primitiva
console.log(x.length); // undefined
console.log('Tipos primitivos'); // Tipos primitivos

// ========== OBJETO LITERAL ==========
console.log('\n=== OBJETO LITERAL ===');
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    idioma: 'es', // Modificado a minúsculas para probar getter/setter
    get lang(){
        return this.idioma.toUpperCase(); // GET: convierte minúsculas a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase(); // SET: asigna y convierte a mayúsculas
    },
    nombreComplete: function(){ // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    },
    get nombreEdad(){ // GET: retorna nombre y edad
        return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
    },
    // Método de registro adicional
    registro: function() {
        return 'Usuario: ' + this.nombreComplete() + ' | Email: ' + this.email + ' | Edad: ' + this.edad;
    }
}

// Acceso a propiedades
console.log('=== ACCESO A PROPIEDADES ===');
console.log(persona.nombre); // Carlos
console.log(persona.apellido); // Gil
console.log(persona.email); // cgil@gmail.com
console.log(persona.edad); // 30
console.log(persona); // objeto completo
console.log(persona.nombreComplete()); // Carlos Gil
console.log('Ejecutando con un objeto'); // Ejecutando con un objeto

// Probando getter y setter de idioma
console.log('\n=== GETTER Y SETTER ===');
console.log('Comenzamos con el método get y set para idiomas');
console.log('Idioma actual:', persona.idioma); // es
console.log('Getter lang:', persona.lang); // ES
persona.lang = 'en'; // Usando setter
console.log('Idioma después de setter:', persona.idioma); // EN
console.log(persona.lang); // EN

// Crear nuevo objeto
console.log('\n=== CREACIÓN DE NUEVO OBJETO ===');
let persona2 = new Object(); // Crea nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';
console.log('Teléfono persona2:', persona2.telefono); // 5492618282821
console.log('Creamos un nuevo objeto'); // Creamos un nuevo objeto

// Acceso como arreglo
console.log('\n=== ACCESO COMO ARREGLO ===');
console.log(persona['apellido']); // Gil

// Uso del ciclo for in
console.log('\n=== CICLO FOR IN ===');
console.log('Usamos el ciclo for in');
for(propiedad in persona){
    console.log('Propiedad:', propiedad); // nombre de cada propiedad
    console.log('Valor:', persona[propiedad]); // valor de cada propiedad
}

// Distintas formas de imprimir un objeto
console.log('\n=== FORMAS DE IMPRIMIR OBJETO ===');
// Forma 1: concatenar cada valor
console.log('Distintas formas de imprimir un objeto: forma 1'); 
console.log(persona.nombre + ', ' + persona.apellido); // Carlos, Gil

// Forma 2: ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2'); 
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]); 
}

// Forma 3: función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3'); 
let personaArray = Object.values(persona);
console.log('Array de valores:', personaArray);

// Forma 4: método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4'); 
let personaString = JSON.stringify(persona);
console.log('JSON string:', personaString);

// Uso de getters y método de registro
console.log('\n=== GETTERS Y REGISTRO ===');
console.log(persona.nombreEdad); // El nombre es: Carlos, Edad: 30
console.log('Idioma con getter:', persona.lang); // EN
console.log('Registro completo:', persona.registro()); // Usuario: Carlos Gil | Email: cgil@gmail.com | Edad: 30

// ========== CONSTRUCTOR DE OBJETOS ==========
console.log('\n=== CONSTRUCTOR DE OBJETOS ===');
function Persona3(nombre, apellido, email){ // Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreComplete = function(){
        return this.nombre + ' ' + this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'lopez1@gmail.com'); 
padre.nombre = 'Luis'; // Modificamos el nombre
console.log('Objeto padre:', padre); // Persona3 { nombre: 'Luis', apellido: 'Lopez', email: 'lopez1@gmail.com'}
console.log(padre.nombreComplete()); // Utilizamos la función: Luis Lopez

let madre = new Persona3('Laura', 'Contrera', 'contrera1@gmail.com');
console.log('Objeto madre:', madre); // Persona3 { nombre: 'Laura', apellido: 'Contrera', email: 'contrera1@gmail.com'}
console.log(madre.nombreComplete()); // Laura Contrera

// ========== USO DE PROTOTYPE ==========
console.log('\n=== USO DE PROTOTYPE ===');
Persona3.prototype.telefono = '549261638332';

let madre2 = new Persona3('Luis', 'Lopez', 'lopezl@gmail.com');
console.log(madre2.telefono); // 549261638332

madre2.telefono = '261638332';
console.log(madre2.telefono); // 261638332

// ========== USO DE CALL Y APPLY ==========
console.log('\n=== USO DE CALL Y APPLY ===');

let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ' ' + telefono;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '5492618383834')); // Lic.: Juan Perez 5492618383834
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5492618585856')); // Ing.: Carlos Lara 5492618585856

// Método Apply
let arreglo = ['Ing.', '5492618686865'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo)); // Ing.: Carlos Lara 5492618686865