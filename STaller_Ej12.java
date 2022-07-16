/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej12 {
     public static void main(String[] args) {
      Scanner ingresar = new Scanner(System.in);
        int dia, mes, anio;
         System.out.println("Ingrese un dia:");
          dia = ingresar.nextInt();
          System.out.println("Ingrese un mes: ");
           mes = ingresar.nextInt();
        System.out.println("Ingrese un año: ");
        anio = ingresar.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("Es bisiesto "+anio);
        } else {
            System.out.println("No es bisiesto "+anio);
        }
    }
}

