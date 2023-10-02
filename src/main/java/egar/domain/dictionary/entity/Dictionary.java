package egar.domain.dictionary.entity;

import egar.domain.employee.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dictionary {
    public static List<EmployeeInformation> employeesInformation(){
        List<EmployeeInformation> employees = Stream.of(
                new EmployeeInformation(0, "60-80-03"),
                new EmployeeInformation(1, "60-80-04"),
                new EmployeeInformation(2, "60-80-05"),
                new EmployeeInformation(3, "60-80-06"),
                new EmployeeInformation(4, "60-80-07"),
                new EmployeeInformation(5, "60-80-08"),
                new EmployeeInformation(6, "60-80-09")
                ).collect(Collectors.toList());
        return employees;
    }
}
