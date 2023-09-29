package egar.domain.dictionary.entity;

import egar.domain.employee.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dictionary {
    public static List<Employee> employeesInformation(){
        List<Employee> employees = Stream.of(
                new Employee(0, "John1", "None1", "Doe", "60-80-03", 4221),
                new Employee(1, "John2", "None2", "Doe", "60-80-04", 4222),
                new Employee(2, "John3", "None3", "Doe", "60-80-05", 4223),
                new Employee(3, "John4", "None4", "Doe", "60-80-06", 4224),
                new Employee(4, "John5", "None5", "Doe", "60-80-07", 4225),
                new Employee(5, "John6", "None6", "Doe", "60-80-08", 4226),
                new Employee(6, "John7", "None7", "Doe", "60-80-09", 4227)
                ).collect(Collectors.toList());
        return employees;
    }
}
