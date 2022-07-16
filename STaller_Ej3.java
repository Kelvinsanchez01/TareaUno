/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;


public class STaller_Ej3 {
    public static void main(String[] args) {
        int r1 = 0;
        int r2 = 0;
        int a = 96;
        int b = 21;
        int c = 55;
        r1 = (a + (b / c)) / ((a / b) + c);
        r2 = (a / (a + b)) / (a / (a - b));

        System.out.println( "El primer resultado es: " + r1
                         + " \n El segundo resultado es: " + r2);
    }
}
