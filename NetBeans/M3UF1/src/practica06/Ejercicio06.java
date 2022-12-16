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
public class Ejercicio06 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce base imponible: ");
        float base = input.nextFloat();
        System.out.println("\nSlecciona tipo de IVA:");
        System.out.println("[1] 21%");
        System.out.println("[2] 10%");
        System.out.println("[3] 4%");
        System.out.print("Slecciona tipo de IVA: ");
        int claseIVA = input.nextInt();
        int bIVA = 0;

        switch (claseIVA) {
            case 1:
                bIVA = 21;
                break;
            case 2:
                bIVA = 10;
                break;
            case 3:
                bIVA = 4;
                break;
            default:
                System.out.println("ERROR IVA");
        }

        float iva = base * bIVA / 100;
        float baseSinPromo = base + iva;

        float promo = 0;

        System.out.println("\nSlecciona tipo de Promo:");
        System.out.println("[1] Sin Promo");
        System.out.println("[2] Mitad");
        System.out.println("[3] 5%");
        System.out.print("Slecciona tipo de Promo: ");

        int tipoPromo = input.nextInt();
        switch (tipoPromo) {
            case 1:
                break;
            case 2:
                promo = baseSinPromo / 2;
                break;
            case 3:
                promo = (float) (baseSinPromo * 0.05);
                break;
            default:
                System.out.println("ERROR PROMO");
        }

        float total = baseSinPromo - promo;

        System.out.print("\nBase imponible " + base + "\n");
        System.out.print("IVA (" + bIVA + "%) " + iva + "\n");
        System.out.print("Precio con IVA " + baseSinPromo + "\n");
        System.out.print("Promo " + tipoPromo + ": " + promo + "\n");
        System.out.print("TOTAL: " + total + "\n");

    }
}
