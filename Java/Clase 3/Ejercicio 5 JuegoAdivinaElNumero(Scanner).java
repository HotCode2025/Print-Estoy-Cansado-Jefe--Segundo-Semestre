package org.example.SEGUNDO_SEMESTRE;

import java.util.Scanner;

public class Ejercicio5_clase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, vamos a jugar un juego!");
        System.out.println("A continuación generaré un número aleatorio del 1 al 100 y deberás adivinar cuál es.");
        System.out.println("Tranquilo, te daré pistas en el proceso para ayudarte a encontrarlo!");
        System.out.println("Tu objetivo será encontrar el número en la mínima cantidad de intentos posibles!");

        int numeroAEncontrar = (int) (Math.random() * 100) + 1; // +1 para que vaya de 1 a 100
        int numeroElegido = 0; // Inicializamos antes del bucle
        int intentos = 0;      // Contador de intentos

        // Bucle hasta acertar
        while (numeroElegido != numeroAEncontrar) {
            System.out.print("Ingresa un número entre 1 y 100: ");
            numeroElegido = scanner.nextInt();
            intentos++;

            if (numeroElegido > numeroAEncontrar) {
                System.out.println("El número es más chico.");
            } else if (numeroElegido < numeroAEncontrar) {
                System.out.println("El número es más grande.");
            }
        }

        System.out.println("Felicidades, acertaste!");
        System.out.println("El número era: " + numeroAEncontrar);
        System.out.println("Lo lograste en " + intentos + " intentos.");

        scanner.close();
    }
}