package Ciclos03;

import java.util.Scanner;
import javax.swing.JOptionPane;

 class main {
    public static void main(String[] args) {

        // Solución con la clase Scanner
        System.out.println("--- Usando la clase Scanner ---");
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());

            if (numero % 2 == 0 && numero != 0) {
                System.out.println("El número " + numero + " es par.");
            } else if (numero % 2 != 0) {
                System.out.println("El número " + numero + " es impar.");
            }
        } while (numero != 0);

        System.out.println("El programa ha finalizado.");
        System.out.println();

    }
}