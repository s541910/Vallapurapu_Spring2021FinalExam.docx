package question02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ramu Vallapurapu
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 02: Ramu Vallapurapu");
        Square s1 = new Square(4);
        Square s2 = new Square(9);
        Square s3 = new Square(16);
        Square s4 = new Square(25);
        Square s5 = new Square(36);

        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = s1;
        objects[1] = s2;
        objects[2] = s3;
        objects[3] = s4;
        objects[4] = s5;

        for (GeometricObject obj : objects) {
            obj.getArea();
            System.out.println(obj.toString());
        }
    }

}
