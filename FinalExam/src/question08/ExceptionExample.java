/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ExceptionExample {

    static void MethodWithMultipleExc() throws IOException, ArrayIndexOutOfBoundsException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence");
        String sentence = reader.readLine();

        System.out.println("Orignal Sentence : " + sentence);

        String arr[] = sentence.split(" ");
        System.out.println("Result of the Sentence");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 2) {

                System.out.print(arr[i].charAt(2));
                System.out.println();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question08 : Ramu Vallapurapu");
        // TODO code application logic here
        try {
            MethodWithMultipleExc();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

}
