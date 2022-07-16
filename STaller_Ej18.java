/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

public class STaller_Ej18 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        double imc, libras, estatura, kilos, metros;
        String clasificacion = "";
        System.out.print("Ingrese su peso en libras: ");
        libras = ingresar.nextDouble();
        ingresar.nextLine();
        System.out.print("Ingrese Su estatura en centimetros: ");
        estatura = ingresar.nextInt();
        ingresar.nextLine();
        metros = estatura * 0.01;
        kilos = libras * 0.453;
        System.out.println("Valor en KG es: " + kilos);
        imc = kilos / Math.pow(metros, 2);
        if (imc < 16) {
            clasificacion = "Criterio de ingreso";
        } else if (imc >= 16 && imc <= 16.9) {
            clasificacion = "Infrapeso";
        } else if (imc >= 17 && imc <= 18.4) {
            clasificacion = "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            clasificacion = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            clasificacion = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            clasificacion = "Obesidad pre-mórbida";
        } else if (imc >= 45) {
            clasificacion = "obesidad híper-mórbida.";
        }
        System.out.println("\nTu índice de masa corporal es (IMC): " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);

    }
}
