package test;
import domain.persona;

public class TestArreglosObject {
    public static void main(String[] args){
        Persona personas[] = new Persona[2];
        personas[0] = new Persona('Ariel');
        personas[1] = new Persona('Osvaldo');
        System.out.println("Personas 0 = "+ personas[0]);
        System.out.println("Personas 1 = "+ personas[1]);
    }
}