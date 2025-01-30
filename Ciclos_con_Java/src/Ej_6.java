import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        while (true) {
            System.out.print("Ingrese operación (D deposito / R retiro)Enter para salir: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) break;

            String[] partes = entrada.split(" ");

            if (partes.length != 2) {
                System.out.println("Formato incorrecto. Use 'D cantidad' o 'R cantidad'.");
                continue;
            }

            char tipo = partes[0].charAt(0);
            int cantidad;

            try {
                cantidad = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                System.out.println("Cantidad no valida");
                continue;
            }

            if (tipo == 'D') {
                saldo += cantidad;
            } else if (tipo == 'R') {
                if (cantidad > saldo) {
                    System.out.println("Tus fondos son Dinsuficientes.");
                } else {
                    saldo -= cantidad;
                }
            } else {
                System.out.println("Operación no válida. Use 'D' para depositar o 'R' para retirar.");
            }
        }

        System.out.println("Saldo final: " + saldo + " pesos.");
        scanner.close();


    }
}
