package caja;
import java.util.Scanner;

// Proyecto caja:
//Ejercicio 1: Crear un proyecto según las especificaciones mostradas a continuación.
//La formula es: volumen = ancho * alto * profundidad
public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja = new Caja();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Método con constructor vacío: ");
        System.out.println("Bienvenido, esta es una calculadora de volumen, a continuación deberás ingresar los datos solicitados para realizar la formula: ");

        //Con constructor vacío:
        System.out.println("Ingrese el ancho: ");
        caja.ancho=scanner.nextInt();

        System.out.println("Ingrese el alto: ");
        caja.alto=scanner.nextInt();

        System.out.println("Ingrese la profundidad: ");
        caja.profundidad=scanner.nextInt();

        System.out.println("El volumen es: "+caja.calcularVolumen());


        //Constructor con argumentos:
        System.out.println("Método con constructor con argumentos: ");
        System.out.println("Ingrese el ancho: ");
        int ancho = scanner.nextInt();
        System.out.println("Ingrese el alto: ");
        int alto = scanner.nextInt();
        System.out.println("Ingrese la profundidad: ");
        int profundidad = scanner.nextInt();

        Caja cajaConArgumentos = new Caja(ancho,alto,profundidad);
        System.out.println("Volumen con constructor con argumentos: "+cajaConArgumentos.calcularVolumen());

    }
}