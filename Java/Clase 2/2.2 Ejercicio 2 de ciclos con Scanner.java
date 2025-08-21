package Ciclos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero > 0){
                System.out.print("El numero "+numero+" es Positivo");
            }
            else{
                System.out.print("El numero "+numero+" es Negativo");
            }
            System.out.print("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.print("El numero "+numero+" finaliza el programa");
    }
}
