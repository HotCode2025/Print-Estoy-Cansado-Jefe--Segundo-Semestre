// Paso por referencia
package pasoPorReferencia

Public class PasoPorReferencia {
    public static void main(string[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "ester";   
        System.out.println("persona1 =" + persona1.nombre);
        cambiarValor(persona1)
        System.out.println("el cambio que hicimos en el nombre es: "+persona1);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Maria";
    }
}