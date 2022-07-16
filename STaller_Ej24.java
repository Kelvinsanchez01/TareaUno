/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

public class STaller_Ej24 {

    public static void main(String[] args) {
        int n = 78;
        int atc = 0;
        int cd = 0;
        atc = n - 1;
        while (atc > 1) {
            if (n % atc == 0) {
                cd++;
            }
            atc--;
        }
        if (cd == 0) {
            System.out.println("Primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
