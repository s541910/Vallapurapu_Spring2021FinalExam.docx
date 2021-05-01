/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author Ramu Vallapurapu
 */
public class DailyRoutine extends MyTest implements Sports {

    @Override
    void calculate(int a, int b) {
        int x = a + b;
        System.out.println("Sum: " + x);
    }

    @Override
    public void play() {
        System.out.println("Play Volley after java Exam.");
    }

}
