package com.sriyanshsrivastava.spring.core.repo;

import com.sriyanshsrivastava.spring.core.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
