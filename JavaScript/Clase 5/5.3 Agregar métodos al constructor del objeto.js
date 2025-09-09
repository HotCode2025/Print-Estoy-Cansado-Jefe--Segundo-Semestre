// Clase sobre Constructores

function Persona3(nombre, apellido, email){ //CONSTRUCTOR
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
console.log(padre);

// Ahora usamos el mismo constructor pero para otra persona

let hijo = new Persona3('Juan', 'Lopez', 'jlopez@gmail.com');

// Probamos la nueva funcion
console.log(padre.nombreCompleto()); // Aca muestra el nombre completo del padre
console.log(hijo.nombreCompleto()); // Ambas personas pueden usar la funcion nombreCompleto