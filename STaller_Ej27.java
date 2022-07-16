/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

public class STaller_Ej27 {

    public static void main(String[] args) {
        String n1 = "6205";
        String n2 = "5502";
        String nc = "";
        String nc2 = "";
        int nci = 0, nci2 = 0;
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != '0') {
                nc = nc + n1.charAt(i);
            }
        }
        for (int i = 0; i < n2.length(); i++) {
            if (n2.charAt(i) != '0') {
                nc2 = nc2 + n2.charAt(i);
            }
        }
        nci = Integer.parseInt(nc);
        nci2 = Integer.parseInt(nc2);
        if (nci > nci2) {
            System.out.println("EL mayor es: " + nci);
            System.out.println("EL menor es: " + nci2);
        } else {
            System.out.println("EL mayor es: " + nci2);
            System.out.println("EL menor es: " + nci);
        }
    }
}
