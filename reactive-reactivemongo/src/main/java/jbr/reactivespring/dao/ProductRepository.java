package jbr.reactivespring.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import jbr.reactivespring.model.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
