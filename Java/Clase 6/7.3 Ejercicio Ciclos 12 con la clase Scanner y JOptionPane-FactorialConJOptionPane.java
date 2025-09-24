import javax.swing.JOptionPane;

public class FactorialConJOptionPane {

    public static void main(String[] args) {
        // Pedimos al usuario que ingrese un número usando una ventana emergente
        // La entrada se lee como un String, por lo que debemos convertirla a un int
        String input = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:");

        // Manejamos el caso en que el usuario no ingrese nada o presione Cancelar
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó ningún número. Saliendo del programa.");
            return; // Terminamos la ejecución del programa
        }

        // Convertimos el String a un entero
        int numero = Integer.parseInt(input);

        // Verificamos si el número es negativo
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            // Calculamos el factorial
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            // Mostramos el resultado en una ventana emergente
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
        }
    }
}