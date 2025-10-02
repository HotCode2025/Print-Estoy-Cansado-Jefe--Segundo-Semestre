public class Main {
    // Atributos NO estáticos -> cada objeto tiene su copia
    String nombre;
    int edad;

    // Atributo estático -> lo comparten TODOS los objetos
    static String especie = "Humano";

    // Constructor
    public Main(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método normal (NO estático)
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Especie: " + especie);
    }

    // Método estático (pertenece a la clase, no al objeto)
    public static void cambiarEspecie(String nuevaEspecie) {
        especie = nuevaEspecie;
    }

    public static void main(String[] args) {
        // Creamos dos objetos distintos
        Main p1 = new Main("Ana", 20);
        Main p2 = new Main("Juan", 25);

        // Cada objeto tiene su propio nombre y edad
        p1.mostrarInfo();
        p2.mostrarInfo();

        // Cambiamos el atributo estático usando la CLASE
        Main.cambiarEspecie("Cyborg");

        // Ambos objetos reflejan el cambio porque COMPARTEN el atributo estático
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
