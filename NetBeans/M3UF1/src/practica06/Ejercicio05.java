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
public class Ejercicio05 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        input.useDelimiter("\n");
        
        System.out.println("Day: "); //Definimos el dia
        String currentDay = (input.next()).toLowerCase(); //Definimos el dia
        System.out.println("Hour: "); //Definimos la hora
        int currentHour = input.nextInt(); //Definimos la hora
        System.out.println("Min: "); //Definimos la hora
        int currentMin = input.nextInt(); //Definimos la hora
        boolean isWeekend = false; //Si es false hace el if de abajo del todo
        int totalMin = (4 * 24 * 60) + (15 * 60); // Minutos totales de la semana
        int completedDays = 0; //Dias completados de la semana

        switch (currentDay) {
            case "lunes":
                completedDays = 0; //Dia completados de la semana
                break;
            case "martes":
                completedDays = 1; //Dia completados de la semana
                break;
            case "miercoles":
                completedDays = 2; //Dia completados de la semana
                break;
            case "jueves":
                completedDays = 3; //Dia completados de la semana
                break;
            case "viernes":
                completedDays = 4; //Dia completados de la semana
                if (currentHour >= 15) { //Si la hora de menor ha 3 isWeekend es true y no hace el if de abajo del todo
                    isWeekend = true;
                }
                break;
            default:
                System.out.println("Already Weekend");
                isWeekend = true;
                break;
        }

        if (!isWeekend) { //Calcular los minutos que han pasado
            int passedMin
                    = (completedDays * 24 * 60) + (currentHour * 60) + currentMin;
            System.out.println(totalMin - passedMin + " minutes "); //Resta los minutos que han pasado a los minutos totales y lo printa por pantalla
        }
        
         
    }
}
