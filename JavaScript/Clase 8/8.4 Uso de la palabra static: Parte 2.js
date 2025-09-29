//Clase 8
//Parte 1 Ejercicio 8.4


class Persona{ //Clase padre

    static contadorPersonas = 0;
    email = 'Valor default email';

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
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
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //Nos regresa un string
        //Se aplica polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
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

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(personal);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No puede acceder desde la clase
console.log(persona1.toString);
console.log(persona2.toString);
console.log(empleado1.toString);
console.log(Persona.contadorPersonas);


//Creamos una nueva persona y verificamos que está funcionando todo bien

let persona3 = new Persona('Vito', 'Scaletta');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);