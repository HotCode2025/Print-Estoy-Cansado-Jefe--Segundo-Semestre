// Metodo get

let persona = {
    nombre: 'Juan',
    apellido: 'Martinez',
    email: 'jmartinez@gmail.com',
    edad : 20,
     nombreCompleto: function(){
        return this.nombre=' '+this.apellido;
     },
     get nombreEdad(){ // ACA APLICAMOS EL METODO GET PARA OBTENER EL NOMBRE Y LA EDAD
         return 'El nombre es: '+this.nombre+', edad: '+this.edad;
     }
}

console.log(persona.nombreEdad); // Muestra 'El nombre es: Juan, edad: 20'