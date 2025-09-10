package Ciclos09;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;

        // Pedir datos al usuario
        System.out.print("Ingrese el día: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el mes: ");
        mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();

        // Validar fecha suponiendo meses de 30 días
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
        } else {
            System.out.println("La fecha ingresada NO es válida.");
        }

        sc.close();
    }
}
