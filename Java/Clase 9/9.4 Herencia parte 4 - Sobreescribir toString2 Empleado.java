package domain;

public class Empleado extends Persona { //Empleado es una clase hija de Persona, por lo tanto hereda todos sus atributos y metodos
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar

    //Constructor 1
    public Empleado(String nombre, double sueldo) {
        super(nombre); //Llamamos al constructor de la clase padre (Persona) para inicializar el atributo nombre
        this.idEmpleado = ++Empleado.contadorEmpleados; //Incrementamos el contador de empleados
        this.sueldo = sueldo;   
    }

    //Métodos getters y setters
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override //Sobrescribimos el método toString() para mostrar la información del empleado
    public String toString() {
        StringBuilder sb = new StringBuilder(); //Utilizamos StringBuilder para mejorar el rendimiento al concatenar cadenas, no utilizamos el signo + porque crea muchos objetos en memoria, ésta es una buena práctica
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString()); //Llamamos al método toString() de la clase padre (Persona) para mostrar sus atributos    
        sb.append('}');
        return sb.toString();
    }
}