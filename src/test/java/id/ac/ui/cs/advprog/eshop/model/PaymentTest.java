package id.ac.ui.cs.advprog.eshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
  private Payment payment;
  private Order order;

  @BeforeEach
  void setUp() {
    ArrayList<Product> products = new ArrayList<>();
    Product product1 = new Product();
    product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
    product1.setProductName("Sampo Cap Bambang");
    product1.setProductQuantity(2);
    Product product2 = new Product();
    product2.setProductId("a2b3e9f-1c39-460e-8860-71af6af63bd6");
    product2.setProductName("Sampo Cap Usep");
    product2.setProductQuantity(1);
    products.add(product1);
    products.add(product2);
    this.order = new Order("orderId", products, 1708560000L, "Suisei no Copath");
    this.payment = new Payment("paymentId", "method", new HashMap<>(), order);
  }

  @Test
  void testCreatePayment() {
    assertSame(order, payment.getOrder());
    assertEquals("paymentId", payment.getId());
    assertEquals("method", payment.getMethod());
  }

  @Test
  void testCreatePaymentStatus() {
    payment.setStatus("status");
    assertEquals("status", payment.getStatus());
  }

  @Test
  void testCreatePaymentData() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("key", "value");
    payment.setPaymentData(paymentData);
    assertEquals(paymentData, payment.getPaymentData());
  }

  @Test
  void testCreatePaymentDataNull() {
    payment.setPaymentData(null);
    assertEquals(null, payment.getPaymentData());
  }

  @Test
  void testCreatePaymentStatusNull() {
    payment.setStatus(null);
    assertEquals(null, payment.getStatus());
  }

  @Test
  void testCreatePaymentStatusEmpty() {
    payment.setStatus("");
    assertEquals("", payment.getStatus());
  }
}
