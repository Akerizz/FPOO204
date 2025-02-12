public class Spartan {



        //Atributos del spartan

        String nombre;
        int salud;
        int escudo;
        String armaPrincipal;

        //Metodos de spartan

        public void mostrarImfo(){
        System.out.println("------------Información del Spartan---------- " + nombre);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("Arma Principal: " + armaPrincipal);
        System.out.println("--------------------------------------------- ");
        }

        public void atacar(String enemigo){
            System.out.println(nombre + "atacar a"+ enemigo +"con"+armaPrincipal);
        }
            public void RecargarArma(int municiones){
                int restante = 10;
                int total = restante + municiones;
                System.out.println("El Arma: " + armaPrincipal + "tiene" + total + "balas");
        }
       public void correr(boolean status){
            if(status){
                System.out.println("El Spartan" + nombre + "esta corriendo");
            }else{
                System.out.println("El Spartan" + nombre + "Se detuvo");
            }
       }



    }


