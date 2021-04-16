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
public class Medplus extends Pharmacy {

    private String medicineName;

    public Medplus(String medicineName, String pharmaName) {
        super(pharmaName);
        this.medicineName = medicineName;
    }

    @Override
    public String toString() {
        return super.getPharmaName() + " has medicine " + medicineName;
    }

   
    

}
