package com.sriyanshsrivastava.ecom_proj.controller;

import com.sriyanshsrivastava.ecom_proj.model.Product;
import com.sriyanshsrivastava.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "hello world";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProduct();
    }
}
