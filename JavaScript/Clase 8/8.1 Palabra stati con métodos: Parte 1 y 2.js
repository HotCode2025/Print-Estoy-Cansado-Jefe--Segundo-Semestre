//Clase 7 Clases Parte 2
//7.3 Clase Object, toString, sobreescritura y Polimorfismo

//Abarca los videos "Clase 6 Parte 11 JavaScript" y "Clase 6 parte 12 JavaScript".

//Abrió: lunes, 22 de septiembre de 2025, 18:00

class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }    

    get nombre(){
        return this._nombre
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre+ ''+this._apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //Nos regresa un string
        //Se aplica polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
    
    static saludar(){
        console.log("Saludos desde este metodo static");
    }

    static saludar2(persona){
        console.log(persona.nombre);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }    

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+', '+this._departamento;
    }

}


let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1)

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

Persona.saludar();
Persona.saludar2(persona1);
