package jbr.reactivespring.model;

import java.util.Date;

public class ProductEvent {

  private Product product;
  private Date date;

  public ProductEvent(Product product, Date date) {
    this.product = product;
    this.date = date;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
