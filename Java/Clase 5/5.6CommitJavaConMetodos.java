public class Prueba {
    public static void main(String[] args) {
        Aritmetica aritmetical = new Aritmetica();

        int resultado = aritmetical.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetical.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
    }
}
