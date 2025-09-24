package PasoPorValor;

public class PasoPorValor {
    public static void main(string[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //solo le enviamos una copia
        System.out.println("valorX =" + valorX);
        
    }

    public static void cambioValor(int arg1) {
        system.out.println("arg1 =" + arg1);
        arg1 = 15;
    }
}