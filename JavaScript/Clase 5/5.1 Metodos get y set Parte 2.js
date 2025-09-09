// Ahora aplicaremos el metodo set

let persona = {
    nombre: 'Juan',
    apellido: 'Martinez',
    email: 'jmartinez@gmail.com',
    edad : 20,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){ // ACA USAMOS EL METODO SET PARA CAMBIAR EL VALOR DE idioma
        this.idioma = lang.toUpperCase();
    }
}

console.log(persona.lang); // Muestra ES