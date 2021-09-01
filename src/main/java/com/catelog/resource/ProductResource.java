package com.catelog.resource;

import com.catelog.bean.Product;
import com.catelog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    ProductService productService;

    @GetMapping(produces = "Application/json")
    public List<Product> getAllProducts()
    {
        return productService.allProducts();
    }

    @GetMapping(path = "/code/{code}", produces = "Application/json")
    public Product getProductByCode(@PathVariable(value = "code") String code)
    {
        Product product = productService.getProductByCode(code);
        return product;
    }
}
