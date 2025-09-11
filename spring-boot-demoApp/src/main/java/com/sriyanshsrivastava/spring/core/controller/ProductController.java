package com.sriyanshsrivastava.spring.core.controller;


import com.sriyanshsrivastava.spring.core.model.Product;
import com.sriyanshsrivastava.spring.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> products(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product product(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
//        System.out.println(product);
        service.addProduct(product);
        return product;
    }

    @PutMapping("/products/{prodId}")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void removeProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
