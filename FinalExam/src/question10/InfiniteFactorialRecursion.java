/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Ramu Vallapurapu
 */
public class InfiniteFactorialRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 10: Ramu Vallapurapu");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = infiniteRecursionFactorial(num);
        System.out.println(num + "! = " + factorial);
        sc.close();
    }
    // example for infinite recursion

    public static long infiniteRecursionFactorial(int num) {
        return num * infiniteRecursionFactorial(num - 1);
    }

}
