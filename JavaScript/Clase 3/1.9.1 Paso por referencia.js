//Paso por referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Lopez'
}
console.log(persona)
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona)