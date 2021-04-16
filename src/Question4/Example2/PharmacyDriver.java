/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class PharmacyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pharmacy phar = new Pharmacy("Appollo");
        System.out.println(phar);
        Pharmacy appo = new Apollo(36.5, "Appollo pharmacy"); //Polymorphic Substitution
        System.out.println(appo); //Late Binding Polymorphism
        Pharmacy med = new Medplus("Covid", "Medplus pharmacy");
        System.out.println(med); //Late Binding Polymorphism
    }

}
