package com.example.WebApp;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldReturnDefaultMessage() throws Exception {
    this.mockMvc.perform(get("/"))

        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, World!")));

  }

  @Test
  public void shouldReturngabrielMessage() throws Exception {
    this.mockMvc.perform(get("/gabriel"))

        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, gabriel!")));

  }

  @Test
  public void shouldReturnramideMessage() throws Exception {
    this.mockMvc.perform(get("/ramide"))

        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, ramide!")));

  }

  @Test
  public void shouldReturncopiaMessage() throws Exception {
    this.mockMvc.perform(get("/copia"))

        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
            .string(containsString("Hello, copia!")));

  }
}