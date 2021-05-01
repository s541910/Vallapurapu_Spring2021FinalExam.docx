/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author Ramu Vallapurapu
 */
public class GroceryOrder implements GroceryStorePayments, MexicanFood {

    @Override
    public void acceptOnlinePayment() {
        System.out.println("Thanks for Paying through Online");
    }

    @Override
    public void acceptChequePayment() {
        System.out.println("Thanks for Paying through Cheque");
    }

    @Override
    public void acceptCashPayment() {
        System.out.println("Thanks for Paying through cash");
    }

    @Override
    public void getBeef() {
        System.out.println("Thanks for ordering Beef");
    }

    @Override
    public void getChedderChesse() {
        System.out.println("Thanks for ordering Chedder Cheese");
    }

}
