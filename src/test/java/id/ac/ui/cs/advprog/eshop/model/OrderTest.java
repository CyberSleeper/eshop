package id.ac.ui.cs.advprog.eshop.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
  private List<Product> products;
  @BeforeEach
  void setUp() {
    this.products = new ArrayList<>();
    Product product1 = new Product();
    product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
    product1.setProductName("Sampo Cap Bambang");
    product1.setProductQuantity(2);
    Product product2 = new Product();
    product2.setProductId("a2b3e9f-1c39-460e-8860-71af6af63bd6");
    product2.setProductName("Sampo Cap Usep");
    product2.setProductQuantity(1);
    this.products.add(product1);
    this.products.add(product2);
  }

  @Test
  void testCreateOrderEmptyProduct() {
    this.products.clear();

    assertThrows(IllegalArgumentException.class, () -> {
      Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
        this.products, 1708560000L, "Suisei no Copath");
    });

  }

  @Test
  void testCreateOrderDefaultStatus() {
    Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
      this.products, 1708560000L, "Suisei no Copath");
    assertSame(this.products, order.getProducts());
    assertEquals(2, order.getProducts().size());
    assertEquals("Sampo Cap Bambang", order.getProducts().get(0).getProductName());
    assertEquals("Sampo Cap Usep", order.getProducts().get(1).getProductName());

    assertEquals("eb558e9f-1c39-460e-8860-71af6af63bd6", order.getId());
    assertEquals(1708560000L, order.getOrderTime());
    assertEquals("Suisei no Copath", order.getAuthor());
    assertEquals("WAITING_PAYMENT", order.getStatus());
  }

  @Test
  void testCreateOrderSuccessStatus() {
    Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
      this.products, 1708560000L, "Suisei no Copath", "SUCCESS");
    assertEquals(this.products, order.getProducts());
  }

  @Test
  void testCreateOrderInvalidStatus() {
    assertThrows(IllegalArgumentException.class, () -> {
      Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
        this.products, 1708560000L, "Suisei no Copath", "SUPA NEEGGAAA");
    });
  }

  @Test
  void testSetStatusToCanceled() {
    Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
      this.products, 1708560000L, "Suisei no Copath", "SUCCESS");
    order.setStatus("CANCELED");
    assertEquals("CANCELED", order.getStatus());
  }

  @Test
  void testSetStatusToInvalidStatus() {
    Order order = new Order("eb558e9f-1c39-460e-8860-71af6af63bd6", 
      this.products, 1708560000L, "Suisei no Copath");
    assertThrows(IllegalArgumentException.class, () -> order.setStatus("SUPA NEEGGAAA"));
  }
}
