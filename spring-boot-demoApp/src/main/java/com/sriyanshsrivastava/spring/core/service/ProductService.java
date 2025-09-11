package com.sriyanshsrivastava.spring.core.service;

import com.sriyanshsrivastava.spring.core.model.Product;
import com.sriyanshsrivastava.spring.core.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    List<Product> products  = new ArrayList<>(Arrays.asList(new Product(101,"apple",80000),
//                                            new Product(102,"smartphone",30000),
//                                            new Product(103,"microphone",10000)
//                                            ));

//    private int findProductIndex(int prodId){
//        int index = 0;
//        for(int i =0;i < products.size();i++){
//            if(products.get(i).getProdId()==prodId){
//                index=i;
//            }
//        }
//        return index;
//    }
//
//    public List<Product> getAllProducts(){
//        return products;
//    }
//
//    public Product getProductById(int prodId) {
//        return products.stream().filter(p -> p.getProdId()==prodId).findFirst().get();
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void updateProduct(Product product) {
//        int index = findProductIndex(product.getProdId());
//        products.set(index,product);
//
//    }
//
//    public void deleteProduct(int prodId) {
//        int index= findProductIndex(prodId);
//        products.remove(index);
//
//    }
    @Autowired
    ProductRepository repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }



}
