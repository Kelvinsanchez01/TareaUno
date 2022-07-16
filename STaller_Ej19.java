/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class STaller_Ej19 {
     public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014,1,1);
        int mes = date.getMonthValue(), dia = date.getDayOfMonth();
        int mesn, diaig;        
        mesn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes:"));
        diaig = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia:"));       
        LocalDate dateIn = LocalDate.of(2014, mesn, diaig);        
        Period periodo = Period.between(date, dateIn);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();       
        System.out.println(date+"\n"+dateIn);
        System.out.println("Han trasncurrido: "+meses+" meses y "+dias+" dias");
    }    
}

