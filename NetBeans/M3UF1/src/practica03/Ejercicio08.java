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
public class Ejercicio08 {
static Scanner z = new Scanner(System.in);
  public static void main(String[] args) {

    float euroHoras = 12f;

    System.out.println("Cuantas horas has trabajado esta semana? ");
    float horas = z.nextFloat();

    System.out.println("Tu salario semanal es de "+(horas*euroHoras)+" euros");
  }
}
