/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej17 {

    static Scanner ingresar = new Scanner(System.in);

    public static void main(String[] args) {
        int h;
        System.out.print("Ingrese una hora: ");
        h = ingresar.nextInt();
        System.out.println("Precio: " + cp(h));
    }

    public static double cp(int h) {
        double pc = 0;
        if (h <= 3) {
            pc = h * 20;
        } else if (h > 3 && h <= 24) {
            pc = (3 * 20) + ((h - 3) * 15);
            if (h == 24) {
                pc = 250;
            }
        } else if (h > 24) {
            pc = ((int) (h / 24)) * 250 + (h % 24 * 15);
        }
        return pc;
    }
}
