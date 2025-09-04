package Clases;

public class CreacionDeUnObjeto {

    public static void main(String args[]) {
        Persona persona1;
        persona1 = new Persona();// Llamamos al constructor
        persona1.nombre = "Ariel";
        persona1.apellido = "Betancud";
        persona1.obtenerInformacion();
    }
}
