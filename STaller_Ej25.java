/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.InputMismatchException;
import java.util.Scanner;


public class STaller_Ej25 {
    
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.print("Indica el numero a calcular su factorial: ");
        int vc = 0;
        while (vc < 1) {
            try {
                vc = ingresar.nextInt();
                if (vc < 1) {
                    System.out.println("El valor tiene que ser superior a 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor tiene que ser numerico...");
                ingresar.nextLine();
            }
        }
        long factorial = 1L;
        for (int i = vc; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es " + factorial);
    }
}
