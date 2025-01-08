package com.gawuobvious.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class EmployeeDepartment {

    @Id
    @GeneratedValue
    private String departmentId;
    private String departmentName;


    @OneToMany(mappedBy = "employeeDepartment")
    private List<Employee> employees;
}
