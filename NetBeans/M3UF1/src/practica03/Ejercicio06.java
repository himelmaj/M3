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
public class Ejercicio06 {

  static Scanner z = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Cual es tu string? ");
    String myString = z.nextLine();

    System.out.println("Cual es tu char? ");
    char myChar = z.next().charAt(0);

    System.out.println(myString + myChar);
  }
}
