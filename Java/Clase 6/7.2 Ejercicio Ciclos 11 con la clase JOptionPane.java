import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        long producto = 1; // usamos long para evitar una sobrecarga

        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            producto *= i;
        }

        JOptionPane.showMessageDialog(null,
                "El producto de los 10 primeros números impares es: " + producto);
    }
}