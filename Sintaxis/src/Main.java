import java.lang.invoke.StringConcatException;
import java.util.Random;
import java.util.Scanner;
import java.util. Random;
import java.util.Scanner;
import java.util.Scanner;
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
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Jorge Armando Lopez Morales");
//       String Cadenas = "Jorge" + "Lopez" + "Morales";
//
//        System.out.println(Cadenas);
//        System.out.println(Cadenas.length());
//
//        System.out.println(Cadenas.substring(2,5));
//        System.out.println(Cadenas.substring(2));
//        System.out.println(Cadenas.substring(0,5));
//
//
//        int x=5,x2;
//        double y=1.25,y2;
//        String z="204",z1;
//
//        x2 = Integer.parseInt(z);
//        z1 = String.valueOf(y);
//        // comvercion de int a double
//        double asd=Double.valueOf(x);
//
//
//        //comvercion implicita
//        int num = 12;
//        double numD = num;
//        System.out.println("comvercion implicita"+numD);
//        System.out.println(x2);
//        System.out.println(z1);
//        System.out.println(asd);
//
//        //creamos un objeto rdn de clase random
//        Random RND= new Random();
//        //generamos numeros y los guardamos
//        int numeroaleatorio = RND.nextInt(100);
//        double numdouble = RND.nextDouble();
//
//        System.out.println("Aleatorio Entero"+numeroaleatorio);
//        System.out.println("Aleatorio double"+numdouble);
//
//        //Solicitud de datos
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Ingrese un numero cualquiera");
//        String numero = sc.nextLine();
//
//        System.out.println("Ingrese el numero entero");
//        String numeroentero = sc.nextLine();
//
//        System.out.println("Ingrese el numero con decimales");
//        double numerodecimal = sc.nextDouble();
//
//        System.out.println("numero culquira"+numero);
//        System.out.println("numero culquira"+numeroentero);
//        System.out.println("numero culquira"+numerodecimal);
//
//
//        System.out.println(10>9); //true
//        System.out.println(10==9); //false
//        System.out.println(10<9); //false
//        System.out.println(10<=9); //true
//        System.out.println(10>=9); //false
//        System.out.println(10!=9); //true
//
//        int x= 3;
//        System.out.println(x<5 && x> 10);//false
//        System.out.println(x<5 || x>10);//true
//        System.out.println(!(x<5 && x<10));//true



// Practica numero 3  ///////////////////////////////////////////////

// Ejercicio 1

//       Scanner scanner = new Scanner(System.in);
//
//       System.out.print("Ingrese el numero de horas que se trabajaron: ");
//       int horas = scanner.nextInt();
//       System.out.print("Ingrese el costo por hora: ");
//       double costo = scanner.nextDouble();
//
//       double paga = horas * costo;
//       System.out.println("La paga total es: $" + paga);
//
//       scanner.close();


// Ejercicio 2

//     Scanner scanner = new Scanner(System.in);
//
//     System.out.print("Ingrese su nombre completo: ");
//     String nombre = scanner.nextLine();
//
//     System.out.println("en minúsculas: " + nombre.toLowerCase());
//     System.out.println("en mayúsculas: " + nombre.toUpperCase());
//     System.out.println("con iniciales en mayúscula: " + Nombre(nombre));
//
//     scanner.close();
//    }
//
// public static String Nombre(String nombre) {
//  String[] palabras = nombre.split(" ");
//  StringBuilder resultado = new StringBuilder();
//  for (String palabra : palabras) {
//   resultado.append(Character.toUpperCase(palabra.charAt(0)))
//           .append(palabra.substring(1).toLowerCase()).append(" ");
//  }
//  return resultado.toString().trim();

//Ejercicio 3

//     Scanner scanner = new Scanner(System.in);
//
//     System.out.print("Ingrese un número entero X: ");
//     int x = scanner.nextInt();
//
//     int suma = (x * (x + 1)) / 2;
//     System.out.println("La suma de los números del 1 al " + x + " es: " + suma);
//
//     scanner.close();


     //Ejercicio 4



//     Scanner scanner = new Scanner(System.in);
//
//     System.out.print("Ingrese su nombre: ");
//     String nombre = scanner.nextLine();
//
//     String nombreSinEspacios = nombre.replace(" ", "");
//     System.out.println(nombre.toUpperCase() + " tiene " + nombreSinEspacios.length() + " letras.");
//
//     scanner.close();


     //Ejercicio 5



     Scanner scanner = new Scanner(System.in);

     System.out.print("Ingrese el número de payasos vendidos: ");
     int payasos = scanner.nextInt();
     System.out.print("Ingrese el número de muñecas vendidas: ");
     int munecas = scanner.nextInt();

     int pesoTotal = (payasos * 112) + (munecas * 75);
     System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");

     scanner.close();
    }
}