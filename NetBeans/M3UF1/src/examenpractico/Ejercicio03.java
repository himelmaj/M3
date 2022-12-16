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
public class Ejercicio03 {
    
    static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("What year are we in? ");
        int yearActual = s.nextInt();
        
        System.out.println("In what year were you born?");
        int yearBorn = s.nextInt();
        
        System.out.printf("%-10s%10s%-10s\n","Have passed",(yearActual-yearBorn)," years");
        System.out.printf("%-10s%10s%-10s\n","Have passed",((yearActual-yearBorn)*12)," months");
        System.out.printf("%-10s%10s%-10s\n","Have passed",(((yearActual-yearBorn)*12)*30)," days");
        System.out.printf("%-10s%10s%-10s\n","Have passed",((((yearActual-yearBorn)*12)*30)*24)," hours");
        System.out.printf("%-10s%10s%-10s\n","Have passed",(((((yearActual-yearBorn)*12)*30)*24)*60)," minutes");
        System.out.printf("%-10s%10s%-10s\n","Have passed",((((((yearActual-yearBorn)*12)*30)*24)*60)*60)," seconds");

        
    }
}
