/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author himelmaj
 * 
 * Realiza un conversor de euros a otra moneda. La cantidad en euros que se quiere convertir deberá estar almacenada en una variable.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        
        float valorEuro = 1f;
        float valorDolar = 0.9741f;

        float misEuros = 5f;
        float misDolares = 5f;
        
        //Euros a Dolares
        System.out.println( "Mis "+(misEuros)+" euros a dolares son " + ((valorDolar * misEuros)/ valorEuro)+" dolares.");
        //Dolares a Euros
        System.out.println( "Mis "+(misDolares)+" dolares a euros son " + ((valorEuro * misDolares)/ valorDolar)+" dolares.");
    }
}
