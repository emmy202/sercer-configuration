package com.aos.productservices.controller;



import com.aos.productservices.model.Product;
import com.aos.productservices.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

   private final ProductRepository productRepository;

    @GetMapping
    @ResponseStatus( HttpStatus.OK)
    public List<Product> findAll(){
     return (List<Product>) productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
           productRepository.save(product);
    }
}
