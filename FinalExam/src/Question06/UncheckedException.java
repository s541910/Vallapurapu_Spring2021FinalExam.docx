/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Ramu Vallapurapu
 */
public class UncheckedException {

    int a = 0;
    int b = 0;
    String s = null;
    String s1 = null;

    public UncheckedException(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public void arithemeticException() {
        try {
            int output = a / b;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("Denominator shouldn't be zero");
        }
    }

    public void stringIndexOutOfBoundsException() {
        try {
            //String str="beginnersbook";
            System.out.println(s.length());
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(23));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

}
