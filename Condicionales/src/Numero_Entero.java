import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Numero_Entero {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero entero: ");
    int numero = scanner.nextInt();

        if(numero %2==0)

    {
        System.out.println("El numero si es par");
    } else

    {
        System.out.println("El nuemro es impar");
    }

        scanner.close();
}
}
