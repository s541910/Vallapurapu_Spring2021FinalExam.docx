/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Checked {

    public void fileNotFound() throws FileNotFoundException {
        File file = new File("nofile.txt");
        FileInputStream sc1 = new FileInputStream(file);
        System.out.println("File Not Found");

    }

    public void classNotException() throws ClassNotFoundException {

        Class.forName("ques09.Unchecked");

    }
}
