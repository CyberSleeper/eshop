package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
  private static int productIdCounter = 0;
  private String productId;
  private String productName;
  private int productQuantity;

  public Product() {
    productIdCounter++;
    this.productId = String.valueOf(productIdCounter);
  }

  public Product(String id, String name, int quantity) {
    this.productId = id;
    this.productName = name;
    this.productQuantity = quantity;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String id) {
    this.productId = id;
  }
}
