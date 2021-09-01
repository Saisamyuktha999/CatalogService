package com.catelog.service;

import com.catelog.bean.Product;
import com.catelog.persistence.ProductDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface{
    @Autowired
    @Qualifier("productDao")
    ProductDaoInterface productDao;

    @Override
    public List<Product> allProducts() {
        return productDao.allProducts();
    }

    @Override
    public Product getProductByCode(String code) {
        return productDao.getProductByCode(code);
    }
}
