/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Jeevan Bodigam
 */
public class Circle {
    private double radius;
    private boolean inCircle;
    private boolean exCircle;

    public Circle(double radius, boolean inCircle,boolean exCircle) {
        this.radius = radius;
        this.inCircle = inCircle;
        this.exCircle = exCircle;
    }

    @Override
    public String toString() {
        return "Circle has "+ radius+ " and is it inCircle? "+ 
                inCircle  + " and Is it ExCircle? "+ exCircle;
    }
    
    
}
