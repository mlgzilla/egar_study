package entity;

public class Person {
    String middleName;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Person(String middleName) {
        this.middleName = middleName;
    }
}
