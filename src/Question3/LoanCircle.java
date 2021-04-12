/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jeevan Bodigam
 */
public class LoanCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Object> arrayOfObjects = new ArrayList<>();

        Loan loanObject = new Loan("Vidya", 120000, 15);
        Circle circleObject = new Circle(12, true, false);
        String stringObj = "Jeevan";
        Date dateObj = new Date();

        arrayOfObjects.add(loanObject);
        arrayOfObjects.add(circleObject);
        arrayOfObjects.add(stringObj);
        arrayOfObjects.add(dateObj);

        for (Object LCSD : arrayOfObjects) {
            System.out.println(LCSD);
        }
    }

}
