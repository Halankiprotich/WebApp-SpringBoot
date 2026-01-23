package com.halan.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

}
