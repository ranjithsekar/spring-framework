package jbr.reactivespring.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jbr.reactivespring.dao.ProductRepository;
import jbr.reactivespring.model.Product;
import jbr.reactivespring.model.ProductEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
@RequestMapping("products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping("all")
  public Flux<Product> getAll() {
    return productRepository.findAll();
  }

  @GetMapping("product/{id}")
  public Mono<Product> getById(@PathVariable("id") String prodId) {
    return productRepository.findById(prodId);
  }

  @GetMapping(value = "/{id}/streams", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<ProductEvent> getStreams(@PathVariable("id") String prodId) {

    return productRepository.findById(prodId)
        .flatMapMany(prod ->
          {
            Flux<Long> delay = Flux.interval(Duration.ofSeconds(3));

            Flux<ProductEvent> prodEvent = Flux.fromStream(Stream.generate(() -> new ProductEvent(prod, new Date())));

            return Flux.zip(delay, prodEvent)
                .map(Tuple2::getT2);
          });
  }
}
