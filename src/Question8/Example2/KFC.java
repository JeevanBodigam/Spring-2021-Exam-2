/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class KFC extends KFCRecipe {

    @Override
    String burgerRecipe() {
        return "One Patty mayo and alpino";
    }

    @Override
    String nuggetsRecipe() {
       return "Chicken,oil,mayonose";
    }
    
    public String wingsRecipe(){
        return "Chicken wings,Cheese and Ketchup";
    }

    @Override
    public String toString() {
        return "KFC recipe is not known to anyone";
    }
    
   
    
}
