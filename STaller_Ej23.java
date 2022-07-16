/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;


public class STaller_Ej23 {
    public static void main(String[] args) {
        int numero=0, invalido=0, auxiliar=0, digito=0;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero =ingresar.nextInt(); 
        auxiliar = numero;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            invalido = invalido * 10 + digito;
            auxiliar = auxiliar / 10;
        }
        if (numero == invalido) {
            System.out.println("El numero ingresado es capicuo");
        } else {
            System.out.println("El numero  ingresado no es capicuo");
        }
    }
}

