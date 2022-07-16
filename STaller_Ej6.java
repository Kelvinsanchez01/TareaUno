/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Ingrese  A: ");
        double a = input.nextDouble();
        System.out.print("Ingese  B: ");
        double b = input.nextDouble();
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        double c = Math.sqrt(a + b);
        System.out.println("Valor de Hipotenusa es: " + c);
    }
}

