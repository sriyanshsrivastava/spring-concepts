package com.sriyanshsrivastava.ecom_proj.service;


import com.sriyanshsrivastava.ecom_proj.model.Product;
import com.sriyanshsrivastava.ecom_proj.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProduct() {
        return repo.findAll();
    }
}
