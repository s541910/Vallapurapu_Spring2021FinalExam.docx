/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Square extends GeometricObject implements Colorable {

    public Square(double area) {
        super(area);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        this.howToColor();
        return ("The area is: " + this.getArea() + "\n");

    }

}
