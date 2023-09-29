package egar.domain.dictionary.entity;

import egar.domain.employee.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    @Test
    void dictionaryTest1(){
        List<Employee> employees = Dictionary.employeesInformation();
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees){
            employeeMap.put(employee.getId(), employee);
        }
        Assertions.assertEquals("John3", employeeMap.get(2).getFirstName());
    }
}