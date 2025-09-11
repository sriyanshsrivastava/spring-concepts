package com.sriyanshsrivastava.spring.core.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Product {
    private int prodId;
    private String prodName;
    private int prodPrice;
}
