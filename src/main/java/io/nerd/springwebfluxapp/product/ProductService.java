package io.nerd.springwebfluxapp.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product>findById(String id){
        return productRepository.findById(id);
    }

    public Mono<Product>findByName(String name){
        return productRepository.findByName(name);
    }
    public Flux<Product>findAll(){
        return productRepository.findAll();
    }

    public Mono<Product>insert(Product product){
        return productRepository.save(product);
    }

    public Mono<Void>deleteById(String id){
        return productRepository.deleteById(id);
    }

    public Mono<Product>update(Product product){
        return productRepository.save(product);
    }
}
