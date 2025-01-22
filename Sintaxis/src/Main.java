//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Clase Pricipal
public class Main {
    //Metodo Main
    /*
    soy
    un comentario
    de varias
    lines
     */
    public static void main(String[] args) {



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Jorge Armando Lopez Morales");
       String Cadenas = "Jorge" + "Lopez" + "Morales";

        System.out.println(Cadenas);
        System.out.println(Cadenas.length());

        System.out.println(Cadenas.substring(2,5));
        System.out.println(Cadenas.substring(2));
        System.out.println(Cadenas.substring(0,5));

    }
}