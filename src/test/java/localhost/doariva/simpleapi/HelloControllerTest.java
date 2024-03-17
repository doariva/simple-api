package localhost.doariva.simpleapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    void hello() {
        String result = helloController.hello();
        assertThat(result).isEqualTo("Hello!");
    }

    @Test
    void add() {
        int result = helloController.add(1, 2);
        assertThat(result).isEqualTo(3);
    }
}