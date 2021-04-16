/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7.Example2;

import Question7.Example2.Players;

/**
 *
 * @author Jeevan Bodigam
 */
public class PlayerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Number of Players in "
                + Players.CRICKET + " are " + Players.CRICKET.getNoOfPlayer());
        System.out.println("The Number of Players in "
                + Players.TENNIS + " are " + Players.TENNIS.getNoOfPlayer());
        System.out.println("The Number of Players in "
                + Players.VOLLEYBALL + " are " + Players.VOLLEYBALL.getNoOfPlayer());
        System.out.println("The Number of Players in "
                + Players.FOOTBALL + " are " + Players.FOOTBALL.getNoOfPlayer());

        System.out.println("A school is required to"
                + " take the following number of students for all games!!");
        System.out.println(
                Players.valueOf("CRICKET").getNoOfPlayer()
                + Players.valueOf("VOLLEYBALL").getNoOfPlayer()
                + Players.valueOf("TENNIS").getNoOfPlayer()
                + Players.valueOf("FOOTBALL").getNoOfPlayer()
        );
    }

}
