/* 
Uso de la palabra Final
Estas palabra tiene diferentes significados dependiendo deonde
se aplique: 
Variables: Evita cambiar el valor que almacena la variables.
    Metodos: Evita que se modifique la definicion de un metodo desde una 
    subclase (hija).
    Clases: Evita que se creen clases hijas.
Otra carecteristica es qeu normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estatico para convertir 
una variable en una constante, es decir que no se puede modificar su valor.
El ejemplo de esto es la clase Math en la cual todos sus atributos
son de tipo static y al final, es por esto qeu la variable pi* se conoce
como una constante.
 */
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args){
        final int miDni = 39555278;
        System.out.println("miDni = " + miDni);
        //miDni = 20321321; Nose puede modificar
        //Persona.CONSNTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSNTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); NO se puede asignar una nueva referencia
        persona1.setNombre("Cesar Fernandez");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}

// Clase Persona:

/*package domain;

public class Persona {
    public final static int CONSNTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void impreimir(){
    System.out.println("Metodo para imprimir");    
    
    }
}
*/