/*let persona3  = new Persona('Carla', 'Ponce'); esto no se debe hacer; Persona is not defined
Se va a dar el error "Cannot access 'Persona' before initialization*/

class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona1.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);