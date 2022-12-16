/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica09;

import java.util.Scanner;

/**
 *
 * @author himelmaj
 */
public class Ejercicio01 {

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
        System.out.print("¿Cuántos términos de la serie de Fibonacci quieres ver? ");
        int n = z.nextInt();
        System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    static void ejercicio2() {
        System.out.print("Ingresa la altura de la pirámide: ");
        int altura = z.nextInt();
        System.out.print("Ingresa el carácter de relleno: ");
        char caracter = z.next().charAt(0);
        for (int i = 1; i <= altura; i++) {
            for (int j = altura - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    static void ejercicio3() {
        System.out.print("Ingresa numero: ");
        int n = z.nextInt();
        for (int i = 1; n >= 0; i++) {
            if (n >= 0) {
                System.out.print("Ingresa numero: ");
                n = z.nextInt();
            }
            if (n < 0) {
                System.out.println("Numeros introducidos totales: " + i);
            }
        }
    }

    static void ejercicio4() {
        System.out.print("Ingresa un número: ");
        int num = z.nextInt();
        for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            char c = String.valueOf(num).charAt(i);
            System.out.print(c);
        }
    }

    static void ejercicio5() {
    }

    static void ejercicio6() {
    }

    static void ejercicio7() {
    }
}
