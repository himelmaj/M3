/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica03;

import java.util.Scanner;

/**
 *
 * @author himelmaj
 */
public class Ejercicio07 {
    static Scanner z = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce 5 char...");

        System.out.println("Char 1:");
        char char1 = z.next().charAt(0);

        System.out.println("Char 2:");
        char char2 = z.next().charAt(0);

        System.out.println("Char 3:");
        char char3 = z.next().charAt(0);

        System.out.println("Char 4:");
        char char4 = z.next().charAt(0);

        System.out.println("Char 5:");
        char char5 = z.next().charAt(0);

        System.out.println(char1 + char2 + char3 + char4 + char5);
        System.out.println("" + char1 + char2 + char3 + char4 + char5);

    }
}
