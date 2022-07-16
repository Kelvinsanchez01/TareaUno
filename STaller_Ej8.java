/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un número:");
        double numero = escaner.nextDouble();
        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
