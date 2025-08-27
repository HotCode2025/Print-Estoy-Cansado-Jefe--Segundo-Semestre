package Ciclos04;
import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        System.out.println("Introduce números (negativo para terminar):");
        
        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero < 0) break;
            contador++;
        }
        
        System.out.println("Total números introducidos: " + contador);
    }
}