import entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void test1(){
        Employee employee = new Employee(0, "John", "None", "Doe", "60-80-02", 4221);
        Assertions.assertEquals(employee.getId(), 0);
        Assertions.assertEquals(employee.getFirstName(), "John");
        Assertions.assertEquals(employee.getMiddleName(), "None");
        Assertions.assertEquals(employee.getSecondName(), "Doe");
        Assertions.assertEquals(employee.getPhoneNumber(), "60-80-02");
        Assertions.assertEquals(employee.getCardNumber(), 4221);
    }
}
