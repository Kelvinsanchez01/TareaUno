/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej10 {

    public static void main(String[] args) {
        long nmr, axl, entero, ign;
        boolean binario;
        int exponente;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingresar un numero binario para convertir a entero: ");
            nmr = sc.nextLong();
            binario = true;
            axl = nmr;
            while (axl != 0) {
                ign = axl % 10;
                if (ign != 0 && ign != 1) {
                    binario = false;
                }
                axl = axl / 10;
            }
        } while (!binario);
        exponente = 0;
        entero = 0;
        while (nmr != 0) {
            ign = nmr % 10;
            entero = entero + ign * (int) Math.pow(2, exponente);
            exponente++;
            nmr = nmr / 10;
        }
        System.out.println("Entero: " + entero);
    }
}
