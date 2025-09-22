package aritmetica;
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
        
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno (){
        //int resultado = a + b;
        return a + b;
    }
}
