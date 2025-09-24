package caja;

import javax.swing.JOptionPane;

public class PruebaCajaJOptionPane {
    public static void main(String[] args) {
        // Con constructor vacío
        Caja caja1 = new Caja();
        JOptionPane.showMessageDialog(null,"Esta prueba será con constructor vacío...");
        int ancho1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho :"));
        int alto1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto :"));
        int profundidad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad :"));

        caja1.ancho = ancho1;
        caja1.alto = alto1;
        caja1.profundidad = profundidad1;

        JOptionPane.showMessageDialog(null,
                "Volumen con constructor vacío: " + caja1.calcularVolumen());

        // Constructor con argumentos
        JOptionPane.showMessageDialog(null,"Esta prueba será con constructor con argumentos...");
        int ancho2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho (constructor con argumentos):"));
        int alto2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto (constructor con argumentos):"));
        int profundidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad (constructor con argumentos):"));

        Caja caja2 = new Caja(ancho2, alto2, profundidad2);

        JOptionPane.showMessageDialog(null, "Volumen con constructor con argumentos: " + caja2.calcularVolumen());
    }
}