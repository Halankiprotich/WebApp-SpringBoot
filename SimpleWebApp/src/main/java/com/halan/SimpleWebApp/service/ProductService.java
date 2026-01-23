package com.halan.SimpleWebApp.service;


import com.halan.SimpleWebApp.model.product;
import com.halan.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


//    List<product>  products= new ArrayList<>(Arrays.asList(
 //           new product (101,"iphone",8000),
 //           new product(102,"samsung", 5000),
//new product(103,"Tecno", 6777)));

    public List<product> getProducts(){
        return repo.findAll();
    }

    public product getProductById(int prodId) {

        return repo.findById(prodId).orElse(new product());
    }

    public void addProduct(product prod){
        repo.save(prod);
    }

    public void updateProduct(product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
