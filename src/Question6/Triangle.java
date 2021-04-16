/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Jeevan Bodigam
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private boolean isFilled;
    private String triangleColor;

    public Triangle(double side1, double side2, double side3,
            boolean isFilled, String triangleColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isFilled = isFilled;
        this.triangleColor = triangleColor;
    }

    @Override
    double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    double area() {
        double pHaf = this.perimeter() / 2;
        return Math.sqrt(Math.abs(pHaf * (pHaf - side1)
                * (pHaf - side2) * (pHaf - side3)));
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (isFilled ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + triangleColor;
    }

}