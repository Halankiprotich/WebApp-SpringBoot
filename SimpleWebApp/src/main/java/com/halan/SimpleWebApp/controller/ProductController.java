package com.halan.SimpleWebApp.controller;

import com.halan.SimpleWebApp.model.product;
import com.halan.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<product> getProducts(){
        return service.getProducts();

    }
    @GetMapping("/products/{proId}")
    public product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
}
