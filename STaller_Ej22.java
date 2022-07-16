/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.io.IOException;
import java.util.Scanner;


public class STaller_Ej22 {
    
public static void main(String[] args) throws IOException {
        Scanner ingresar = new Scanner(System.in);
        int nmr;
        int contador;
        char car;
        do {
            System.out.print("Ingrese un numero: ");
            nmr = ingresar.nextInt();
            contador = 0;    
            while (nmr != 0) {             
                nmr = nmr / 10;         
                contador++;          
            }
            System.out.println("las cifras son: " + contador );
            System.out.print("¿Quiere continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}

