package br.com.igor.p1.model.repository.Product;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.entity.Image;
import br.com.igor.p1.model.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setDescription(resultSet.getString("description"));
        product.setInventory_quantity(resultSet.getInt("inventory_quantity"));
        product.setUnity_value(resultSet.getFloat("unity_value"));
        product.setCreated_at(resultSet.getTimestamp("created_at"));
        product.setUpdate_at(resultSet.getTimestamp("updated_at"));

        return product;
    }
}
