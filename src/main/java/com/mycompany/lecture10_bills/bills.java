/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture10_bills;

/**
 *
 * @author PAUL
 */
public class bills {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    public bills (String strName, double dblCostPerMinute, double dblMinutesTalked){
        strCustomer = strName;
        dblMinutes = dblMinutesTalked;
        dblCost = dblCostPerMinute;
        
        
    }
    public String getName(){
        return strCustomer;
    }
    public double getTotalBills(){
        return(dblMinutes * dblCost);
    }
}
