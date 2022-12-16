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
public class Ejercicio01 {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
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
}
