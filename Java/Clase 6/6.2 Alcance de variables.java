package Operaciones;

public class Aritmetica {
    public static void main(String[] args) {
        //atributos de la clase
        int a;
        int b;

        //El constructor es un metodo especial
    public Aritmetica() { //Contructor 1 vacio
            System.out.println("Se esta ejecutando este constructor numero 1");
        }
        //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica( int a, int b){ //Contructor 2
            this.a = a;
            this.b = b;
            System.out.println("Se esta ejecutando este constructor numero 2");
        }

        //metodo
        public void sumar () {
            int resultado = a + b;
            System.out.println("resultado = " + resultado);
        }

        public int sumarConRetorno () {
            //int resultado = a + b;
            return a + b;
        }
        public int sumarConArgumentos (int a, int b){
            this.a = a;
            this.b = b;
            //return a + b;
            return this.sumarConRetorno();
        }

    }
}
