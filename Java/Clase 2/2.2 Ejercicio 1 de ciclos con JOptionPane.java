/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un numero negativo
*/
package Ciclos;

import javax.swing.JOptionPane;

public class EjercicioCiclosJOptionPane {
    public static void main(String[] args) {
        int num, cuadrado;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(num >= 0) {
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El numero "+num+" elevado al cuadrado es: "+cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        System.out.print("El programa a finalizado por numero negativo");
    }
}
