package egar.domain.employee;

import egar.domain.employee.entity.Employee;
import egar.exception.MyException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    @DisplayName("Тест карт")
    @Order(1)
    void cardTest(){
        Employee employee = new Employee(0, "John", "None", "Doe", "60-80-02", 4221);
        try {
            employee.checkCard();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
