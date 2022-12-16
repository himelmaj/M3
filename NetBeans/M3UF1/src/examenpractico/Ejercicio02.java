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
public class Ejercicio02 {

 static final Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a character: ");
    char codigoA = s.next().charAt(0);
    int codigoB = codigoA;
    System.out.println(
      "The ASCII code that represents the '" + codigoA + "' character is " + codigoB
    );
  }
}
