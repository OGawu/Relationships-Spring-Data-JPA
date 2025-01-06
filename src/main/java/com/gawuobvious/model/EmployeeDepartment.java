package com.gawuobvious.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class EmployeeDepartment {

    @Id
    @GeneratedValue
    private String departmentId;
    private String departmentName;
}
