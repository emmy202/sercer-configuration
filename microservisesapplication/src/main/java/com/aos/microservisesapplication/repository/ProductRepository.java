package com.aos.microservisesapplication.repository;

import com.aos.microservisesapplication.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
