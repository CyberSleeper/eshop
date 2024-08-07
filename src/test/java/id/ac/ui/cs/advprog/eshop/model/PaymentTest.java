package id.ac.ui.cs.advprog.eshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;

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
  }

  @Test
  void testCreatePaymentWithNullOrder() {
    assertThrows(IllegalArgumentException.class, () -> {
      Map<String, String> paymentData = new HashMap<>();
      paymentData.put("voucherCode", "ESHOP1234567890123");
      this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, null);
    });
  }

  @Test
  void testCreatePaymentWithNullPaymentData() {
    assertThrows(IllegalArgumentException.class, () -> {
      this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), null, this.order);
    });
  }

  @Test
  void testCreatePaymentWithInvalidVoucherCode() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP123");
    assertThrows(IllegalArgumentException.class, () -> {
      this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, this.order);
    });
  }

  @Test
  void testCreatePaymentWithInvalidPaymentMethod() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP12345678901");
    assertThrows(IllegalArgumentException.class, () -> {
      this.payment = new Payment("paymentId", "INVALID", paymentData, this.order);
    });
  }

  @Test
  void testCreatePaymentWithSuccessStatus() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP12345678901");
    this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, this.order);
    this.payment.setStatus(PaymentStatus.SUCCESS.getValue());
    assertEquals(PaymentStatus.SUCCESS.getValue(), this.payment.getStatus());

  }

  @Test
  void testCreatePaymentWithRejectedStatus() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP12345678901");
    this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, this.order);
    this.payment.setStatus(PaymentStatus.REJECTED.getValue());
    assertEquals(PaymentStatus.REJECTED.getValue(), this.payment.getStatus());
    assertEquals(OrderStatus.FAILED.getValue(), this.order.getStatus());
  }

  @Test
  void testCreatePaymentWithInvalidStatus() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP12345678901");
    this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, this.order);
    assertThrows(IllegalArgumentException.class, () -> {
      this.payment.setStatus("INVALID");
    });
  }

  @Test
  void testCreatePaymentWithInvalidMethod() {
    Map<String, String> paymentData = new HashMap<>();
    paymentData.put("voucherCode", "ESHOP12345678901");
    this.payment = new Payment("paymentId", PaymentMethod.VOUCHER.getValue(), paymentData, this.order);
    assertThrows(IllegalArgumentException.class, () -> {
      this.payment.setMethod("INVALID");
    });
  }
}
