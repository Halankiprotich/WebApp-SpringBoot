package com.halan.SimpleWebApp.repository;

import com.halan.SimpleWebApp.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<product, Integer> {
}
