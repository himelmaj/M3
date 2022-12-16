/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica06;

import java.util.Scanner;

/**
 *
 * @author himelmaj
 */
public class ClassMain {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    sc.useDelimiter("\n");
    int opcion;
    do {
      System.out.println("\nMenu:");
      System.out.println("[1] Ejercicio 1");
      System.out.println("[2] Ejercicio 2");
      System.out.println("[3] Ejercicio 3");
      System.out.println("[4] Ejercicio 4");
      System.out.println("[5] Ejercicio 5");
      System.out.println("[0] Exit");

      System.out.print("Elige opcion: ");
      opcion = sc.nextInt();
      System.out.print("\n");

      switch (opcion) {
        case 1:
          ejercicio1();
          break;
        case 2:
          ejercicio2();
          break;
        case 3:
          ejercicio3();
          break;
        case 4:
          ejercicio4();
          break;
        case 5:
          ejercicio5();
          break;
        case 6:
          ejercicio6();
          break;
        case 0:
          System.out.println("Bye.");
          break;
        default:
          System.out.println("Opcion fuera de rango. ");
      }
    } while (opcion != 0);
  }

  static void ejercicio1() {
    // Pregunta 1 --------------------------------------------------------------------------
    System.out.println("\nQue es Java?\n");
    System.out.println("[1]: Un personaje de StarWars");
    System.out.println(
      "[2]: Un lenguaje de programacion interpretado o intermedio"
    );
    System.out.println("[3]: Un lenguaje informatico de bajo nivel");
    System.out.println("[4]: Saltar");

    System.out.print("\nEscoge una opcion: ");
    int opcion = sc.nextInt();
    int respuesta = 0;
    switch (opcion) {
      case 1:
        System.out.println("Has Escogido 1");
        break;
      case 2:
        System.out.println("Has Escogido 2"); //correcta
        respuesta = respuesta + 1;
        break;
      case 3:
        System.out.println("Has Escogido 3");

        break;
      case 4:
        System.out.println("Has Escogido 4");
        break;
    }

    //---------------------------------------------------------------------------------------
    //Pregunta 2 ----------------------------------------------------------------------------
    System.out.println(
      "\nUn programa escrito en Java pasa por 2 etapas: la generacion de bytecode y su interpretacion por la maquina virtual de Java (JVM)\n"
    );
    System.out.println("[1]: Verdadero");
    System.out.println("[2]: Falso");

    System.out.print("\nEscoge una opcion: ");
    int opcion2 = sc.nextInt();

    switch (opcion2) {
      case 1:
        System.out.println("Has Escogido 1"); //correcta
        respuesta = respuesta + 1;
        break;
      case 2:
        System.out.println("Has Escogido 2");
        break;
    }
    //---------------------------------------------------------------------------------------
    //Pregunta 3 ----------------------------------------------------------------------------
    System.out.println(
      "\nQue extension debe tener el archivo que contiene el codigo fuente de un programa escrito en Java?\n"
    );
    System.out.println("[1]: .class");
    System.out.println("[2]: .font");
    System.out.println("[3]: .exe");
    System.out.println("[4]: .java");
    System.out.print("\nEscoge una opcion: ");
    int opcion3 = sc.nextInt();
    switch (opcion3) {
      case 1:
        System.out.println("Has Escogido 1");
        break;
      case 2:
        System.out.println("Has Escogido 2");
        break;
      case 3:
        System.out.println("Has Escogido 3");
        break;
      case 4:
        System.out.println("Has Escogido 3"); //correcta
        respuesta = respuesta + 1;
        break;
    }
    //---------------------------------------------------------------------------------------
    //Pregunta 4 ----------------------------------------------------------------------------
    System.out.println(
      "\nSe puede ejecutar el bytecode que se obtiene al compilar un archivo.java sin disponer de la maquina virtual de java?\n"
    );
    System.out.println("[1]: Si");
    System.out.println("[2]: No");
    System.out.print("\nEscoge una opcion: ");
    int opcion4 = sc.nextInt();
    switch (opcion4) {
      case 1:
        System.out.println("Has Escogido 1"); //correcta
        respuesta = respuesta + 1;
        break;
      case 2:
        System.out.println("Has Escogido 2");
        break;
    }
    //---------------------------------------------------------------------------------------
    //Pregunta 5 ----------------------------------------------------------------------------
    System.out.println("\n¿Que es Eclipse?\n");
    System.out.println("[1]: Un lenguaje de alto nivel");
    System.out.println("[2]: Una peli de vampiros de la saga Crepusculo");
    System.out.println("[3]: Un IDE");
    System.out.println("[4]: Un fenomeno astrologico");
    System.out.print("\nEscoge una opcion: ");
    int opcion5 = sc.nextInt();

    switch (opcion5) {
      case 1:
        System.out.println("Has Escogido 1");
        break;
      case 2:
        System.out.println("Has Escogido 2");
        break;
      case 3:
        System.out.println("Has Escogido 3"); //correcta
        respuesta = respuesta + 1;
        break;
      case 4:
        System.out.println("Has Escogido 4");

        break;
    }

    //---------------------------------------------------------------------------------------
    //Nota
    System.out.println("\nTu nota es " + (respuesta) + "\n");
  }

  static void ejercicio2() {
    System.out.print("Introduce el nombre del alumno1: ");
    String alumno1 = sc.next(); //Utilizamos nextLine para introducir varias palabras dentro del mismo string

    System.out.print("Introduce el nombre del alumno2: ");
    String alumno2 = sc.next();

    System.out.print("Introduce el nombre del alumno2: ");
    String alumno3 = sc.next();

    String auxiliar; //creamos una variable auxiliar para comparar

    if (alumno1.compareTo(alumno2) > 0) {
      auxiliar = alumno1;
      alumno1 = alumno2;
      alumno2 = auxiliar;
    }

    if (alumno2.compareTo(alumno3) > 0) {
      auxiliar = alumno2;
      alumno2 = alumno3;
      alumno3 = auxiliar;
    }

    if (alumno1.compareTo(alumno2) > 0) {
      auxiliar = alumno1;
      alumno1 = alumno2;
      alumno2 = auxiliar;
    }

    System.out.println(alumno1 + "\n" + alumno2 + "\n" + alumno3);
  }

  static void ejercicio3() {
    System.out.print("Introduce numero de 3 digitos: ");
    int numero = sc.nextInt();

    if (numero >= 99 && numero <= 999) { // Si es numero entre 100 a 999
      if (numero % 10 == numero / 100) {
        System.out.println("Es capicua");
      } else {
        System.out.println("No es capicua");
      }
    } else {
      System.out.println("Numero fuera de limite");
    }
  }

  static void ejercicio4() {
    System.out.print("Intoduce numero: ");

    int num = sc.nextInt();

    System.out.println(
      "El numero introducido tiene " + Integer.toString(num).length()
    ); //para transformar un int a string se usa
    //Interger.toSting y el length es para ver los digitos
  }

  static void ejercicio5() {
    sc.useDelimiter("\n");

    System.out.println("Day: "); //Definimos el dia
    String currentDay = (sc.next()).toLowerCase(); //Definimos el dia
    System.out.println("Hour: "); //Definimos la hora
    int currentHour = sc.nextInt(); //Definimos la hora
    System.out.println("Min: "); //Definimos la hora
    int currentMin = sc.nextInt(); //Definimos la hora
    boolean isWeekend = false; //Si es false hace el if de abajo del todo
    int totalMin = (4 * 24 * 60) + (15 * 60); // Minutos totales de la semana
    int completedDays = 0; //Dias completados de la semana

    switch (currentDay) {
      case "lunes":
        completedDays = 0; //Dia completados de la semana
        break;
      case "martes":
        completedDays = 1; //Dia completados de la semana
        break;
      case "miercoles":
        completedDays = 2; //Dia completados de la semana
        break;
      case "jueves":
        completedDays = 3; //Dia completados de la semana
        break;
      case "viernes":
        completedDays = 4; //Dia completados de la semana
        if (currentHour >= 15) { //Si la hora de menor ha 3 isWeekend es true y no hace el if de abajo del todo
          isWeekend = true;
        }
        break;
      default:
        System.out.println("Already Weekend");
        isWeekend = true;
        break;
    }

    if (!isWeekend) { //Calcular los minutos que han pasado
      int passedMin =
        (completedDays * 24 * 60) + (currentHour * 60) + currentMin;
      System.out.println(totalMin - passedMin + " minutes "); //Resta los minutos que han pasado a los minutos totales y lo printa por pantalla
    }
  }

  static void ejercicio6() {
    System.out.print("Introduce base imponible: ");
    float base = sc.nextFloat();
    System.out.println("\nSlecciona tipo de IVA:");
    System.out.println("[1] 21%");
    System.out.println("[2] 10%");
    System.out.println("[3] 4%");
    System.out.print("Slecciona tipo de IVA: ");
    int claseIVA = sc.nextInt();
    int bIVA = 0;

    switch (claseIVA) {
      case 1:
        bIVA = 21;
        break;
      case 2:
        bIVA = 10;
        break;
      case 3:
        bIVA = 4;
        break;
      default:
        System.out.println("ERROR IVA");
    }

    float iva = base * bIVA / 100;
    float baseSinPromo = base + iva;

    float promo = 0;

    System.out.println("\nSlecciona tipo de Promo:");
    System.out.println("[1] Sin Promo");
    System.out.println("[2] Mitad");
    System.out.println("[3] 5%");
    System.out.print("Slecciona tipo de Promo: ");

    int tipoPromo = sc.nextInt();
    switch (tipoPromo) {
      case 1:
        break;
      case 2:
        promo = baseSinPromo / 2;
        break;
      case 3:
        promo = (float) (baseSinPromo * 0.05);
        break;
      default:
        System.out.println("ERROR PROMO");
    }

    float total = baseSinPromo - promo;

    System.out.print("\nBase imponible " + base + "\n");
    System.out.print("IVA (" + bIVA + "%) " + iva + "\n");
    System.out.print("Precio con IVA " + baseSinPromo + "\n");
    System.out.print("Promo " + tipoPromo + ": " + promo + "\n");
    System.out.print("TOTAL: " + total + "\n");
  }
}
