public class Comprobacion_de_Seguridad{
    public static String evaluarSeguridad(String contrasena) {
        if (contrasena.length() < 10) {
            return "Mala";
        } else if (contrasena.matches(".*[A-Z].*") && contrasena.matches(".*[0-9].*") && contrasena.matches(".*[!@#$%^&*()-_=+<>?].*")) {
            return "Fuerte";
        } else {
            return "Mas o Menos";
        }
    }
}
