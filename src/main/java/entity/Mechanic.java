package entity;

import enums.Speciality;

import java.util.Vector;

public class Mechanic extends Employee {
    private int boxId;
    private Speciality speciality;

    private Vector<Report> reports;

    public Vector<Report> getReports() {
        return reports;
    }

    public void setReports(Vector<Report> reports) {
        this.reports = reports;
    }

    public int getBoxId() {
        return boxId;
    }

    public void setBoxId(int boxId) {
        this.boxId = boxId;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Mechanic(int id, String firstName, String middleName, String secondName, String phoneNumber, int cardNumber, int boxId, Speciality speciality) {
        super(id, firstName, middleName, secondName, phoneNumber, cardNumber);
        this.boxId = boxId;
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
                ", boxId=" + boxId +
                ", speciality=" + speciality +
                '}';
    }
}
