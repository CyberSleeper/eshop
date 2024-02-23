package id.ac.ui.cs.advprog.eshop;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import id.ac.ui.cs.advprog.eshop.controller.ProductController;

@SpringBootTest
class EshopApplicationTests {

	@Autowired
  private ProductController productController;

	@Test
	void contextLoads() {
		assertNotNull(productController);
	}

}
