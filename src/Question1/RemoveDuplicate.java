/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class RemoveDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> userArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            userArray.add(scan.nextInt());
        }
        removeDuplicate(userArray);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (Integer nmbr : list) {
            if (!(resultArray.contains(nmbr))) {
                resultArray.add(nmbr);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer distinct : resultArray) {
            System.out.print(distinct + " ");
        }
        System.out.println();
    }
}
