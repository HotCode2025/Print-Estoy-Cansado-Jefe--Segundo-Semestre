package ciclos10;

import javax.swing.JOptionPane;

public class Ciclos10 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Ingresa el número " + i + ":");
            int numero = Integer.parseInt(input);
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}
