import java.sql.SQLOutput;
import java.util.Scanner;
//Programa que solicite una palabra y la descomponga en letras separadas
public class Ejercicio_1 {
        public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa una palabra: ");
                String palabra = scanner.nextLine();


                System.out.println("Letras separadas:");
                for (int i = 0; i < palabra.length(); i++) {
                    System.out.println(palabra.charAt(i));
                }

                scanner.close();

        }

}

