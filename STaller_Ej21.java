/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej21 {
    
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mc, dsc = 0.020, tlp;
        System.out.print("Ingrese el monto de su compra : ");
        mc = input.nextDouble();
        input.nextLine();
        dsc = mc * 0.020;
        tlp= mc-dsc;      
        if (mc <= 999) {
            System.out.println("No tiene descuento");
            System.out.println("El total a pagar de su compra es : "+mc);
        } else if (mc >= 1000) {
            System.out.println("Su descuento  es de: "+dsc);
             System.out.println("El total a pagar de su compra es: "+tlp);
        }
    }
}
