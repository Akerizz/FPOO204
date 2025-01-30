import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero y positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + (i > 0 ? ", " : ""));

        }
    }
}

