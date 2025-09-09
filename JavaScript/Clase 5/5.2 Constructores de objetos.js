// Clase sobre Constructores

function Persona3(nombre, apellido, email){ //CONSTRUCTOR
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
}

let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
console.log(padre);

// Ahora usamos el mismo constructor pero para otra persona

let hijo = new Persona3('Juan', 'Lopez', 'jlopez@gmail.com');