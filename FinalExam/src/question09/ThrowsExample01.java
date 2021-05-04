/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ThrowsExample01 {

    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 09 : Ramu Vallapurau");
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
