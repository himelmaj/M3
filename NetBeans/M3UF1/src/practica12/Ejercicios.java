/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica12;

import java.util.Scanner;
import java.lang.Math;

/**
 *
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
                case 8:
                    ejercicio7();
                    break;
                case 9:
                    ejercicio7();
                    break;
                case 10:
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
        final int SIZE = 10;
        int listaNum[] = new int[SIZE];
        int j = SIZE;
        for (int i = 0; i < listaNum.length; i++) {
            System.out.print("Introduce un numero: ");
            listaNum[j - 1] = z.nextInt();
            j = j - 1;
        }
        for (int h = 0; h < SIZE; h++) {
            System.out.println(listaNum[h]);
        }
    }

    static void ejercicio2() {
        final int SIZE = 20;
        int numero[] = new int[SIZE];
        int cuadrado[] = new int[SIZE];
        int cubo[] = new int[SIZE];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (0 + Math.random() * 100);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%8d | %8d |%8d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }

    static void ejercicio3() {
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numbers[i] = z.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] == max) {
                System.out.print(numbers[i] + " (máximo) ");
            } else if (numbers[i] == min) {
                System.out.print(numbers[i] + " (mínimo) ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    static void ejercicio4() {
    }

    static void ejercicio5() {
    }

    static void ejercicio6() {
    }

    static void ejercicio7() {
    }

    static void ejercicio8() {
    }

    static void ejercicio9() {
    }

    static void ejercicio10() {
    }
}
