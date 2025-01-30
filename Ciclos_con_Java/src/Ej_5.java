import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);
        scanner.close();

        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");

    }
}
