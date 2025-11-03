
package ar.com.codesystem;
    
public class Utileria {
    public static void imprimir(String s){
        System.out.println("s = "+ s);
    }

   
}

package test;

//import ar.com.codesystem.Utileria.*;
import ar.com.codesystem.Utileria;
//import static ar.com.codesystem.Utileria.imprimir; // Solo aplica para métodos estáticos

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos");
        //imprimir("Terminamos en unos minutos");
        //ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando");//Asi no se deber
    }
    
}