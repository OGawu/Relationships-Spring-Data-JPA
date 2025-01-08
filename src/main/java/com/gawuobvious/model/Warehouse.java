package com.gawuobvious.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
public class Warehouse {

    @Id
    @GeneratedValue
    private String warehouseId;
    private String warehouseName;
    private String warehouseAddress;

    @ManyToMany(mappedBy = "warehouses")
    private List<Employee> employees;
}
