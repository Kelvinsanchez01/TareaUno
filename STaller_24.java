/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_24 {
    
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

        int cEdad = 0, cEdad2 = 0;
        double edad = 0, peso = 0, estatura = 0, prmdEdad = 0, prmdEstatura = 0, prmdPeso =0 , prmdPesoEdad = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Persona: " + i);
            System.out.println("Ingresa la edad: ");
            edad = input.nextDouble();
            System.out.println("Ingresa el peso: ");
            peso = input.nextDouble();
            System.out.println("Ingresa la estatura: ");
            estatura = input.nextDouble();
            prmdEdad += edad;
            prmdPeso += peso;
            prmdEstatura += estatura;
            if (edad >= 18 && edad <= 25) {
                cEdad++;
                prmdPesoEdad += peso;
            } else if (edad > 36) {
                cEdad2++;
            }
        }
        prmdEdad = prmdEdad / 10;
        prmdEstatura = prmdEstatura / 10;
        peso = prmdPeso / 10;
        prmdPesoEdad = prmdPesoEdad / cEdad;
        System.out.println("Promedio  edad: " + prmdEdad);
        System.out.println("Promedio estatura: " + prmdEstatura);
        System.out.println("Promedio  peso: " + prmdPeso);
        System.out.println("Personas entre 18 y 25 años: " + cEdad);
        System.out.println("Personas mayores de 36: " + cEdad);
        System.out.println("Promedio del peso de personas entre 18 y 25 anios: " + prmdPesoEdad);
        
    }
}

