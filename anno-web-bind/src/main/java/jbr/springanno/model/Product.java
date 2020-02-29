package jbr.springanno.model;

public class Product {

  private String name;
  private String category;
  private long price;

  public Product() {
  }

  public Product(String name, String category, long price) {
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}
