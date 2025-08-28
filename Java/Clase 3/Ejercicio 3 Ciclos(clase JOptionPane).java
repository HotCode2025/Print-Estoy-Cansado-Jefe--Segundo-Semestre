package Ciclos03;

import java.util.Scanner;
import javax.swing.JOptionPane;

 class main {
    public static void main(String[] args) {
        // Solución con la clase JOptionPane
        System.out.println("--- Usando la clase JOptionPane ---");
        int numero2;

        do {
            String input = JOptionPane.showInputDialog("Digite un número:");
            numero2 = Integer.parseInt(input);

            if (numero2 % 2 == 0 && numero2 != 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero2 + " es par.");
            } else if (numero2 % 2 != 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero2 + " es impar.");
            }
        } while (numero2 != 0);

        JOptionPane.showMessageDialog(null, "El programa ha finalizado.");
            }
}