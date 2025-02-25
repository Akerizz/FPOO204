import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1906, "Eliza Mondragon", 20, 500);
        CuentaBancaria cuenta2 = new CuentaBancaria(0212, "Samuel Deluque", 25, 300);

        String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Transferencia", "Salir"};

        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "BancoSalasar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == 4 || opcion == -1) break;

            switch (opcion) {
                case 0 -> {
                    int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de cuenta:"));
                    cuenta1.consultarSaldo(numCuenta);
                }
                case 1 -> {
                    int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto:"));
                    cuenta1.ingresarEfectivo(ingreso);
                }
                case 2 -> {
                    int retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto que vas a retirar:"));
                    cuenta1.retirarEfectivo(retiro);
                }
                case 3 -> {
                    int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto a transferir:"));
                    cuenta1.transferencia(cuenta2, 1906, monto);
                }
            }
        }
    }
}
