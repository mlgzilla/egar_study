import entity.Manager;
import entity.Report;
import enums.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

class ManagerTest {
    @Test
    void test1(){
        Manager manager = new Manager(2, "George", "W.", "Bush", "60-80-04", 911, "Department of defense");
        Assertions.assertEquals(manager.getId(), 2);
        Assertions.assertEquals(manager.getFirstName(), "George");
        Assertions.assertEquals(manager.getMiddleName(), "W.");
        Assertions.assertEquals(manager.getSecondName(), "Bush");
        Assertions.assertEquals(manager.getPhoneNumber(), "60-80-04");
        Assertions.assertEquals(manager.getCardNumber(), 911);
        Assertions.assertEquals(manager.getDepartment(), "Department of defense");
    }
    @Test
    void test2(){
        Manager manager = new Manager(2, "George", "W.", "Bush", "60-80-04", 911, "Department of defense");
        Vector<Report> reports = new Vector<>();
        reports.add(new Report(0, "Create marketing campaign", Status.Finished, "Marketing campaign is being deployed", 100));
        reports.add(new Report(1, "Fire employee Ben Laden", Status.InProgress, "Ben Laden is being located for notification of dismissal", 10));
        manager.setReports(reports);
        Assertions.assertEquals(manager.getReports(), reports);
    }
}
