public class Spartan_2 extends Spartan {

        public Spartan_2(String nombre,int salud,String arma,int escudo) {
            super(nombre,salud,arma,150);
        }

        public void usarManejoAvanzado(){
            System.out.println("El spartan:"+nombre+"con escudo extra y tacticas de combate avanzadas");
        }
    }



