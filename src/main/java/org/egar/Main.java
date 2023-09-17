package org.egar;

import entity.Employee;
import entity.Manager;
import entity.Mechanic;
import enums.Speciality;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(0, "John", "None", "Doe", "60-80-02", 4221);
        Mechanic mechanic = new Mechanic(1, "Jack", "Hugh", "Jackman", "60-80-03", 3987, 17, Speciality.Fabricator);
        Manager manager = new Manager(2, "George", "W.", "Bush", "60-80-04", 911, "Department of defense");
        System.out.println(employee);
        System.out.println(mechanic);
        System.out.println(manager);
    }
}