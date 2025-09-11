package com.sriyanshsrivastava.ecom_proj.repo;

import com.sriyanshsrivastava.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
