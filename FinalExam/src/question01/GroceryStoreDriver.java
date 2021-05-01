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
public class GroceryStoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 1: Ramu Vallapurapu");
        GroceryOrder g = new GroceryOrder();
        g.acceptCashPayment();
        g.acceptChequePayment();
        g.acceptOnlinePayment();
        g.getBeef();
        g.getChedderChesse();
    }

}
