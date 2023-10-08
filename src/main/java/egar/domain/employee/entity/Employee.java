package egar.domain.employee.entity;

import egar.domain.person.entity.Person;
import egar.exception.MyException;

public class Employee extends Person {
    private int id;
    private int cardNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void checkCard() throws MyException {
        if(this.cardNumber > 2){
            System.out.println("Card is good");
        }
        else {
            throw new MyException("Card is bad");
        }
    }

    public Employee(int id, String firstName, String middleName, String secondName, String phoneNumber, int cardNumber) {
        super(firstName, middleName, secondName, phoneNumber);
        this.id = id;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + this.getFirstName() + '\'' +
                ", middleName='" + this.getMiddleName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
