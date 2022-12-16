/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author himelmaj
 *
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    float baseImponible = 1000f;

    float porcentajeIVA = 0.21f;

    float valorIvaPrecio = baseImponible * porcentajeIVA;

    System.out.println(
      "Base imponible: " +
      baseImponible +
      "\nIVA: " +
      valorIvaPrecio +
      "\nTotal factura: " +
      (baseImponible + valorIvaPrecio)
    );
  }
}
