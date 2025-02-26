//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        int longitud = 8;

        while (true) {
            String inputLongitud = JOptionPane.showInputDialog("Ingresa la longitud de la contraseña (máximo 25 caracteres):");
            if (inputLongitud == null || inputLongitud.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se especificó la longitud. Se usará el valor por defecto de 8.");
                break;
            }
            try {
                int valorIngresado = Integer.parseInt(inputLongitud);
                if (valorIngresado >= 2 && valorIngresado <= 25) {
                    longitud = valorIngresado;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La longitud debe estar entre 2 y 25 caracteres.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        }

        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        Generador_de_Password generador = new Generador_de_Password(longitud, incluirMayusculas, incluirEspeciales);
        String contrasenaGenerada = generador.generarContrasena();

        String nivelSeguridad = Comprobacion_de_Seguridad.evaluarSeguridad(contrasenaGenerada);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasenaGenerada + "\nNivel de seguridad: " + nivelSeguridad);
    }
}}
