/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Ramu Vallapurapu
 */
public class BasicCastingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question04: Ramu Vallapurapu");
        //Implicit Casting
        int num = 10;
        double d = num;
        System.out.println("Implicit Casting: Int to double = " + d);

        //Explicit Casting
        int x = (int) 15.3;
        System.out.println("Explicit Casting: Double to int = " + x);

    }

}
