import entity.Mechanic;
import entity.Report;
import enums.Speciality;
import enums.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

class MechanicTest {
    @Test
    void test1(){
        Mechanic mechanic = new Mechanic(1, "Jack", "Hugh", "Jackman", "60-80-03", 3987, 17, Speciality.Fabricator);
        Assertions.assertEquals(mechanic.getId(), 1);
        Assertions.assertEquals(mechanic.getFirstName(), "Jack");
        Assertions.assertEquals(mechanic.getMiddleName(), "Hugh");
        Assertions.assertEquals(mechanic.getSecondName(), "Jackman");
        Assertions.assertEquals(mechanic.getPhoneNumber(), "60-80-03");
        Assertions.assertEquals(mechanic.getCardNumber(), 3987);
        Assertions.assertEquals(mechanic.getBoxId(), 17);
        Assertions.assertEquals(mechanic.getSpeciality(), Speciality.Fabricator);
    }
    @Test
    void test2(){
        Mechanic mechanic = new Mechanic(1, "Jack", "Hugh", "Jackman", "60-80-03", 3987, 17, Speciality.Fabricator);
        Vector<Report> reports = new Vector<>();
        reports.add(new Report(0, "Fabricate fender", Status.Finished, "Fender was fabricated", 120));
        reports.add(new Report(1, "Fabricate trunk", Status.InProgress, "Fender is being fabricated", 60));
        mechanic.setReports(reports);
        Assertions.assertEquals(mechanic.getReports(), reports);
    }
}
