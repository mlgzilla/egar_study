package egar;

import egar.domain.employee.EmployeeDao;
import egar.domain.employee.dto.EmployeeCriteria;
import egar.domain.employee.entity.EntityDB;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    static Integer getCodeDoc() {
        int max = 3, min = 1;
        return new Random().nextInt(max - min + 1) + min;
    }
}