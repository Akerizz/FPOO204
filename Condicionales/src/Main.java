
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1

        String contrasenaCo = "190212";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contrasenaI = scanner.nextLine();

        if (contrasenaCo.equalsIgnoreCase(contrasenaI)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        scanner.close();
    }
}