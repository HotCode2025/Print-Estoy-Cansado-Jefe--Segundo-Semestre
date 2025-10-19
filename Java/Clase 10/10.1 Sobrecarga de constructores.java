package test;

import domain.Cliente;
import domain.Empleado;
import java.util.date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Raul", 57000.0);
        System.out.println("empleado1 = " + empleado1);

        Date fecha1 = new Date ();

        Cliente cliente1 = new Cliente(fecha1, true, "Laura", 'F', 32, "9 de Julio 1413");
        System.out.println("cleinte1 = "+ cliente1);

        Persona persona1 = new Persona();
    }
}



package domain;


public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar

    //Constructores
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); //Estamos llamando desde aca al constructor vacio (constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

}