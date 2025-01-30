//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero y positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + (i < numero - 1 ? ", " : ""));

        }
    }
}