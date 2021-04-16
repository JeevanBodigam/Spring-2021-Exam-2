/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class ATMDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATMImplementer atmI = new ATMImplementer();
        System.out.println(atmI.cashWithdrawal());
        System.out.println(atmI.cashDeposit());
        System.out.println(atmI);
    }

}
