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
public class StudentWithoutEquals {

    private int id;
    private String name;

    public StudentWithoutEquals(int id, String name) {
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
        return "StudentWithoutEquals{" + "id=" + id + ", name=" + name + '}';
    }

}
