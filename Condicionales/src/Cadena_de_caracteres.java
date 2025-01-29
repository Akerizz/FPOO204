
import java.util.Scanner;

public class Cadena_de_caracteres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine().replace(" ", "").toLowerCase();

        String reverso = new StringBuilder(cadena).reverse().toString();

        if (cadena.equals(reverso)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }

        scanner.close();

    }
}
