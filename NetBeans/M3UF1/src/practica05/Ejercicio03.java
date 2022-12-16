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
public class Ejercicio03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("MENU: ");
        System.out.println("[1] - Dia 1");
        System.out.println("[2] - Dia 2");
        System.out.println("[3] - Dia 3");
        System.out.println("[4] - Dia 4");
        System.out.println("[5] - Dia 5");
        System.out.println("[6] - Dia 6");
        System.out.println("[7] - Dia 7");

        System.out.print("Escoge una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No has escogido ninguna opcion");
        }
    }
}
