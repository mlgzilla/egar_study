package egar.domain.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NamedQuery(name = "search", query = "SELECT p FROM EntityDB p " +
        "WHERE (:id is null OR p.id = :id) " +
        "AND (:firstName is null OR p.firstName = :firstName) " +
        "AND (:middleName is null OR p.middleName = :middleName) " +
        "AND (:secondName is null OR p.secondName = :secondName) " +
        "AND (:phoneNumber is null OR p.phoneNumber = :phoneNumber) " +
        "AND (:cardNumber is null OR p.cardNumber = :cardNumber) " +
        "AND (:contractType is null OR p.contractType = :contractType)")
public class EntityDB {
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

    public EntityDB(String firstName, String middleName, String secondName, String phoneNumber, Integer cardNumber, String contractType) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.contractType = contractType;
    }


    public EntityDB() {
    }
}
