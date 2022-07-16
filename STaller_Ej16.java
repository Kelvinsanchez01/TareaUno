/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej16 {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0;
        double rs = 0.0, a = 0.0, b = 0.0, c = 0.0;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingresa la variable de A: ");
        a = ingresar.nextInt();
        System.out.println("Ingresa la variable de B: ");
        b = ingresar.nextInt();
        System.out.println("Ingresa la variable de C: ");
        c = ingresar.nextInt();
        rs = (-b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a);
        System.out.println(rs);
        System.out.println("Ingrese el primer numero: ");
        n1 = ingresar.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = ingresar.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = ingresar.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El primer numero: " + n1 + " es el mayor");
            if (n2 > n3) {
                System.out.println("El segundo numero: " + n2 + " es el segundo mayor");
                System.out.println("El tercer numero: " + n3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + n3 + " es el segundo mayor");
                System.out.println("El segundo numero: " + n2 + " es el menor");
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El segundo numero: " + n1 + " es el mayor");
            if (n1 > n3) {
                System.out.println("El primer numero: " + n1 + " es el segundo mayor");
                System.out.println("El tercer numero: " + n3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + n3 + " es el segundo mayor");
                System.out.println("El primer numero: " + n1 + " es el menor");
            }
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El tercer numero: " + n3 + " es el mayor");
            if (n1 > n2) {
                System.out.println("El primer numero: " + n1 + " es el segundo mayor");
                System.out.println("El segundo numero: " + n2 + " es el menor");
            } else {
                System.out.println("El segundo numero: " + n2 + " es el segundo mayor");
                System.out.println("El primer numero: " + n1 + " es el menor");
            }
        }
    }
}
