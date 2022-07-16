/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej7 {
    public static void main(String[] args) {
        int n,r;
        Scanner ingreso = new Scanner(System.in);

        System.out.printf("Introduzca un número entero: ");
        n= ingreso.nextInt();
        r=n%2;
        if (r== 0) {
            System.out.printf(" NUMERO  PAR");
        } else {
            System.out.printf(" NUMERO  IMPAR");
        }
    }
}