import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int altura = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}



