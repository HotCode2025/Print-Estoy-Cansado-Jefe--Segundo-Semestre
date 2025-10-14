package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ramiro", 350000.0);
        System.out.println("e1: " + e1);

        Date fecha1 = new Date();

        Cliente c1 = new Cliente(fecha1, true, "Ana", 'F', 28, "9 de Julio 1413");
        System.out.println("c1: " + c1);
    }
}