package Ciclowhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable
        }

        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        // Ciclo for con break y etiqueta
        inicio:
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break inicio; // Rompe el ciclo etiquetado como 'inicio'
            }
        }

        // Ciclo for con continue y etiqueta
        inicio2:
        for(var contando = 0; contando < 7; contando++) {
            if(contando % 2 != 0){
                continue inicio2; // Salta a la siguiente iteración del ciclo 'inicio2' Por qué 2? porque si
            }
            System.out.println("contando = " + contando);
        }
    }
}