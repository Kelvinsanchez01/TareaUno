/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej13 {
    public static void main(String[] args) {
        int n, aux, ivs = 0, cifra;
        Scanner ingresar = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero: ");
            n= ingresar.nextInt();
        } while (n < 10);
        aux = n;
        while (aux != 0) {
            cifra = aux % 10;
            ivs= ivs * 10 + cifra;
            aux = aux / 10;
        }
        if (n== ivs) {
            System.out.println("Si es capicuo");
        } else {
            System.out.println("No es capicuo");
        }
    }
}

