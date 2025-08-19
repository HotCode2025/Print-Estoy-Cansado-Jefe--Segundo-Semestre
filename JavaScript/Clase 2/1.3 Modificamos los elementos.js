//let autos = new Array ("Ferrari", "Renault". "BMW")
const autos = [ "Ferrari", "Renault", "BMW" ]
console.log(autos);

console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i]);
}

// Codigo para modificar los elementos 
// de nuestro array

autos[1] = "Volvo";
console.log(autos[1]);

// Agregamos valores nuevo al array
autos.push("Audi"); // Con push agregamos el elemento al final del array
console.log(autos);

// Segunda manera de agregar elementos al array
autos[autos.length] = "Porsche";
console.log(autos);

// Tercera manera de agregar elementos al array
autos[6] = "Renault";
console.log(autos);
