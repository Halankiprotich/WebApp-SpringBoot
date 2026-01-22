package com.halan.SimpleWebApp.service;


import com.halan.SimpleWebApp.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<product>  products= new ArrayList<>(Arrays.asList(
            new product (101,"iphone",8000),
            new product(102,"samsung", 5000),
            new product(103,"Tecno", 6777)));

    public List<product> getProducts(){
        return products;
    }

    public product getProductById(int proId) {

        return products.stream()
                .filter(product -> product.getProdId() == proId)
                .findFirst().orElse(new product (100,"No Item", 0));
    }

    public void addProduct(product prod){
        products.add(prod);
    }

    public void updateProduct(product prod) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prod.getProdId())
                index=i;
        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prodId)
                index=i;
        products.remove(index);
    }
}
