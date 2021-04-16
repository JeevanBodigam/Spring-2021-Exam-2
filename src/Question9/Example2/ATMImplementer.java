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
public class ATMImplementer implements ATM{

    @Override
    public boolean sameBank() {
        return ATM.super.sameBank();
    }

    @Override
    public String cashWithdrawal() {
       return "Can be withdrawan without any limits";
    }

    @Override
    public String cashDeposit() {
       return "Can deposit balance here upto 350000";
    }

    @Override
    public String toString() {
        return "ATMImplementer implements all methods of ATM class";
    }
    
    
    
    
    
}
