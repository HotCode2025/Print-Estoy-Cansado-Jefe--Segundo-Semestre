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

Versión con JOptionPane

package Ciclos08;

import javax.swing.JOptionPane;

public class Ciclos08 {
    public static void main(String[] args) {
        // Pedir número al usuario
        String input = JOptionPane.showInputDialog("Ingresa un número N:");
        int N = Integer.parseInt(input);

        // Construir el resultado
        StringBuilder resultado = new StringBuilder("Números del 1 al " + N + ":\n");
        for (int i = 1; i <= N; i++) {
            resultado.append(i).append(" ");
        }

        // Mostrar resultado en ventana
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
