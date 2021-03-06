package br.com.igor.p1.controller;

import br.com.igor.p1.model.entity.Product;
import br.com.igor.p1.model.repository.Product.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        productRepository = new ProductRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Product insert(@RequestBody Product product) throws Exception {
        return productRepository.insert(product);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Product> search(@PathVariable Integer id) throws Exception {
        return productRepository.search(id);
    }
}

