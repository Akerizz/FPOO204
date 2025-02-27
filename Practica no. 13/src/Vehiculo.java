import javax.swing.JOptionPane;
class Vehiculo {
        private String placa;
        private String modelo;
        private double capacidadCarga;
        private Conductor conductor;

        public Vehiculo(String placa, String modelo, double capacidadCarga) {
            this.placa = placa;
            this.modelo = modelo;
            this.capacidadCarga = capacidadCarga;
            this.conductor = null;
        }

        public String getPlaca() {
            return placa;
        }

        public String getModelo() {
            return modelo;
        }

        public double getCapacidadCarga() {
            return capacidadCarga;
        }

        public Conductor getConductor() {
            return conductor;
        }

        public void asignarConductor(Conductor conductor) {
            if (this.conductor == null) {
                this.conductor = conductor;
                JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El vehículo ya tiene un conductor asignado.");
            }
        }
    }