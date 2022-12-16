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
public class Ejercicio04 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Intoduce numero: ");

        int num = input.nextInt();
    
        System.out.println("El numero introducido tiene " + Integer.toString(num).length()); //para transformar un int a string se usa
                                                                                             //Interger.toSting y el length es para ver los digitos
                                                                                             
        
    }

}
