/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Scanner;

/**
 *
 * @author Ramu Vallapurapu
 */
public class randomarraynumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question07 : Ramu Vallapurapu");

        int[] randArray = new int[100];
        for (int i = 0; i < 100; i++) {
            randArray[i] = (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int temp = scanner.nextInt();
        // try catch block if user specifies wrong value
        try {
            System.out.println(randArray[temp - 1]);
        } catch (Exception e) {
            System.out.println("Out of Bounds.");

        }

    }

}
