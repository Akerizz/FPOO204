//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                System.out.println("Hello, World!");
                Spartan_2 jefemaestro = new Spartan_2("Jonh",100,"Puñoz",0);
                jefemaestro.mostrarInfo();
                jefemaestro.usarManejoAvanzado();
                jefemaestro.atacar("Covenant");
                jefemaestro.recibirDano(50);
                jefemaestro.recargarEscudo();


                Spartan_3 jefemaestroll = new Spartan_3("Mclovin",30,"Puñoz",0);
                jefemaestroll.mostrarInfo();
                jefemaestroll.camuflajeactivo();
                jefemaestroll.atacar("Devora mundos");
                jefemaestroll.recibirDano(20);
                jefemaestroll.recargarEscudo();

                Spartan_4 jefemaestrolv = new Spartan_4("Angel",40,"Pistola",0);
                jefemaestrolv.mostrarInfo();
                jefemaestrolv.usarpropulsores();
                jefemaestrolv.atacar("la entidad lunar");
                jefemaestrolv.recibirDano(60);
                jefemaestrolv.recargarEscudo();



    }
}