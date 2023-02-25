package io.nerd.springwebfluxapp.config;

import io.nerd.springwebfluxapp.product.Product;
import io.nerd.springwebfluxapp.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    final ProductService productService;

    public DataLoader(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
      //  productService.insert(new Product("product 1",324.3,"category1"));

    }
}
