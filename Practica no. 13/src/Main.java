//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        String menu = "1. Crear vehículo\n2. Crear conductor\n3. Asignar conductor a vehículo\n4. Crear envío\n5. Crear entrega\n6. Actualizar estado de entrega\n7. Mostrar información\n8. Salir";
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
                    vehiculo = new Vehiculo(placa, modelo, capacidad);
                    JOptionPane.showMessageDialog(null, "Vehículo creado correctamente.");
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor creado correctamente.");
                    break;
                case 3:
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un vehículo y un conductor primero.");
                    }
                    break;
                case 4:
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado correctamente.");
                    break;
                case 5:
                    if (envio != null) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                        entrega = new Entrega(numeroGuia);
                        JOptionPane.showMessageDialog(null, "Entrega registrada correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un envío primero.");
                    }
                    break;
                case 6:
                    if (entrega != null) {
                        entrega.actualizarEstado();
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar una entrega primero.");
                    }
                    break;
                case 7:
                    String info = "";
                    if (vehiculo != null) {
                        info += "Vehículo: Placa " + vehiculo.getPlaca() + ", Modelo " + vehiculo.getModelo() + ", Capacidad " + vehiculo.getCapacidadCarga() + "kg\n";
                        if (vehiculo.getConductor() != null) {
                            info += "Conductor: " + vehiculo.getConductor().getNombre() + ", ID " + vehiculo.getConductor().getIdentificacion() + "\n";
                        }
                    }
                    if (envio != null) {
                        info += "Envío: Código " + envio.getCodigoEnvio() + ", Destino " + envio.getDestino() + ", Peso " + envio.getPeso() + "kg\n";
                    }
                    if (entrega != null) {
                        info += "Entrega: Guía " + entrega.getNumeroGuia() + ", Estado " + entrega.getEstado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, info.isEmpty() ? "No hay información registrada." : info);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 8);
    }
}