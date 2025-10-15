import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        long producto = 1; 
      
        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            producto *= i;
        }
      
        System.out.println("El producto de los 10 primeros números impares es: " + producto);
      
        sc.close();
    }
}
