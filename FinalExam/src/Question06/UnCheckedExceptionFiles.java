/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ramu Vallapurapu
 */
public class UnCheckedExceptionFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question06: Ramu Vallapurapu");
        try {
            FileReader file = new FileReader("pom.xml");

            file = null;

            file.read();
        } catch (IOException e) {
            //Alternate logic
            e.printStackTrace();
        }
    }

}
