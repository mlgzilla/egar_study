package egar;

import egar.domain.employee.entity.Employee;
import egar.domain.manager.entity.Manager;
import egar.domain.mechanic.entity.Mechanic;
import egar.enums.Speciality;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(0, "John", "None", "Doe", "60-80-02", 4221);
        Mechanic mechanic = new Mechanic(1, "Jack", "Hugh", "Jackman", "60-80-03", 3987, 17, Speciality.Fabricator);
        Manager manager = new Manager(2, "George", "W.", "Bush", "60-80-04", 911, "Department of defense");
        System.out.println(employee);
        System.out.println(mechanic);
        System.out.println(manager);

        HashMap<String, String> map = new HashMap<String, String>(){{
            put("one", "odin");
            put("two", "dva");
        }};
    }
}