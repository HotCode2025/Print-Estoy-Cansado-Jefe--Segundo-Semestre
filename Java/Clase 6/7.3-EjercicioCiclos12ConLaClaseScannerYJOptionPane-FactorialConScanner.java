import java.util.Scanner;

public class FactorialConScanner {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = entrada.nextInt();

        // Verificamos si el número es negativo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; // Usamos long para evitar desbordamiento con números grandes
            // Calculamos el factorial
            for (int i = 1; i <= numero; i++) {
                factorial *= i; // Es lo mismo que: factorial = factorial * i;
            }
            // Mostramos el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        // Cerramos el objeto Scanner
        entrada.close();
    }
}