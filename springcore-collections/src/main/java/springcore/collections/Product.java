package springcore.collections;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
  @Autowired
  private List<String> productList;

  @Autowired
  private Map<String, Integer> productPrice;

  public List<String> getProductList() {
    return productList;
  }

  public Map<String, Integer> getProductPrice() {
    return productPrice;
  }
}
