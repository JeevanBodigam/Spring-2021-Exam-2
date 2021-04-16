/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Example1;

import Question4.Example1.Electronics;

/**
 *
 * @author Jeevan Bodigam
 */
public class Laptop extends Electronics {
    // Overriding method totring() where there is an 
    // implementation in parent class

    private String brand;
    private boolean touch;

    public Laptop(String brand, boolean touch, String category, double price) {
        super(category, price);
        this.brand = brand;
        this.touch = touch;
    }

    @Override
    public String toString() {
        System.out.println("Inside laptop child class");
        return "Laptop{" + "brand= " + brand + ", touch=" + touch + '}';
    }

}
