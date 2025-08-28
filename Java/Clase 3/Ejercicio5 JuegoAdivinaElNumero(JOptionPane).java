package org.example.SEGUNDO_SEMESTRE;

import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio5_clase3_ConJOptionPane {
    public static void main(String[] args) {
        Random rand = new Random();

        JOptionPane.showMessageDialog(null,
                "Bienvenido, vamos a jugar un juego!\n" +
                        "Generaré un número aleatorio del 1 al 100 y deberás adivinarlo.\n" +
                        "Tranquilo, te daré pistas en el proceso!\n" +
                        "Tu objetivo será encontrarlo en la menor cantidad de intentos posibles!");

        int numeroAEncontrar = rand.nextInt(100) + 1; 
        int numeroElegido = 0;
        int intentos = 0;

        while (numeroElegido != numeroAEncontrar) {
           
            String input = JOptionPane.showInputDialog("Ingresa un número entre 1 y 100:");

            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                return;
            }

            try {
                numeroElegido = Integer.parseInt(input); 
                intentos++;

                if (numeroElegido > numeroAEncontrar) {
                    JOptionPane.showMessageDialog(null, "El número secreto es más chico.");
                } else if (numeroElegido < numeroAEncontrar) {
                    JOptionPane.showMessageDialog(null, "El número secreto es más grande.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
            }
        }

        JOptionPane.showMessageDialog(null,
                "Felicidades, acertaste!\n" +
                        "El número era: " + numeroAEncontrar + "\n" +
                        "Lo lograste en " + intentos + " intentos.");
    }
}
