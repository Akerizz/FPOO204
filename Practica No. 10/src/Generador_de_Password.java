
import java.util.Random;
public class Generador_de_Password {


        private int numeroCaracteres;
        private boolean aceptarMayusc;
        private boolean aceptarCaracteresEsp;

        public Generador_de_Password(int numeroDeCaracteres, boolean aceptarMayusculas, boolean aceptarCaracteresEspeciales) {
            this.numeroCaracteres = numeroDeCaracteres;
            this.aceptarMayusc = aceptarMayusculas;
            this.aceptarCaracteresEsp = aceptarCaracteresEspeciales;
        }

        public String generaLaContrasena() {
            String minusculas = "abcdefghijklmnopqrstuvwxyz";
            String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numeros = "0123456789";
            String especiales = "!@#$%^&*()-_=+<>?";

            String base = minusculas + numeros;
            if (aceptarMayusc) {
                base += mayusculas;
            }
            if (aceptarCaracteresEsp) {
                base += especiales;
            }

            Random random = new Random();
            StringBuilder contrasena = new StringBuilder();
            for (int i = 0; i < numeroCaracteres; i++) {
                contrasena.append(base.charAt(random.nextInt(base.length())));
            }

            return contrasena.toString();
        }
    }


