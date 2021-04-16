/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.Example1;

import Question9.Example1.RetailShop;

/**
 *
 * @author Jeevan Bodigam
 */
public class Retail implements RetailShop {

    private double monthlyIncome;

    public Retail(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    @Override
    public double calculateSales() {
        return 12 * monthlyRevenue();
        //To change body of generated methods, choose Tools | Templates.
    }

    public double monthlyRevenue() {
        return this.monthlyIncome * (0.8);
    }

    @Override
    public String toString() {
        return "Retail Shop \n"
                + "The monthly income is " + monthlyIncome + "\n"
                + "The Monthly revenue is " + monthlyRevenue() + "\n"
                + "The Total Sales are " + calculateSales();
    }

}
