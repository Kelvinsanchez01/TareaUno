/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import javax.swing.JOptionPane;


public class STaller_Ej5 {
    public static void main(String[] args) {
     double resultado = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        
        resultado = (-b +(Math.sqrt(Math.pow(b, 2) + (4*a*c))))/(2*a);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}

