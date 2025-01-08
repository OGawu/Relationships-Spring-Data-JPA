package com.gawuobvious.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Getter
@Setter
@Entity
public class Employee {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String employeeId;

    private String employeeUserName;
    private String employeeFirstName;
    private String employeeLastName;
    private Integer employeeAge;


    @ElementCollection
    private List<String> roles;


    @OneToOne
    @JoinColumn(name = "employee_address_id")
    private EmployeeAddress employeeAddress;

    @ManyToOne
    @JoinColumn(name = "employeeDepartment_id")
    private EmployeeDepartment employeeDepartment;


    @ManyToMany
    @JoinTable(name = "employee_warehouse",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "warehouse_id"))
    private List<Warehouse> warehouses;


}
