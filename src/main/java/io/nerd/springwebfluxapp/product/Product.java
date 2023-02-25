package io.nerd.springwebfluxapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Product {
    @Id
    private String id;
    private String name;

    private double price;

    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
