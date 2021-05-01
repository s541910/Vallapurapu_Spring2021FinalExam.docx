/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        // this method return hascode value  of a class based upon the instance variables value.
        //this method is also used to compare different object of same class type based upon their instance variable value
        // the hascode value of two class will only be equal if all instance variable values of one class is equal to all th instance variable values  of comparing object. 
        int hash = 7;
        //Because model attribyte is string it generates a hashcode to it and add to hash value.
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        //after hash value of complete class.
        return hash;
    }

    @Override
    //Here I have declared equals method which is used to compares parameter passed object with calling object and compares based upon all the instance variable s1,s4 both the classes .
    //since Object obj is super class for all the classes we can declare it in parameter where passed instance implicity converted Object type
    //This method return boolean value true  if every instance attribute value are equal in both the instances.
    public boolean equals(Object obj) {
        // checking if both the object references are 
        // referring to the same object.
        if (this == obj) {
            return true;
        }
        // it checks if the argument is of the 
        // type Student by comparing the classes 
        // of the passed argument and this object.
        if (obj == null) {
            return false;
        }
        //comparing class cast if both the class class cast is different there we can also say both the classes are different so it return false
        if (getClass() != obj.getClass()) {
            return false;
        }
        //converting obj variable to Student class which is example os down casting.
        final Student other = (Student) obj;
        //comparing first instance attribute id of both the objects if not equal it directly return false.
        if (this.id != other.id) {
            return false;
        }
        //comparing second instance attribute name of both the objects if not equal it directly return false.
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        //this stage reacher only after all the instance variable are equals .so it returns true .
        return true;
    }

}
