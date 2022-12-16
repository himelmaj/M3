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
public class Ejercicio01 {

  static Scanner z = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Introduce el numero 1: ");
    float x = z.nextFloat();

    System.out.println("Introduce el numero 2: ");
    float y = z.nextFloat();

    System.out.println("Suma: " + (x + y));
    System.out.println("Resta: " + (x - y));
    System.out.println("Multiplicacion: " + (x * y));
    System.out.println("Division: " + (x / y));
  }
}
