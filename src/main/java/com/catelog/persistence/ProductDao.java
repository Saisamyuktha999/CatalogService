package com.catelog.persistence;

import com.catelog.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDao implements ProductDaoInterface{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> allProducts() {
        List<Product> allProducts = new ArrayList<>();
        allProducts.addAll(jdbcTemplate.query("SELECT * FROM PRODUCT", new ProductMapper()));
        return allProducts;
    }

    @Override
    public Product getProductByCode(String code) {
        return jdbcTemplate.queryForObject("SELECT * FROM PRODUCT WHERE CODE=?", new ProductMapper(), code);
    }
}
