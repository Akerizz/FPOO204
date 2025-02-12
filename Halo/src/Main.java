//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Biemvenido Nuevo Recluta!");
        //Instancia = objeto
        Spartan jefeMaestro = new Spartan();
        Spartan Reach = new Spartan();

        //asignamos los atributos del objeto
        jefeMaestro.nombre = "Milton";
        jefeMaestro.salud = 500;
        jefeMaestro.escudo = 200;
        jefeMaestro.armaPrincipal= "Rifle m777 de triple cañon ultra ligero de Fate";

        //metodos
        jefeMaestro.mostrarImfo();
        jefeMaestro.atacar("DESOLLADOR ROMPE HUESOS");
        jefeMaestro.RecargarArma(900);
        jefeMaestro.correr(true);


        //2 asignamos los atributos del objeto
        Reach.nombre = "Emiliano";
        Reach.salud = 50;
        Reach.escudo = 3;
        Reach.armaPrincipal= "ZENITH";

        //2 metodos
        Reach.mostrarImfo();
        Reach.atacar("Terroncito de azucar(gato indefenso y moribundo)");
        Reach.RecargarArma(10000);
        Reach.correr(true);


    }
}//lave clase