
import java.util.Scanner;

public class Sala_de_juegos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 4) {
            System.out.println("Entrada gratuita");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("El costo de la entrada es de $110");
        } else {
            System.out.println("El costo de la entrada es de $190");
        }

        scanner.close();

    }
}
