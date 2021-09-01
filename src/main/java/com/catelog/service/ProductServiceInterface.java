package com.catelog.service;

import com.catelog.bean.Product;

import java.util.List;

public interface ProductServiceInterface {
    List<Product> allProducts();
    Product getProductByCode(String code);
}
