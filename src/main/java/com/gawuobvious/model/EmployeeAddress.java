package com.gawuobvious.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeAddress {

    @Id
    @GeneratedValue
    private String employeeAdressId;
    private String streetName;
    private String houseNumber;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
