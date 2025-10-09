//Prueba del codigo
package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException; // Necesario para manejar el error de la conversión

public class TestHerencia {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Ariel", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
            Date fechaCliente = formato.parse("15/09/2025"); 
            Cliente cliente1 = new Cliente(fechaCliente, true, "Fabio");// Esto llama al constructor: Cliente(Date fechaRegistro, boolean vip, String nombre)
            System.out.println("cliente1 = " + cliente1);

        } catch (ParseException e) {
            // Maneja el error si la cadena de fecha no coincide con el formato ("dd/MM/yyyy")
            System.out.println("ERROR: No se pudo convertir la fecha. Verifique el formato.");
        }
    }
}