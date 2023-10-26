package egar;

import egar.domain.employee.EmployeeDao;
import egar.domain.employee.dto.EmployeeCriteria;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EmployeeCriteria employee = new EmployeeCriteria(3, "John", "None", "Doe", "60-80-02", 4221, "temp");
        EmployeeDao employeeDao = new EmployeeDao();

    }

    static Integer getCodeDoc() {
        int max = 3, min = 1;
        return new Random().nextInt(max - min + 1) + min;
    }
}