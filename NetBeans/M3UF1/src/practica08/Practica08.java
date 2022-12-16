/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica08;

import java.util.Scanner;

/**
 * @author himelmaj
 */
public class Practica08 {

  static Scanner z = new Scanner(System.in);

  public static void main(String[] args) {
    z.useDelimiter("\n");
    int opcion;
    do {
      System.out.println("\nMenu:");
      System.out.println("[1] Ejercicio 1");
      System.out.println("[2] Ejercicio 2");
      System.out.println("[3] Ejercicio 3");
      System.out.println("[4] Ejercicio 4");
      System.out.println("[5] Ejercicio 5");
      System.out.println("[6] Ejercicio 6");
      System.out.println("[7] Ejercicio 7");
      System.out.println("[0] Exit");

      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
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
        case 7:
          ejercicio7();
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
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Usando for");
      System.out.println("[2] Usando while");
      System.out.println("[3] Usando do-while");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      int num;
      switch (opcion) {
        case 1:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          for (int i = 0; i <= 100; i++) {
            if (i % num == 0) {
              System.out.println(i);
            }
          }
          break;
        case 2:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          int multiplo = 0;
          int cont = 0;
          while (multiplo <= 100) {
            System.out.println(multiplo);
            cont++;
            multiplo = num * cont;
          }
          break;
        case 3:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          multiplo = 0;
          cont = 0;
          do {
            System.out.println(multiplo);
            cont++;
            multiplo = num * cont;
          } while (multiplo <= 100);
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio2() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Usando for");
      System.out.println("[2] Usando while");
      System.out.println("[3] Usando do-while");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      int num;
      switch (opcion) {
        case 1:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          for (int i = num; i >= 0; i -= 10) {
            System.out.println(i);
          }
          break;
        case 2:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          int i = num;
          while (i >= 0) {
            System.out.println(i);
            i -= 10;
          }
          break;
        case 3:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          i = num;
          do {
            System.out.println(i);
            i -= 10;
          } while (i >= 0);
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio3() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Usando for");
      System.out.println("[2] Usando while");
      System.out.println("[3] Usando do-while");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      int num;
      switch (opcion) {
        case 1:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          for (int i = 0; i <= 10; i++) {
            System.out.println((num) + " x " + (i) + " = " + (num * i));
          }
          break;
        case 2:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          int i = 0;
          while (i <= 10) {
            System.out.println((num) + " x " + (i) + " = " + (num * i));
            i++;
          }
          break;
        case 3:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          i = 0;
          do {
            System.out.println((num) + " x " + (i) + " = " + (num * i));
            i++;
          } while (i <= 10);
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio4() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Usando for");
      System.out.println("[2] Usando while");
      System.out.println("[3] Usando do-while");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      int num;

      switch (opcion) {
        case 1:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          for (int i = num; i < num + 5; i++) {
            System.out.println(i + " | " + (i * i) + " | " + (i * i * i));
          }
          break;
        case 2:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          int i = num;
          while (i < num + 5) {
            System.out.println((i) + " | " + (i * i) + " | " + (i * i * i));
            i++;
          }
          break;
        case 3:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          i = num;
          do {
            System.out.println((i) + " | " + (i * i) + " | " + (i * i * i));
            i++;
          } while (i < num + 5);
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio5() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Usando for");
      System.out.println("[2] Usando while");
      System.out.println("[3] Usando do-while");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      int num;

      switch (opcion) {
        case 1:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          for (int i = 1; num != 0; i++) {
            num /= 10;
            if (num == 0) {
              System.out.println("Digitos totales: " + i);
            }
          }
          break;
        case 2:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          int i = 1;
          while (num != 0) {
            num /= 10;
            if (num == 0) {
              System.out.println("Digitos totales: " + i);
            }
            i++;
          }
          break;
        case 3:
          System.out.print("Introduce numero: ");
          num = z.nextInt();
          i = 1;
          do {
            num /= 10;
            if (num == 0) {
              System.out.println("Digitos totales: " + i);
            }
            i++;
          } while (num != 0);
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio6() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Ejercicio 6");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      switch (opcion) {
        case 1:
          int numR = (int) (Math.random() * 10 + 1);
          int i = 3;
          System.out.print(
            "EL programa elegir� un n�mero aleatorio entre 1 y 10:"
          );
          System.out.println(numR);
          int num = 0;

          while ((i >= 1) && (num != numR)) {
            System.out.print(
              "Adivina el numero aleatorio. Tienes " + i + " intentos: "
            );
            num = z.nextInt();
            i--;
            if (num == numR) {
              System.out.println("Correcta");
            } else {
              System.out.println("Incorrecta");
            }
          }
          if ((i == 0) && (num != numR)) {
            System.out.println("Has agotado el n�mero de intentos");
          }
          break;
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }

  static void ejercicio7() {
    int opcion;
    do {
      System.out.println("\nMenu:\n");
      System.out.println("[1] Ejercicio 7");
      System.out.println("[0] Exit\n");
      System.out.print("Elige opcion: ");
      opcion = z.nextInt();
      switch (opcion) {
        case 1:
          System.out.print("Base: ");
          int numB = z.nextInt();
          System.out.print("Exponente: ");
          int numE = z.nextInt();
          int numP = 1;
          if (numE == 0) {
            numP = 1;
          }
          if (numE > 0) {
            for (int i = 0; i < numE; i++) {
              numP *= numB;
            }
          }
          if (numE < 0) {
            for (int i = 0; i < -numE; i++) {
              numP *= numB;
            }
            numP = 1 / numP;
          }
          System.out.println(numB + "^" + numE + " = " + numP);
          break;
        case 0:
          break;
        default:
          throw new AssertionError();
      }
    } while (opcion != 0);
  }
}
