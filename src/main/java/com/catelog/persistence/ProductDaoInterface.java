package com.catelog.persistence;

import com.catelog.bean.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDaoInterface {
    List<Product> allProducts();
    Product getProductByCode(String code);
}
