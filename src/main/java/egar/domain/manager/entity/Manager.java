package egar.domain.manager.entity;

import egar.domain.employee.entity.Employee;
import egar.domain.report.entity.Report;

import java.util.Vector;

public class Manager extends Employee {
    private String department;
    private Vector<Report> reports;

    public Vector<Report> getReports() {
        return reports;
    }

    public void setReports(Vector<Report> reports) {
        this.reports = reports;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String firstName, String middleName, String secondName, String phoneNumber, Integer cardNumber, String contractType, String department) {
        super(firstName, middleName, secondName, phoneNumber, cardNumber, contractType);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", middleName='" + this.getMiddleName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", cardNumber=" + this.getCardNumber() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
