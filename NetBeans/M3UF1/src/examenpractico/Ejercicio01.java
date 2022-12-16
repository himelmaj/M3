/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpractico;

import java.util.Scanner;

/**
 *
 * @author himelmaj
 */
public class Ejercicio01 {

  static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Let's calculate th rest of x/y");
    System.out.println("Enter number1: ");
    int number1 = s.nextInt();
    System.out.println("Enter number2: ");
    int number2 = s.nextInt();
    System.out.println("The remainder of x%y is: " + (number1 % number2));
  }
}
