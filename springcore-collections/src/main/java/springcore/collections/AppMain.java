package springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    Product product = (Product) context.getBean(Product.class);
    System.out.println(product.getProductList());

    System.out.println(product.getProductPrice());
  }

}
