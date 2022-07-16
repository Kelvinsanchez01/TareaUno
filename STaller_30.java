/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;


public class STaller_30 {
    
public static void main(String[] args) {
         String ingreso0 = "", ingreso1 = "", ingreso2 = "", ingreso3 = ""
              , ingreso4 = "", ingreso5 = "", ingreso6 = "";
        for (int indice = 0; indice <= 6; indice++) {
            for (int j = 0; j <= indice; j++) {
                if (indice == 0) {
                    ingreso0 = "|" + indice + "|" + j + "| ";
                } else if (indice == 1) {
                    ingreso1 += "|" + indice + "|" + j + "| ";
                } else if (indice == 2) {
                    ingreso2 += "|" + indice + "|" + j + "| ";
                } else if (indice == 3) {
                    ingreso3 += "|" + indice + "|" + j + "| ";
                } else if (indice == 4) {
                    ingreso4 += "|" + indice + "|" + j + "| ";
                } else if (indice == 5) {
                    ingreso5 += "|" + indice + "|" + j + "| ";
                } else if (indice == 6) {
                    ingreso6 += "|" + indice + "|" + j + "| ";
                }
            }

        }
        System.out.println(ingreso0);
        System.out.println(ingreso1);
        System.out.println(ingreso2);
        System.out.println(ingreso3);
        System.out.println(ingreso4);
        System.out.println(ingreso5);
        System.out.println(ingreso6);
    }
}
