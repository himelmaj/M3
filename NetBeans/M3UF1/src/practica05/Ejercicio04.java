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
public class Ejercicio04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Cuantas horas has trabajado: ");
        int horasTrabajadas = sc.nextInt();

        if ((horasTrabajadas > 1) && (horasTrabajadas <= 40)) {
            System.out.println("Por tus " + horasTrabajadas + "h deberias cobrar " + (horasTrabajadas * 12));
        } else if (horasTrabajadas >= 41) {
            System.out.println("Por tus " + horasTrabajadas + "h deberias cobrar " + ((40*12)+((horasTrabajadas-40)*16)));
        } else {
            System.out.println("No has hecho horas");
        }

    }
}
