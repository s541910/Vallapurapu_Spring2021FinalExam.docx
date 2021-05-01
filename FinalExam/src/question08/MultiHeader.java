/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

/**
 *
 * @author Ramu Vallapurapu
 */
public class MultiHeader {

    static void myMethod() throws ArithmeticException, NumberFormatException {

        int a = 9;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        a = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");

    }

    public static void main(String args[]) {
        System.out.println("Answer for question08 : Ramu vallapurapu");
        try {
            myMethod();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
