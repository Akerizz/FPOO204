public class Spartan_3 extends Spartan {

        public Spartan_3(String nombre,int salud,String arma,int escudo) {
            super(nombre,salud,arma,80);
        }

        public void camuflajeactivo(){
            System.out.println("El Spartan:"+nombre+" cuenta con camuflaje para invisibilidad:");
        }
    }

