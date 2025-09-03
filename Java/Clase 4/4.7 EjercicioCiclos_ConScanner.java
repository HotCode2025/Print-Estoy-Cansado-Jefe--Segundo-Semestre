package org.example.SEGUNDO_SEMESTRE.Clase4;
import java.util.Scanner;
//CON LA CLASE SCANNER
// PEDIR NÚMEROS HASTA QUE SE INTRODUZCA UNO NEGATIVO Y CALCULAR LA MEDIA
public class EjercicioConCiclos7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        int cantidadDeIngresados = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un número, si el número es negativo finalizará el ciclo.");
            numeroIngresado = scanner.nextInt();
            if (numeroIngresado > 0) {
                System.out.println("Usted ingresó: " + numeroIngresado);
                cantidadDeIngresados++;
                suma += numeroIngresado;
            }
        } while (numeroIngresado > 0);
        System.out.println("Dado que ingresó un número negativo finalizó el ciclo.");
        System.out.println("Cantidad de números ingresados: " + cantidadDeIngresados);
        if (cantidadDeIngresados > 0) {
            double promedio = (double) suma / cantidadDeIngresados;
            System.out.println("El promedio de los números ingresados es:" + promedio);
        } else {
            System.out.println("No se ingresaro números positivos, no se puede calcular.");
        }

    }

}