package com.halan.SimpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {

    private int prodId;
    private String prodName;
    private int price;
}
