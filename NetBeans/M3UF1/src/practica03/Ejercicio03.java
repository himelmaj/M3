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
public class Ejercicio03 {
static  Scanner z = new Scanner(System.in);
    public static void main(String[] args) {
       

        System.out.println("Introduce tu nombre: ");
        String nombre = z.nextLine();

        System.out.println("Introduce tu direccion: ");
        String direccion = z.nextLine();

        System.out.println("Introduce tu telefono: ");
        String telefono = z.nextLine();

        System.out.println("Mi nombre es " + (nombre));
        System.out.println("Mi direccion es " + (direccion));
        System.out.println("Mi telefono es " + (telefono));
    }
}
