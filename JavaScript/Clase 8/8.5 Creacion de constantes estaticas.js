class Persona {
    static contadorPersonas = 0;
    email = 'Valor default email';

    static get MAX_OBJ(){
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        } else {
            console.log("Se ha superado el máximo de objetos permitidos");
        }
    }

    get nombre(){ return this._nombre; }
    set nombre(nombre){ this._nombre = nombre; }

    get apellido(){ return this._apellido; }
    set apellido(apellido){ this._apellido = apellido; }

    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }

    toString(){
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Saludos desde método static");
    }

    static saludar2(persona){
        console.log(persona._nombre + " " + persona._apellido);
    }
}

class Empleado extends Persona {
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){ return this._departamento; }
    set departamento(departamento){ this._departamento = departamento; }

    nombreCompleto(){
        return super.nombreCompleto()+', '+this._departamento;
    }
}