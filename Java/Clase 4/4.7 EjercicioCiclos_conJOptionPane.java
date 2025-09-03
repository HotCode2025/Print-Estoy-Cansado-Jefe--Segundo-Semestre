package org.example.SEGUNDO_SEMESTRE.Clase4;

import javax.swing.JOptionPane;

public class EjercicioConCiclos7JOptionPane {
    public static void main(String[] args) {
        int numeroIngresado;
        int cantidadDeIngresados = 0;
        int suma = 0;

        do {
            // Pedir número al usuario
            numeroIngresado = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Ingrese un número (si es negativo finalizará el ciclo):")
            );

            if (numeroIngresado > 0) {
                JOptionPane.showMessageDialog(null, "Usted ingresó: " + numeroIngresado);
                cantidadDeIngresados++;
                suma += numeroIngresado;
            }

        } while (numeroIngresado > 0);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Dado que ingresó un número negativo finalizó el ciclo.");
        JOptionPane.showMessageDialog(null, "Cantidad de números ingresados: " + cantidadDeIngresados);

        if (cantidadDeIngresados > 0) {
            double promedio = (double) suma / cantidadDeIngresados;
            JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números positivos, no se puede calcular.");
        }
    }
}