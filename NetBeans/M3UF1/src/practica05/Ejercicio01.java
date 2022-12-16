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
public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Introduce el dia : ");

        String diaSemana = (sc.next()).toUpperCase();

        if (diaSemana.equals("LUNES")) {
            System.out.println("M2");
        } else if (diaSemana.equals("MARTES")) {
            System.out.println("M5");
        } else if (diaSemana.equals("MIERCOLES")) {
            System.out.println("M2");
        } else if (diaSemana.equals("JUEVES")) {
            System.out.println("M15");
        } else if (diaSemana.equals("VIERNES")) {
            System.out.println("M15");
        } else if (diaSemana.equals("SABADO") || diaSemana.equals("DOMINGO")) {
            System.out.println("Fin de Semana no hay clase");
        } else {
            System.out.println("Dia no valido");
        }
    }
}
