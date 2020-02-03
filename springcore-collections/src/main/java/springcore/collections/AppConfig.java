package springcore.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Product product() {
    return new Product();
  }

  @Bean
  public List<String> productList() {
    return Arrays.asList("Mobile", "Laptop", "Television");
  }

  @Bean
  public Map<String, Integer> getProductPrice() {
    Map<String, Integer> price = new HashMap<String, Integer>();
    price.put("Mobile", 1000);
    price.put("Laptop", 2000);
    price.put("Television", 2000);
    
    return price;
  }

}