import javax.swing.JOptionPane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = null;
        Empleado empleado2 = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog("Menú:\n1. Agregar Conductor\n2. Agregar Administrativo\n3. Listar Empleados\n4. Salir");

            if (opcion == null || opcion.equals("4")) {
                break;
            }

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Nombre del Conductor:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
                    String licencia = JOptionPane.showInputDialog("Licencia:");
                    empleado1 = new Conductor(nombre, id, salario, licencia);
                    break;
                case "2":
                    nombre = JOptionPane.showInputDialog("Nombre del Administrativo:");
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
                    String departamento = JOptionPane.showInputDialog("Departamento:");
                    empleado2 = new Administrativo(nombre, id, salario, departamento);
                    break;
                case "3":
                    if (empleado1 != null) {
                        empleado1.mostrarInfo();
                    }
                    if (empleado2 != null) {
                        empleado2.mostrarInfo();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
