import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de asteriscos en la base: ");
        int base = scanner.nextInt();
        scanner.close();

        int altura = base / 2 + 1;
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < base / 4; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }
}
