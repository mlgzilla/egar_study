package egar.domain.employee.dto;

import java.util.List;

public class EmployeeCriteria {
    private Integer id;
    private String firstName;
    private String middleName;
    private String secondName;
    private String phoneNumber;
    private Integer cardNumber;
    private String contractType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public EmployeeCriteria(Integer id, String firstName, String middleName, String secondName, String phoneNumber, Integer cardNumber, String contractType) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.contractType = contractType;
    }

    public EmployeeCriteria() {
    }
}
