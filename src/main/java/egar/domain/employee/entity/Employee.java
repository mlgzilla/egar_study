package egar.domain.employee.entity;

import egar.exception.MyException;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NamedQuery(name = "search", query = "SELECT p FROM Employee p " +
        "WHERE (:id is null OR p.id = :id) " +
        "AND (:firstName is null OR p.firstName = :firstName) " +
        "AND (:middleName is null OR p.middleName = :middleName) " +
        "AND (:secondName is null OR p.secondName = :secondName) " +
        "AND (:phoneNumber is null OR p.phoneNumber = :phoneNumber) " +
        "AND (:cardNumber is null OR p.cardNumber = :cardNumber) " +
        "AND (:contractType is null OR p.contractType = :contractType)")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "card_number")
    private Integer cardNumber;
    @Column(name = "contract_type")
    private String contractType;

    public void checkCard() throws MyException {
        if(this.cardNumber > 2){
            System.out.println("Card is good");
        }
        else {
            throw new MyException("Card is bad");
        }
    }

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

    public Employee(String firstName, String middleName, String secondName, String phoneNumber, Integer cardNumber, String contractType) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.contractType = contractType;
    }

    public Employee() {
    }
}
