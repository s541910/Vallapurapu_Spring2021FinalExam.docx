/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Ramu Vallapurapu
 */
public class CheckedExceptions {

    public void fileNotFoundException() {
        File file = new File("nofile.txt");
        try {

            FileInputStream sc1 = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            //Any file not found exceptions by the Scanner sc1 will be caught here
            System.out.println("File Not Found");

        }
    }

    public void classNotException() {
        try {

            Class.forName("ques06.UncheckedException");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found");
        }
    }

}
