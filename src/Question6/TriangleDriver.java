/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        double side1 = 0, side2 = 0, side3 = 0;
        do {
            flag = false;
            System.out.print("Enter side1 of triangle: ");
            side1 = sc.nextDouble();
            System.out.print("Enter side2 of triangle: ");
            side2 = sc.nextDouble();
            System.out.print("Enter side3 of triangle: ");
            side3 = sc.nextDouble();
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
                System.out.println("The sum of 2 sides should be greater than "
                        + "the third side");
                flag = true;
            }
        } while (flag == true);
        Triangle triangle = new Triangle(side1, side2, side3, true, "Red");

        System.out.println(triangle);

    }
}
