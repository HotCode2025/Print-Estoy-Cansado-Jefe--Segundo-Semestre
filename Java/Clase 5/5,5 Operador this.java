package Operaciones;

public class PruebaAritmetica {
    Aritmetica aritmetical = new Aritmetica();
    aritmetical.a = 3;
    aritmetical.b = 7;
    aritmetical.sumarNumeros();

    int resultado = aritmetical.sumarConRetorno();
    System.out.println("El resultado es: " + resultado);

    resultado = aritmetical.sumarConArgumentos();
    System.out.println("El resultado usando argumentos es: " + resultado);
}
