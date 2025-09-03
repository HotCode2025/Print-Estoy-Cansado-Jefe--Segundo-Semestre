/* Pedir numeros hasta que se teclee un 0,
mostrar la suma de todos los numeros introducidos.
*/

package Ejercicio6_Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio6_Ciclos_JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        JOptionPane.showMessageDialog(null, "Digite la cantidad de numeros que desee, presione 0 para terminar.");

        do {
            String input = JOptionPane.showInputDialog("Ingrese un numero: ");
            numero = Integer.parseInt(input);
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma entre todos los numeros ingresados es " + suma);
    }
}
