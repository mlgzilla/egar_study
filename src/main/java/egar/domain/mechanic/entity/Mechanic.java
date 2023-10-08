package egar.domain.mechanic.entity;

import egar.domain.employee.entity.Employee;
import egar.domain.report.entity.Report;
import egar.enums.Speciality;

import java.util.Vector;

public class Mechanic extends Employee {
    private int pitBoxId;
    private Speciality speciality;
    private Vector<Report> reports;

    public Vector<Report> getReports() {
        return reports;
    }

    public void setReports(Vector<Report> reports) {
        this.reports = reports;
    }

    public int getPitBoxId() {
        return pitBoxId;
    }

    public void setPitBoxId(int pitBoxId) {
        this.pitBoxId = pitBoxId;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Mechanic(int id, String firstName, String middleName, String secondName, String phoneNumber, int cardNumber, int pitBoxId, Speciality speciality) {
        super(id, firstName, middleName, secondName, phoneNumber, cardNumber);
        this.pitBoxId = pitBoxId;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", middleName='" + this.getMiddleName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", cardNumber=" + this.getCardNumber() +
                ", boxId=" + pitBoxId +
                ", speciality=" + speciality +
                '}';
    }
}
