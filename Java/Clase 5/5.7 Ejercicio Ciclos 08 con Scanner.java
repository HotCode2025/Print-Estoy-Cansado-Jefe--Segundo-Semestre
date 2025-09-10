// Ejercicio 8: Pedir un numero N, y mostrar todos los numeros
del 1 al N.

Version con Scanner 

package Ciclos08;

import java.util.Scanner;

public class Ciclos08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = entrada.nextInt();

        System.out.println("Números del 1 al " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}