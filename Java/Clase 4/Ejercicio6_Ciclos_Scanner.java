package Ejercicio6_Ciclos;

import java.util.Scanner;

public class Ejercicio6_Ciclos_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Digite la cantidad de numeros que desee, presione 0 para terminar.");
        do {
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma entre todos los numeros ingresados es " + suma);

        entrada.close();
    }
}
