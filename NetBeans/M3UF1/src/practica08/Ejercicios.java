/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica08;

import java.util.Scanner;
/**
 * @author himelmaj
 */
public class Ejercicios {

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

    }

    static void ejercicio5() {
        
    }

    static void ejercicio6() {
    }

    static void ejercicio7() {
    }
}
