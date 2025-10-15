package operaciones;

public class Operaciones {

    // Método para sumar dos enteros
    public static int sumar(int a, int b) {
        System.out.println("Método para sumar enteros");
        return a + b;
    }

    // Método para sumar dos doubles (sobrecargado)
    public static double sumar(double a, double b) {
        System.out.println("Método para sumar double");
        return a + b;
    }

}