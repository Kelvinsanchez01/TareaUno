/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nmr = 0;
        for (int indice = 1; indice <= 10; indice++) {
            for (int k = 1; k <= 12; k++) {
                nmr = indice * k;
                System.out.println(indice + "*" + k + "=" + nmr);
            }
        }
    }
}
