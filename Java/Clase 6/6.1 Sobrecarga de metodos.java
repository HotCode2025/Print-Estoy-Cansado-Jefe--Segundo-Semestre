package Operaciones;

public class Aritmeticoa {
    //atributos de la clase
    int a;
    int b;

    //El constructor es un metodo especial
    public Aritmetica() { //Contructor 1
        System.out.println("Se esta ejecutando este constructor numero 1");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b) { //Contructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero 2");
    }

    //metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        //int resultado = a + b;
        return a + b;
    }

}
