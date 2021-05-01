/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Ramu Vallapurapu
 */
public class StudentDriver {

    public static void main(String[] args) {
        System.out.println("Answe for question 11: Ramu Vallapurapu");
        //Here in the main method we decalred four guitar object wheich later used for comparing
        //We can see that both g1,g4 object have same instance variable values.
        StudentWithoutEquals swoe = new StudentWithoutEquals(1, "WaterBottle");
        StudentWithoutEquals swoe1 = new StudentWithoutEquals(1, "WaterBottle");

        Student s1 = new Student(101, "Tom");

        Student s2 = new Student(104, "Jerry");
        Student s3 = new Student(105, "Ben10");

        Student s4 = new Student(101, "Tom");
        Student s5 = new Student(104, "Jerry");
        Student s6 = new Student(105, "Ben10");

        int a = 10;
        int b = 10;
        //we are just comapring integer values and if both values are same it will return true but it was differnt with objects
        System.out.println(a == b);
        System.out.println("***** Without equals method usage *******");
        System.out.println(swoe == swoe1);
        System.out.println(swoe.equals(swoe1));

        System.out.println("***** == usage *******");
        //here we are comapring different objects baed upon the reference location
        // == for object generally compares there reference location.
        // so if any two object variable refers to same location it return otherwise false.
        System.out.println(s1 == s4);
        System.out.println(s2 == s5);
        System.out.println(s3 == s6);
        System.out.println("***** equals method usage *******");
        //here compare the different Student class objects based upon their instance values values.
        //The output may be true false based upon the instance varibale values.
        //equals method all the instance variable of one object with corresponding instance of another class and if both are equals returns true
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s5));
        System.out.println(s3.equals(s6));

        System.out.println("***** hashcode method usage *******");
        //Here are the hashcode values of all the variable 
        //we should get s1,s2,s3 object hash code values as same because hash code of a object on instance variable value where s1,s2,s3 as same instance variable values
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println("***** hashcode comparing of s1 and s4 instance objects*********");
        //This should return true because s1,s4 has same instance variable values and hash code is generated based upon the them. so object hashcode should be  same
        System.out.println(s1.hashCode() == s4.hashCode());
        //This should return false because s1,s3 has same instance variable values and hash code is generated based upon the them. so object hashcode should be  not same
        System.out.println(s1.hashCode() == s3.hashCode());

        System.out.println("***** address of s1 and s4 *******");
        //we are also checked the address of g1,g4 to check whether there refer to same location 
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(Integer.toHexString(System.identityHashCode(s4)));

    }

}
