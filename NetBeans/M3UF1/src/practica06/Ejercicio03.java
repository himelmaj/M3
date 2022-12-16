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
public class Ejercicio03 {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Introduce numero de 3 digitos: ");
    int numero = input.nextInt();


    if (numero >= 99 && numero <= 999) { // Si es numero entre 100 a 999
      if (numero % 10 == numero/100) {
        System.out.println("Es capicua");
      } else {
        System.out.println("No es capicua");
      }
    } else {
      System.out.println("Numero fuera de limite");
    }
  }
}
