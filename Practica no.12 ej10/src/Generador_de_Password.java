import java.util.Random;
public class Generador_de_Password {

        private int numeroCaracteres;
        private boolean aceptarMayusculas;
        private boolean aceptarCaracteresEspeciales;
//Constructor
        public Generador_de_Password(int numeroCaracteres, boolean aceptarMayusculas, boolean aceptarCaracteresEspeciales) {
            this.numeroCaracteres = numeroCaracteres;
            this.aceptarMayusculas = aceptarMayusculas;
            this.aceptarCaracteresEspeciales = aceptarCaracteresEspeciales;
        }
//GETS y SETS
        public int getNumeroCaracteres() {
            return numeroCaracteres;
        }

        public void setNumeroCaracteres(int numeroCaracteres) {
            this.numeroCaracteres = numeroCaracteres;
        }

        public boolean isAceptarMayusculas() {
            return aceptarMayusculas;
        }

        public void setAceptarMayusculas(boolean aceptarMayusculas) {
            this.aceptarMayusculas = aceptarMayusculas;
        }

        public boolean isAceptarCaracteresEspeciales() {
            return aceptarCaracteresEspeciales;
        }

        public void setAceptarCaracteresEspeciales(boolean aceptarCaracteresEspeciales) {
            this.aceptarCaracteresEspeciales = aceptarCaracteresEspeciales;
        }

        public String generarContrasena() {
            String minusculas = "abcdefghijklmnopqrstuvwxyz";
            String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numeros = "0123456789";
            String especiales = "!@#$%^&*()-_=+<>?";

            String base = minusculas + numeros;
            if (aceptarMayusculas) base += mayusculas;
            if (aceptarCaracteresEspeciales) base += especiales;

            Random random = new Random();
            StringBuilder contrasena = new StringBuilder();
            for (int i = 0; i < numeroCaracteres; i++) {
                contrasena.append(base.charAt(random.nextInt(base.length())));
            }
            return contrasena.toString();
        }
}
