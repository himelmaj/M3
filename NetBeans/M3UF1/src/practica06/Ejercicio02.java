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
public class Ejercicio02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce el nombre del alumno1: ");
        String alumno1 = sc.nextLine(); //Utilizamos nextLine para introducir varias palabras dentro del mismo string

        System.out.print("Introduce el nombre del alumno2: ");
        String alumno2 = sc.nextLine();

        System.out.print("Introduce el nombre del alumno2: ");
        String alumno3 = sc.nextLine();

        String auxiliar; //creamos una variable auxiliar para comparar
        
        if (alumno1.compareTo(alumno2) > 0) {
            auxiliar = alumno1;
            alumno1 = alumno2;
            alumno2 = auxiliar;
        }

        if (alumno2.compareTo(alumno3) > 0) {
            auxiliar = alumno2;
            alumno2 = alumno3;
            alumno3 = auxiliar;
        }

        if (alumno1.compareTo(alumno2) > 0) {
            auxiliar = alumno1;
            alumno1 = alumno2;
            alumno2 = auxiliar;
        }

        System.out.println(alumno1 + "\n" + alumno2 + "\n" + alumno3);
    }

}
