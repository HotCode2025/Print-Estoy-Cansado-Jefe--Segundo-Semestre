package domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar

    //Constructor
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.Empleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado (){
        return this.IdEmpleado;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void getSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        StringBuilder ab = new StringBuilder();
        ab.append("Empleado(idEmpleado=").append(idEmpleado);
        ab.append(", sueldos=").append(sueldo);
        ab.append(")");
        return ab.toString();
    }
}

