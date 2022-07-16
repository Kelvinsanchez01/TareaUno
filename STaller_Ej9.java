/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

public class STaller_Ej9 {

    public static boolean findParity(int binario) {
        binario = (binario & 0x0000FFFF) ^ (binario >> 16);
        binario = (binario & 0x000000FF) ^ (binario >> 8);
        binario = (binario & 0x0000000F) ^ (binario >> 4);
        binario = (binario & 0x00000003) ^ (binario >> 2);
        binario = (binario & 0x00000001) ^ (binario >> 1);
        return (binario & 1) == 1;
    }

    public static void main(String[] args) {
        int binario = 4540;
        System.out.println(binario + " cantidad en binario: " + Integer.toBinaryString(binario));
        if (findParity(binario)) {
            System.out.println(" contiene bits impres " + binario);
        } else {
            System.out.println(" contiene bits paraes " + binario);
        }
    }
}
