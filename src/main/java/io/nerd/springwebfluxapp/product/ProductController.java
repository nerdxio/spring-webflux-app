package io.nerd.springwebfluxapp.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{id}", produces = {"text/event-stream"})
    public Mono<Product> findById(@PathVariable String id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/" , produces = {"text/event-stream"})
    public Flux<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(value = "/name/{name}", produces = {"text/event-stream"})
    public Mono<Product> findByName(@PathVariable String name) {
        return productService.findByName(name);
    }

    @PostMapping(value = "/" , produces = {"text/event-stream"})
    public Mono<Product> insert(@RequestBody Product product) {
        return productService.insert(product);
    }

    @PutMapping(value = "/" , produces = {"text/event-stream"})
    public Mono<Product> update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping(value = "/" , produces = {"text/event-stream"})
    public Mono<Void> deleteById(@PathVariable String id) {
        return productService.deleteById(id);
    }


}
