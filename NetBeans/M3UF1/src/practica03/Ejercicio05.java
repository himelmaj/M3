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
public class Ejercicio05 {

  static final float porcentajeIVA = 0.21f;
  static Scanner z = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Cual es la base imponible?");
    float baseImponible = z.nextFloat();

    System.out.println(
      "Base imponible: " +
      baseImponible +
      "\nIVA: " +
      (baseImponible * porcentajeIVA) +
      "\nTotal factura: " +
      (baseImponible + (baseImponible * porcentajeIVA))
    );
  }
}
