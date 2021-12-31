package com.aos.microservisesapplication.controller;

import com.aos.microservisesapplication.model.Product;
import com.aos.microservisesapplication.repository.ProductRepository;
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
