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
public class Ejercicio04 {

  static Scanner z = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Cual es el  valor del euro? ");
    float valorEuro = z.nextFloat();

    System.out.println(
      "Cual es el valor del de la moneda a la que quieres convertir? "
    );
    float valor2Moneda = z.nextFloat();

    System.out.println("Cuantos euros tienes? ");
    float misEuros = z.nextFloat();

    //Euros a Dolares
    System.out.println(
      "Mis " +
      (misEuros) +
      " euros a dolares son " +
      ((valor2Moneda * misEuros) / valorEuro) +
      " dolares."
    );
  }
}
