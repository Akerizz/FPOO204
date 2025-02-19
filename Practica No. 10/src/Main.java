import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int longitud = 8;

        while (true) {
            String inputLongitud = JOptionPane.showInputDialog("Ingresa la longitud de la contraseña (máximo 25 caracteres):");

            if (inputLongitud == null || inputLongitud.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se especifico la longitud. Se usara el valor por defecto de (8).");
                break;
            }

            try {
                int valorIngresado = Integer.parseInt(inputLongitud);
                if (valorIngresado >= 2 && valorIngresado <= 25) {
                    longitud = valorIngresado;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La longitud debe estar maximo en 25 caracteres.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero valido.");
            }
        }

        int mayusculasOption = JOptionPane.showConfirmDialog(null, "¿Incluir mayusculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirMayusculas = (mayusculasOption == JOptionPane.YES_OPTION);

        int especialesOption = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirEspeciales = (especialesOption == JOptionPane.YES_OPTION);

        Generador_de_Password generador = new Generador_de_Password(longitud, incluirMayusculas, incluirEspeciales);
        String contrasenaGenerada = generador.generaLaContrasena();

        String nivelSeguridad = Comprobacion_de_Seguridad.evaluarSeguridad(contrasenaGenerada);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasenaGenerada + "\nNivel de seguridad: " + nivelSeguridad);
    }
}