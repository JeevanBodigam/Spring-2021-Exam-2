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
public class Mobile extends Electronics {

    private String itemName;
    private boolean handheld;

    public Mobile(String itemName, boolean handheld,
            String category, double price) {
        super(category, price);
        this.itemName = itemName;
        this.handheld = handheld;
    }

    // Overriding method totring() where there is an 
    // implementation in parent class
    @Override
    public String toString() {
        System.out.println("Inside mobile subclass");
        return super.toString() + "\nItem Name is " + itemName
                + " and is a handheld device = " + handheld;
    }

}
