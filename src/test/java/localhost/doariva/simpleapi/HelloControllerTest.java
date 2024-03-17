package localhost.doariva.simpleapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    private MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello!"));
    }

    @Test
    public void add() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/add").param("a", "1").param("b", "2"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("3"));
    }

    @Test
    public void add_with_invalid_input() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/add").param("a", "1").param("b", "invalid"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}