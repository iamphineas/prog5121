/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;
import javax.swing.*;
/**
 *
 * @author PAUL
 */
public class Lecture10_bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
        double dblMintesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the mintues talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per mintue"));
        
        
        bills b = new bills(strName, dblMintesTalked , dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " + 
                b.getName().toUpperCase() + "\n" +
                "Total due: R " + b.getTotalBills());
    }
}
