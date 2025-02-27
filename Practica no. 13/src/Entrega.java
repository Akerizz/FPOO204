import javax.swing.JOptionPane;
public class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");

        if (nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Intente nuevamente.");
        }
    }
}