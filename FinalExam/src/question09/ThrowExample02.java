/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ThrowExample02 {

    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 09: Ramu Vallapurapu");
        // TODO code application logic here
        divideByZero();
    }

}
