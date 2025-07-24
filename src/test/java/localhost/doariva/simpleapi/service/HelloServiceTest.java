package localhost.doariva.simpleapi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("HelloServiceのテスト")
public class HelloServiceTest {

    private HelloService helloService;

    @BeforeEach
    void setUp() {
        helloService = new HelloService();
    }

    @Test
    @DisplayName("helloメソッドが正しい挨拶を返すこと")
    void helloReturnsCorrectGreeting() {
        assertEquals("Hello!", helloService.hello());
    }

    @Test
    @DisplayName("addメソッドが正しい合計値を返すこと")
    void addReturnsCorrectSum() {
        assertEquals(5, helloService.add(2, 3));
        assertEquals(-1, helloService.add(2, -3));
        assertEquals(0, helloService.add(0, 0));
    }

    @Test
    @DisplayName("multiplyメソッドが正しい積を返すこと")
    void multiplyReturnsCorrectProduct() {
        assertEquals(6, helloService.multiply(2, 3));
        assertEquals(-6, helloService.multiply(2, -3));
        assertEquals(0, helloService.multiply(0, 5));
        assertEquals(0, helloService.multiply(5, 0));
    }
}
