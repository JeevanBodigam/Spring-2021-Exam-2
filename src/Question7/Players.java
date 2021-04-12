/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Jeevan Bodigam
 */
public enum Players {

    CRICKET(11), FOOTBALL(7), TENNIS(2), VOLLEYBALL(6);

    private int noOfPlayer;

    private Players(int noOfPlayer) {
        this.noOfPlayer = noOfPlayer;
    }

    public int getNoOfPlayer() {
        return noOfPlayer;
    }

}
