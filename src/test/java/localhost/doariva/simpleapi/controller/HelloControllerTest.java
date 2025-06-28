package localhost.doariva.simpleapi.controller;

import localhost.doariva.simpleapi.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HelloService helloService;

    @Test
    void helloReturnsHello() throws Exception {
        when(helloService.hello()).thenReturn("Hello!");
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello!"));
    }

    @Test
    void addReturnsSum() throws Exception {
        when(helloService.add(5, 3)).thenReturn(8);
        mockMvc.perform(get("/add").param("a", "5").param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("8"));
    }

    @Test
    void multiplyReturnsProduct() throws Exception {
        when(helloService.multiply(5, 3)).thenReturn(15);
        mockMvc.perform(get("/multiply").param("a", "5").param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }
}