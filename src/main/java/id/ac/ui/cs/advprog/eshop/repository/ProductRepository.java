package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
  private List<Product> productData = new ArrayList<>();

  public Product create(Product product) {
    productData.add(product);
    return product;
  }

  public Iterator<Product> findAll() {
    return productData.iterator();
  }

  public Product delete(String productId) {
    Product product = productData.stream()
            .filter(p -> p.getId().equals(productId))
            .findFirst()
            .orElse(null);
    productData.remove(product);
    return product;
  }
}
