public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57_000, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());

        // Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");

        // persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar (atributo privado)
        // System.out.println("Nombre es: " + persona1.nombre); // Error

        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

        // Tarea: Crear otro objeto de tipo Persona
        Persona persona2 = new Persona("Emir", 62_000, true);

        // Imprimir valores iniciales
        System.out.println("\npersona2 valores iniciales:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Eliminado: " + persona2.isEliminado());

        // Modificar valores
        persona2.setNombre("Marcos");
        persona2.setSueldo(70_000);
        persona2.setEliminado(false);

        // Imprimir valores modificados
        System.out.println("\npersona2 valores modificados:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Eliminado: " + persona2.isEliminado());
    }
}

// Clase Persona
class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}