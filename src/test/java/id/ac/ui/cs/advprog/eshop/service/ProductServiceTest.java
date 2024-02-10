package id.ac.ui.cs.advprog.eshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

  @InjectMocks
  private ProductRepository productRepository;
  
  @InjectMocks
  private ProductServiceImpl productService;

  @Test
  void testCreate() {
    Product product = new Product("1", "Product 1", 100);
    Product response = productService.create(product);
    assertEquals(product, response);
  }
  @Test
  void testFindAll() {
    Product product1 = new Product("1", "Product 1", 100);
    Product product2 = new Product("2", "Product 2", 100);
    Product product3 = new Product("3", "Product 3", 100);
    productService.create(product1);
    productService.create(product2);
    productService.create(product3);

    List<Product> products = productService.findAll();

    assertEquals(3, products.size());
  }
  @Test
  void testFindById() {
    Product product = new Product("1", "Product 1", 100);
    productService.create(product);

    Product response = productService.findById("1");

    assertEquals(product, response);
  }
  @Test
  void testEdit() {
    Product product = new Product("1", "Product 1", 100);
    productService.create(product);

    Product newProduct = new Product("1", "Product 1", 200);
    Product response = productService.edit(newProduct);

    assertEquals(newProduct, response);
  }
  @Test
  void testDelete() {
    Product product = new Product("1", "Product 1", 100);
    productService.create(product);

    Product response = productService.delete("1");

    assertEquals(product, response);
  }

}
