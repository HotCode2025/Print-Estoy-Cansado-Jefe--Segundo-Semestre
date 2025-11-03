
package domain;

public class Persona {
    //Atributos de herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor vacio: este es para crear  objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona(){ //Constructor 1

    }

    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre; 
    }

     public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad; 
    }

    @override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "}"
    }
}
