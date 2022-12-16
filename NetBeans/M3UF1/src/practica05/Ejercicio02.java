/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica05;

import java.util.Scanner;

/**
 *
 * @author himelmaj
 */
public class Ejercicio02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce solo la hora : ");
        int hora = sc.nextInt();

        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        } else if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}
