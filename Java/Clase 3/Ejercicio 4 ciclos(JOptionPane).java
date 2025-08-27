package Ciclos04;
import javax.swing.JOptionPane;

public class Ciclos04 {
    public static void main(String[] args) {
        int contador = 0;
        
        while (true) {
            String input = JOptionPane.showInputDialog("Introduce un número (negativo para terminar):");
            int numero = Integer.parseInt(input);
            if (numero < 0) break;
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, "Total números introducidos: " + contador);
    }
}