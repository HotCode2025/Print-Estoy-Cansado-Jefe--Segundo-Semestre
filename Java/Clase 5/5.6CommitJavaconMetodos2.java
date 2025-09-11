package Operaciones;

public class Aritmetica {
    int a; 
    int b;

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}