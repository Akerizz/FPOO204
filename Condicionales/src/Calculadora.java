
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese un operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero no permitida");
                }
                break;
            default:
                System.out.println("Error: Operador no válido");
        }

        scanner.close();
    }
}
