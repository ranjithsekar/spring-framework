package jbr.springmvc.shopcart.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

@Component
public class Products {

  @Bean(name = "productList")
  public Map<ProductCategory, List<String>> products() {
    Map<ProductCategory, List<String>> products = new HashMap<>();

    List<String> mobiles = Arrays.asList("Samsung", "Redmi", "LG", "Lenovo", "Realme", "Oppo", "Vivo");
    List<String> headphones = Arrays.asList("Sony", "JBL", "Skullcandy", "Boat");

    products.put(ProductCategory.MOBILE, mobiles);
    products.put(ProductCategory.HEADPHONE, headphones);

    return products;
  }

  
}
