package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
  private static int lastAssignedId = 0;
  private String productId;
  private String productName;
  private int productQuantity;

  private String generateNextId() {
    lastAssignedId++;
    return String.valueOf(lastAssignedId);
  }

  public Product() {
    this.productId = generateNextId();
  }

  public String getProductId() {
    return productId;
  }

  public void setId(String id) {
    this.productId = id;
  }
}
