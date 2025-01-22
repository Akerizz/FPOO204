import java.lang.invoke.StringConcatException;
import java.util.Random;
import java.util.Scanner;
import java.util. Random;
import java. util. Scanner;
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


        int x=5,x2;
        double y=1.25,y2;
        String z="204",z1;

        x2 = Integer.parseInt(z);
        z1 = String.valueOf(y);
        // comvercion de int a double
        double asd=Double.valueOf(x);


        //comvercion implicita
        int num = 12;
        double numD = num;
        System.out.println("comvercion implicita"+numD);
        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //creamos un objeto rdn de clase random
        Random RND= new Random();
        //generamos numeros y los guardamos
        int numeroaleatorio = RND.nextInt(100);
        double numdouble = RND.nextDouble();

        System.out.println("Aleatorio Entero"+numeroaleatorio);
        System.out.println("Aleatorio double"+numdouble);

        //Solicitud de datos

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera");
        String numero = sc.nextLine();

        System.out.println("Ingrese el numero entero");
        String numeroentero = sc.nextLine();

        System.out.println("Ingrese el numero con decimales");
        double numerodecimal = sc.nextDouble();

        System.out.println("numero culquira"+numero);
        System.out.println("numero culquira"+numeroentero);
        System.out.println("numero culquira"+numerodecimal);


        System.out.println(10>9); //true
        System.out.println(10==9); //false
        System.out.println(10<9); //false
        System.out.println(10<=9); //true
        System.out.println(10>=9); //false
        System.out.println(10!=9); //true

        int x= 3;
        System.out.println(x<5 && x> 10);//false
        System.out.println(x<5 || x>10);//true
        System.out.println(!(x<5 && x<10));//true





    }
}