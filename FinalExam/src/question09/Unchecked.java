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
public class Unchecked {

    int a = 0;
    int b = 0;
    String s = null;

    public Unchecked(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public void arithmetic() throws ArithmeticException {

        int output = a / b;
        System.out.print("Result: " + output);

    }

    public void stringIndexOutOfBound() throws StringIndexOutOfBoundsException {

        //String str="beginnersbook";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(23));

    }
}
