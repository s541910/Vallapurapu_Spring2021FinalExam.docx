/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;

/**
 *
 * @author Ramu Vallapurapu
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question12: Ramu Vallapurapu");
        ArrayList<Employee> employee = new ArrayList<Employee>();

        Employee e1 = new Employee(37, "David Copperfield", 10000);
        employee.add(e1);

        Employee e2 = new Employee(17, "Diego Maradonna", 60000);
        employee.add(e2);

        Employee e3 = new Employee(135, "Ulrich Neilson", 15000);
        employee.add(e3);

        Employee e4 = new Employee(55, "Martha Stweart", 12000);
        employee.add(e4);

        Employee e5 = new Employee(22, "Lucifer Morningstar", 55000);
        employee.add(e5);
        System.out.println("Default List");
        for (Employee item : employee) {
            System.out.println(item.toString());
        }

        System.out.println("--------------------------------");
        sort(employee);

        System.out.println("Sorting by empID");
        for (Employee item : employee) {
            System.out.println(item.toString());
        }
        System.out.println("--------------------------------");
        System.out.println("Sorting by Salary");
        sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.empSalary, e2.empSalary);
            }
        });
        for (Employee item : employee) {
            System.out.println(item.toString());
        }
        System.out.println("--------------------------------");

        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } else {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                }
            }
        });
        System.out.println("Sorting by Employee Name:");
        for (Employee item : employee) {
            System.out.println(item.toString());
        }
        System.out.println("--------------------------------");

    }
}
