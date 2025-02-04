import java.util.Scanner;

//Programa que usando bucles nos permita pedir un numero par comprendido entre 200 y 400y nos muestrre
//todos los numeros pares
public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;


        do {
            System.out.print("Ingresa un numero par entre 200 y 400: ");
            numero = scanner.nextInt();
        } while (numero < 200 || numero > 400 || numero % 2 != 0);


        System.out.println("Numeros pares desde 200 hasta " + numero + ":");
        for (int i = 200; i <= numero; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
