package com.gawuobvious.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue
    private String productId;
    private String productCode;
    private String productName;
    private String productDescription;


}
