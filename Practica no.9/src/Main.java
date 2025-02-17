import javax.swing.*;

class CuentaBancaria {
    private int NumeroCuenta;
    private String NombreCliente;
    private int Saldo;
    private int Edad;

    public CuentaBancaria(int NumeroCuenta, String NombreCliente, int Edad, int Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.NombreCliente = NombreCliente;
        this.Edad = Edad;
        this.Saldo = Saldo;
    }

    public float ConsultarSaldo(int NumeroCuenta) {
        if (this.NumeroCuenta == NumeroCuenta) {
            JOptionPane.showMessageDialog(null, "Saldo actual: $" + Saldo);
            return Saldo;
        }
        JOptionPane.showMessageDialog(null, "Numero incorrecto.");
        return -1;
    }

    public void RetirarEfectivo(int Monto) {
        if (Monto > 0 && Monto <= Saldo) {
            Saldo -= Monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo total: $" + Saldo);
        } else {
            JOptionPane.showMessageDialog(null, "No tienes tanto dinero POBRE!!!!!");
        }
    }

    public float IngresarEfectivo(int Monto) {
        if (Monto > 0) {
            Saldo += Monto;
            JOptionPane.showMessageDialog(null, "Ingreso exitoso. Saldo total: $" + Saldo);
            return Saldo;
        }
        JOptionPane.showMessageDialog(null, "Monto no valido.");
        return -1;
    }

    public String Transferencia(CuentaBancaria Destino, int NumeroCuenta, int Monto) {
        if (this.NumeroCuenta == NumeroCuenta) {
            if (Monto > 0 && Monto <= Saldo) {
                this.Saldo -= Monto;
                Destino.IngresarEfectivo(Monto);
                JOptionPane.showMessageDialog(null, "Transferencia exitosa.");
                return "Transferencia realizada con exito.";
            }
            JOptionPane.showMessageDialog(null, "Fondos insuficientes Cariño.");
            return "Error en la transferencia.";
        }
        JOptionPane.showMessageDialog(null, "Numero de cuenta incorrecto.");
        return "Error en la transferencia.";
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1906, "Eliza Mondragon", 20, 500);
        CuentaBancaria cuenta2 = new CuentaBancaria(0212, "Samuel Deluque", 25, 300);

        String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Transferencia", "Salir"};

        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "BancoSalasar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == 4 || opcion == -1) break;

            switch (opcion) {
                case 0 -> {
                    int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuenta:"));
                    cuenta1.ConsultarSaldo(numCuenta);
                }
                case 1 -> {
                    int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto:"));
                    cuenta1.IngresarEfectivo(ingreso);
                }
                case 2 -> {
                    int retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto que bas retirar:"));
                    cuenta1.RetirarEfectivo(retiro);
                }
                case 3 -> {
                    int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa monto a transferir:"));
                    cuenta1.Transferencia(cuenta2, 1906, monto);
                }
            }
        }
    }
}
