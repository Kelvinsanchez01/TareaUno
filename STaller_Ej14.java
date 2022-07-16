/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej14 {

    public static void main(String[] args) {

        int s = 0, m = 0, h = 0, hs = 0, ms = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las horas:");
        h = input.nextInt();
        System.out.println("Ingrese los minutos:");
        m = input.nextInt();
        hs = h * 3600;
        ms = m * 60;
        s = hs + ms;
        System.out.println("Conversion en segundos es : " + s);
    }
}
