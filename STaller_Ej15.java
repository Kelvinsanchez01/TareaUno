/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej15 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int sd, ms, hs;
        System.out.print("Ingrese los segundos para convertir a horas y minutos : ");
        sd = Integer.parseInt(ingreso.next());
        hs = sd / 3600;
        ms = sd / 60;
        System.out.println("Horas : " + hs);
        System.out.println("Minutos : " + ms);
    }
}

