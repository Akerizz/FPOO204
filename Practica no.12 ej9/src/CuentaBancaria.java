import javax.swing.*;
public class CuentaBancaria {

        private int numeroCuenta;
        private String nombreCliente;
        private int saldo;
        private int edad;

        // Constructor
        public CuentaBancaria(int numeroCuenta, String nombreCliente, int edad, int saldo) {
            this.numeroCuenta = numeroCuenta;
            this.nombreCliente = nombreCliente;
            this.edad = edad;
            this.saldo = saldo;
        }

        // Getters y Setters
        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public int getSaldo() {
            return saldo;
        }

        public int getEdad() {
            return edad;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        public void consultarSaldo(int numeroCuenta) {
            if (this.numeroCuenta == numeroCuenta) {
                JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Número incorrecto.");
            }
        }

        public void retirarEfectivo(int monto) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo total: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "No tienes tanto dinero POBRE!!!!!");
            }
        }

        public void ingresarEfectivo(int monto) {
            if (monto > 0) {
                saldo += monto;
                JOptionPane.showMessageDialog(null, "Ingreso exitoso. Saldo total: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Monto no válido.");
            }
        }

        public void transferencia(CuentaBancaria destino, int numeroCuenta, int monto) {
            if (this.numeroCuenta == numeroCuenta) {
                if (monto > 0 && monto <= saldo) {
                    this.saldo -= monto;
                    destino.ingresarEfectivo(monto);
                    JOptionPane.showMessageDialog(null, "Transferencia exitosa.");
                } else {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes Cariño.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Número de cuenta incorrecto.");
            }
        }
    }

