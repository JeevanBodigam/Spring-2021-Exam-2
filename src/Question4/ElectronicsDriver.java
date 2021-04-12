/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Jeevan Bodigam
 */
public class ElectronicsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Polymorphic substitution
        Electronics elec = new Mobile("One Plus Nord", true, "Mobile", 30000);

        // Late binding polymorphism
        System.out.println(elec.toString());

        Electronics electronicLaptop = new Laptop("Dell", true, "Laptops", 57000);

        // Late binding polymorphism
        System.out.println(electronicLaptop.toString());

    }

}
