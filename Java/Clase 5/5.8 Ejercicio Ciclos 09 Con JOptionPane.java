package Ciclos09;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int dia, mes, anio;

        // Pedir datos con JOptionPane
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Validar fecha suponiendo meses de 30 días
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            JOptionPane.showMessageDialog(null,
                    "La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "La fecha ingresada NO es válida.");
        }
    }
}