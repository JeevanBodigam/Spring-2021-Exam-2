/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class Electronics {

    private String category;
    private double price;

    public Electronics(String category, double price) {
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("Inside parent Electronics toString() method");
        return "Category is " + category + " and price is " + price;
    }
}
