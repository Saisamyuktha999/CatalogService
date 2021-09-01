package com.catelog.persistence;

import com.catelog.bean.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Product(resultSet.getLong("id"),resultSet.getString("code"),resultSet.getString("name"),resultSet.getString("description"),resultSet.getDouble("price"));
    }
}
