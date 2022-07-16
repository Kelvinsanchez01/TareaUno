/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej11 {
    public static void main(String[] args) {
        int nmr=0, millares=0, centenas=0,decenas=0,unidades=0;
	Scanner escaner = new Scanner(System.in);
	System.out.println("Escribe un numero: ");
	nmr = escaner.nextInt();	
	millares=nmr/1000;
	centenas=(nmr-(millares*1000))/100;
	decenas=(nmr- (millares*1000 + centenas*100))/10;
	unidades=nmr-(millares*1000 + centenas*100 + decenas*10 );
	System.out.println("Los millares que contiene = "+ millares);
	System.out.println("Las centenas que contiene = "+ centenas);
	System.out.println("Las decenas que contiene = "+ decenas);
	System.out.println("Las unidades que contiene= "+ unidades);
    }
}
