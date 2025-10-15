public class TestOperaciones {

    public static void main(String[] args) {

        // Llamada al método sumar(int, int)
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);

        // Llamada al método sumar(double, double).
        // El 7 se convierte implícitamente a 7.0 (double).
        var resultado2 = Operaciones.sumar(5.0, 7); 
        System.out.println("resultado2 = " + resultado2);

        // Llamada al método sumar(double, double).
        // El 8 (int) se convierte a 8.0 (double) y 6L (long) se convierte a 6.0 (double)
        // ya que el método sumar(int, int) no puede manejar directamente un 'long' 
        // y el método sumar(double, double) es la coincidencia más cercana (promoción).
        var resultado3 = Operaciones.sumar(8, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}