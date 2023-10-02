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
        List<EmployeeInformation> employees = Dictionary.employeesInformation();
        Map<Integer, EmployeeInformation> employeeMap = new HashMap<>();
        for (EmployeeInformation info : employees){
            employeeMap.put(info.getId(), info);
        }
        Assertions.assertEquals("60-80-05", employeeMap.get(2).getPhoneNumber());
    }
}