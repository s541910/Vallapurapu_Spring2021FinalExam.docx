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
public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Answer for question 10: Ramu Vallapurapu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        long factorial = calcFactorial(num);
        System.out.println(num + "! = " + factorial);
        sc.close();
    }

    public static long calcFactorial(int num) {
        if (num >= 1) {
            return num * calcFactorial(num - 1);
        } else {
            return 1;
        }
    }
}
