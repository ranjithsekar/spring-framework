package jbr.reactivespring;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jbr.reactivespring.dao.ProductRepository;
import jbr.reactivespring.model.Product;

@SpringBootApplication

public class ReactivespringReactivemongoApplication implements CommandLineRunner {
  @Autowired
  private ProductRepository productRepository;

  public static void main(String[] args) {
    SpringApplication.run(ReactivespringReactivemongoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    productRepository.deleteAll()
        .subscribe(null, null, () ->
          {
            Stream.of(new Product("100", "Samsung", "Phone", 20000L), new Product("200", "LG", "AC", 30000L))
                .forEach(product ->
                  {
                    productRepository.save(product)
                        .subscribe(System.out::println);
                  });
          });
  }

}
