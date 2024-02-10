package id.ac.ui.cs.advprog.eshop.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import id.ac.ui.cs.advprog.eshop.service.ProductService;

@WebMvcTest(ProductController.class)
public class WebMockTest {
  
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ProductService service;

  @Test
  public void testCreateProductPage() throws Exception {
    mockMvc.perform(get("/product/create"))
      .andExpect(status().isOk())
      .andExpect(view().name("createProduct"));
  }
  @Test
  public void testCreateProductPost() throws Exception {
    mockMvc.perform(post("/product/create"))
      .andExpect(status().is3xxRedirection())
      .andExpect(view().name("redirect:list"));
  }
  @Test
  public void testProductListPage() throws Exception {
    mockMvc.perform(get("/product/list"))
      .andExpect(status().isOk())
      .andExpect(view().name("productList"));
  }
}
