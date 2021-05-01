/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.io.FileNotFoundException;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, StringIndexOutOfBoundsException, FileNotFoundException, ClassNotFoundException {
        System.out.println("Answer for question 09: Ramu Vallapurapu");
        // TODO code application logic here
        Checked e = new Checked();
        e.fileNotFound();
        e.classNotException();
        Unchecked e2 = new Unchecked(30, 0, "Final Exam");
        e2.arithmetic();
        e2.stringIndexOutOfBound();
    }

}
